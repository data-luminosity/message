#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException

from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None


class SensorType:
  LOCATION = 0
  GYROSCOPE = 1
  ACCELEROMETER = 2
  MAGNETOMETER = 3
  PROXIMITY = 4
  BRIGHTNESS = 5
  SOUNDLEVEL = 6

  _VALUES_TO_NAMES = {
    0: "LOCATION",
    1: "GYROSCOPE",
    2: "ACCELEROMETER",
    3: "MAGNETOMETER",
    4: "PROXIMITY",
    5: "BRIGHTNESS",
    6: "SOUNDLEVEL",
  }

  _NAMES_TO_VALUES = {
    "LOCATION": 0,
    "GYROSCOPE": 1,
    "ACCELEROMETER": 2,
    "MAGNETOMETER": 3,
    "PROXIMITY": 4,
    "BRIGHTNESS": 5,
    "SOUNDLEVEL": 6,
  }

class MatchingType:
  LOCATION_MATCHING = 0
  NUMERICAL_MATCHING = 1
  STRING_MATCHING = 2

  _VALUES_TO_NAMES = {
    0: "LOCATION_MATCHING",
    1: "NUMERICAL_MATCHING",
    2: "STRING_MATCHING",
  }

  _NAMES_TO_VALUES = {
    "LOCATION_MATCHING": 0,
    "NUMERICAL_MATCHING": 1,
    "STRING_MATCHING": 2,
  }


