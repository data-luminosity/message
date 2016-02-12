# GNU GENERAL PUBLIC LICENSE
# Version 2, June 1991
# Copyright (C) 1989, 1991 Free Software Foundation, Inc., <http://fsf.org/>
# 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
# Everyone is permitted to copy and distribute verbatim copies
# of this license document, but changing it is not allowed.

import sys
from query_privateanswer import Query
from query_privateanswer.Query import ttypes
from query_privateanswer.Query.ttypes import QueryVector, Query, SensorType, MatchingType

from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol

import base64

import csv

import pysodium

SERVER_HOST=sys.argv[1]
DBNAME=sys.argv[2]
DBUSER=sys.argv[3]
TOPIC="queriesv2"

queryvector = QueryVector()
queryvector.ranges = []
#read in csv
with open('poi.csv', 'rb') as csvfile:
    poireader = csv.reader(csvfile, delimiter=',')
    for row in poireader: 
        #print(row[0],row[1],row[2])
        val="%s,%s,%s,%s" % (row[1],row[2],row[3],row[6])
        queryvector.ranges.append(val)

from datetime import datetime
import time
dt=datetime.now()
startts=time.mktime(dt.timetuple())

dt = datetime(2016, 12, 25, 23, 23)
endts=time.mktime(dt.timetuple())

query = Query()
query.analystId=1
query.queryId=1
query.queryStartTime=startts
query.queryEndTime=endts
query.epoch=5000
query.sensorType = SensorType.LOCATION
query.matchingType = MatchingType.LOCATION_MATCHING
query.queryVector=queryvector
query.epsilon=0.005
query.flipOne="0.8"
query.flipTwo="0.4"
query.versionId=2

print(query)


transportOut = TTransport.TMemoryBuffer()
protocolOut = TBinaryProtocol.TBinaryProtocol(transportOut)
query.write(protocolOut)
bytes = transportOut.getvalue()

sign_pk=None
sign_sk=None
with open("keys/sign_public.key", "rb") as in_file:
    sign_pk = in_file.read()
with open("keys/sign_private.key", "rb") as in_file:
    sign_sk = in_file.read()

signed = pysodium.crypto_sign(bytes, sign_sk)
base64bytes=base64.b64encode(signed)

#assert can verify and de-serialize
recoveredbytes=base64.b64decode(base64bytes)
plaintextbytes=pysodium.crypto_sign_open(recoveredbytes, sign_pk)
transportIn = TTransport.TMemoryBuffer(plaintextbytes)
protocolIn = TBinaryProtocol.TBinaryProtocol(transportIn)
recoveredqueries = Query()
recoveredqueries.read(protocolIn)
print(recoveredqueries)

import psycopg2
import psycopg2.extras
try:
    conn = psycopg2.connect("dbname='%s' user='%s' host='%s' " % (DBNAME,DBUSER,SERVER_HOST))
except:
    print "I am unable to connect to the database"

cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)
tabledict = ({"tablename":"trafficdata_query"})
namedict = ({"queryvalue":base64bytes, "version_number":query.versionId, "query_id":query.queryId, "analyst_id":query.analystId})

querystring1="INSERT INTO %(tablename)s" % tabledict
querystring2="(queryvalue,version_number,query_id,analyst_id) VALUES (%(queryvalue)s, %(version_number)s, %(query_id)s, %(analyst_id)s)"
querystring=querystring1+querystring2
print querystring
cur.execute(querystring,namedict)
conn.commit()

