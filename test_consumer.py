# GNU GENERAL PUBLIC LICENSE
# Version 2, June 1991
# Copyright (C) 1989, 1991 Free Software Foundation, Inc., <http://fsf.org/>
# 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
# Everyone is permitted to copy and distribute verbatim copies
# of this license document, but changing it is not allowed.

from kafka.client import KafkaClient
from kafka.consumer import SimpleConsumer

import sys, glob
sys.path.append('gen-py')

from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
import base64

from Query.ttypes import *

kafka = KafkaClient("localhost:9092")

print("After connecting to kafka")

topic="topic"

consumer = SimpleConsumer(kafka, "my-group", topic)

for message in consumer:
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