class QueryVector:
  """
  Attributes:
   - querytype
   - matchingtype
   - ranges
  """

  thrift_spec = (
    None, # 0
    (1, TType.I32, 'querytype', None, None, ), # 1
    (2, TType.I32, 'matchingtype', None, None, ), # 2
    (3, TType.LIST, 'ranges', (TType.STRING,None), None, ), # 3
  )

  def __init__(self, querytype=None, matchingtype=None, ranges=None,):
    self.querytype = querytype
    self.matchingtype = matchingtype
    self.ranges = ranges

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.I32:
          self.querytype = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I32:
          self.matchingtype = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.LIST:
          self.ranges = []
          (_etype3, _size0) = iprot.readListBegin()
          for _i4 in xrange(_size0):
            _elem5 = iprot.readString()
            self.ranges.append(_elem5)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('QueryVector')
    if self.querytype is not None:
      oprot.writeFieldBegin('querytype', TType.I32, 1)
      oprot.writeI32(self.querytype)
      oprot.writeFieldEnd()
    if self.matchingtype is not None:
      oprot.writeFieldBegin('matchingtype', TType.I32, 2)
      oprot.writeI32(self.matchingtype)
      oprot.writeFieldEnd()
    if self.ranges is not None:
      oprot.writeFieldBegin('ranges', TType.LIST, 3)
      oprot.writeListBegin(TType.STRING, len(self.ranges))
      for iter6 in self.ranges:
        oprot.writeString(iter6)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.querytype)
    value = (value * 31) ^ hash(self.matchingtype)
    value = (value * 31) ^ hash(self.ranges)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class Query:
  """
  Attributes:
   - analystId
   - queryId
   - queryStartTime
   - queryEndTime
   - epoch
   - queryType
   - epsilon
   - queryVector
   - p
   - q
   - versionId
  """

  thrift_spec = (
    None, # 0
    (1, TType.I64, 'analystId', None, None, ), # 1
    (2, TType.I64, 'queryId', None, None, ), # 2
    (3, TType.I64, 'queryStartTime', None, None, ), # 3
    (4, TType.I64, 'queryEndTime', None, None, ), # 4
    (5, TType.I64, 'epoch', None, None, ), # 5
    (6, TType.I32, 'queryType', None, None, ), # 6
    (7, TType.DOUBLE, 'epsilon', None, None, ), # 7
    (8, TType.STRUCT, 'queryVector', (QueryVector, QueryVector.thrift_spec), None, ), # 8
    (9, TType.STRING, 'p', None, None, ), # 9
    (10, TType.STRING, 'q', None, None, ), # 10
    (11, TType.I64, 'versionId', None, None, ), # 11
  )

  def __init__(self, analystId=None, queryId=None, queryStartTime=None, queryEndTime=None, epoch=None, queryType=None, epsilon=None, queryVector=None, p=None, q=None, versionId=None,):
    self.analystId = analystId
    self.queryId = queryId
    self.queryStartTime = queryStartTime
    self.queryEndTime = queryEndTime
    self.epoch = epoch
    self.queryType = queryType
    self.epsilon = epsilon
    self.queryVector = queryVector
    self.p = p
    self.q = q
    self.versionId = versionId

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.I64:
          self.analystId = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I64:
          self.queryId = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.I64:
          self.queryStartTime = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I64:
          self.queryEndTime = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.I64:
          self.epoch = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.I32:
          self.queryType = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.DOUBLE:
          self.epsilon = iprot.readDouble()
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.STRUCT:
          self.queryVector = QueryVector()
          self.queryVector.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 9:
        if ftype == TType.STRING:
          self.p = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 10:
        if ftype == TType.STRING:
          self.q = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 11:
        if ftype == TType.I64:
          self.versionId = iprot.readI64()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('Query')
    if self.analystId is not None:
      oprot.writeFieldBegin('analystId', TType.I64, 1)
      oprot.writeI64(self.analystId)
      oprot.writeFieldEnd()
    if self.queryId is not None:
      oprot.writeFieldBegin('queryId', TType.I64, 2)
      oprot.writeI64(self.queryId)
      oprot.writeFieldEnd()
    if self.queryStartTime is not None:
      oprot.writeFieldBegin('queryStartTime', TType.I64, 3)
      oprot.writeI64(self.queryStartTime)
      oprot.writeFieldEnd()
    if self.queryEndTime is not None:
      oprot.writeFieldBegin('queryEndTime', TType.I64, 4)
      oprot.writeI64(self.queryEndTime)
      oprot.writeFieldEnd()
    if self.epoch is not None:
      oprot.writeFieldBegin('epoch', TType.I64, 5)
      oprot.writeI64(self.epoch)
      oprot.writeFieldEnd()
    if self.queryType is not None:
      oprot.writeFieldBegin('queryType', TType.I32, 6)
      oprot.writeI32(self.queryType)
      oprot.writeFieldEnd()
    if self.epsilon is not None:
      oprot.writeFieldBegin('epsilon', TType.DOUBLE, 7)
      oprot.writeDouble(self.epsilon)
      oprot.writeFieldEnd()
    if self.queryVector is not None:
      oprot.writeFieldBegin('queryVector', TType.STRUCT, 8)
      self.queryVector.write(oprot)
      oprot.writeFieldEnd()
    if self.p is not None:
      oprot.writeFieldBegin('p', TType.STRING, 9)
      oprot.writeString(self.p)
      oprot.writeFieldEnd()
    if self.q is not None:
      oprot.writeFieldBegin('q', TType.STRING, 10)
      oprot.writeString(self.q)
      oprot.writeFieldEnd()
    if self.versionId is not None:
      oprot.writeFieldBegin('versionId', TType.I64, 11)
      oprot.writeI64(self.versionId)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.analystId)
    value = (value * 31) ^ hash(self.queryId)
    value = (value * 31) ^ hash(self.queryStartTime)
    value = (value * 31) ^ hash(self.queryEndTime)
    value = (value * 31) ^ hash(self.epoch)
    value = (value * 31) ^ hash(self.queryType)
    value = (value * 31) ^ hash(self.epsilon)
    value = (value * 31) ^ hash(self.queryVector)
    value = (value * 31) ^ hash(self.p)
    value = (value * 31) ^ hash(self.q)
    value = (value * 31) ^ hash(self.versionId)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)
