# GNU GENERAL PUBLIC LICENSE
# Version 2, June 1991
# Copyright (C) 1989, 1991 Free Software Foundation, Inc., <http://fsf.org/>
# 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
# Everyone is permitted to copy and distribute verbatim copies
# of this license document, but changing it is not allowed.

import sys, glob
sys.path.append('gen-py')

from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol

import base64

import Query
from Query.ttypes import *

SERVER_HOST=sys.argv[1]
TOPIC="queriesv2"

queryvector = QueryVector()
queryvector.ranges = []
queryvector.ranges.append("34.069077, -118.445176,5") #Boelter Hall
queryvector.ranges.append("34.074158, -118.443517,5") #Anderson
queryvector.ranges.append("34.059703, -118.445056,5") #Yogurtland

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
query.epoch=60000
query.sensorType = SensorType.LOCATION
query.matchingType = MatchingType.LOCATION_MATCHING
query.queryVector=queryvector
query.epsilon=0.005
query.flipOne="0.8"
query.flipTwo="0.4"
query.versionId=1


transportOut = TTransport.TMemoryBuffer()
protocolOut = TBinaryProtocol.TBinaryProtocol(transportOut)
query.write(protocolOut)
bytes = transportOut.getvalue()
base64bytes=base64.b64encode(bytes)

import requests
payload = {'topic':TOPIC, 'message':base64bytes, 'key':'0'}
url='http://%s/api/message' % (SERVER_HOST)
r = requests.post(url,data=payload)
print r.status_code
print r.text
