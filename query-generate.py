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

import os

locationqueryvector = QueryVector()
locationqueryvector.ranges = []
#read in csv
with open('poi.csv', 'rb') as csvfile:
    poireader = csv.reader(csvfile, delimiter=',')
    for row in poireader: 
        #lat,long,radius,name
        val="%s,%s,%s,%s" % (row[1],row[2],row[3],row[4])
        print(val)
        locationqueryvector.ranges.append(val)

batterylevelqueryvector = QueryVector()
batterylevelqueryvector.ranges = []
for i in xrange(1,100,10):
    start=i
    end=i+9
    val="%d,%d" % (start,end)
    batterylevelqueryvector.ranges.append(val)

celldataqueryvector = QueryVector()
celldataqueryvector.ranges = []
#MB
for i in xrange(1,2000,100):
    start=i
    end=i+99
    val="%d,%d" % (start,end)
    celldataqueryvector.ranges.append(val)

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
query.epoch=300000

query.sensorType = SensorType.LOCATION
query.matchingType = MatchingType.LOCATION_MATCHING
query.queryVector=locationqueryvector

query.sensorType = SensorType.BATTERYLEVEL
query.matchingType = MatchingType.NUMERICAL_MATCHING
query.queryVector=batterylevelqueryvector

query.sensorType = SensorType.CELLDATAUSAGE
query.matchingType = MatchingType.NUMERICAL_MATCHING
query.queryVector=celldataqueryvector

query.epsilon=0.005
query.flipOne="0.8"
query.flipTwo="0.4"
query.versionId=3

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

queryFile = open ("queries/ucla.query", "wb")
querybytearray=bytearray(base64bytes)
queryFile.write(querybytearray)


keyfile=os.path.join(".","keys/sign_public.key")
with open(keyfile, "rb") as in_file:
    sign_pk = in_file.read()

queryFile = open("queries/ucla.query", "rb")
querybytearray = queryFile.read()
recoveredbytes=base64.b64decode(querybytearray)
bytes=pysodium.crypto_sign_open(recoveredbytes, sign_pk)
transportIn = TTransport.TMemoryBuffer(bytes)
protocolIn = TBinaryProtocol.TBinaryProtocol(transportIn)
from query_privateanswer.Query import ttypes
from query_privateanswer.Query.ttypes import Query as Q
import json
queries = Q()
queries.read(protocolIn)
s=json.dumps(queries, default=lambda o: o.__dict__)

queryjsonFile = open("queries/ucla.query.json", "wb")
queryjsonFile.write(s)



"""
SERVER_HOST=sys.argv[1]
DBNAME=sys.argv[2]
DBUSER=sys.argv[3]

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
"""
