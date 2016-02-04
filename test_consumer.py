# GNU GENERAL PUBLIC LICENSE
# Version 2, June 1991
# Copyright (C) 1989, 1991 Free Software Foundation, Inc., <http://fsf.org/>
# 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
# Everyone is permitted to copy and distribute verbatim copies
# of this license document, but changing it is not allowed.

import sys

from kafka.client import KafkaClient
from kafka.consumer import SimpleConsumer

from query_privateanswer import Query
from query_privateanswer.Query import ttypes
from query_privateanswer.Query.ttypes import QueryVector, Query, SensorType, MatchingType

from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
import base64

topic=""

"""
kafka = KafkaClient("localhost:9092")
consumer = SimpleConsumer(kafka, "my-group", topic)
message = consumer.get_message()
print(message)
print(message.message.value)
bytes=base64.b64decode(message.message.value)
transportIn = TTransport.TMemoryBuffer(bytes)
protocolIn = TBinaryProtocol.TBinaryProtocol(transportIn)
queries = Query()
queries.read(protocolIn)
print(queries)
import json
s=json.dumps(queries, default=lambda o: o.__dict__)
print s
"""

import psycopg2
import psycopg2.extras

SERVER_HOST=sys.argv[1]
DBNAME=sys.argv[2]
DBUSER=sys.argv[3]
TABLE=sys.argv[4]


conn = psycopg2.connect("dbname='%s' user='%s' host='%s' " % (DBNAME,DBUSER,SERVER_HOST))

query="select * from %s order by version_number limit 1" % (TABLE)

cur = conn.cursor(cursor_factory=psycopg2.extras.DictCursor)
cur.execute(query)
rows = cur.fetchall()
for row in rows:
    print(row)

