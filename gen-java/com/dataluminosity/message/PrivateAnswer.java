/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dataluminosity.message;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-24")
public class PrivateAnswer implements org.apache.thrift.TBase<PrivateAnswer, PrivateAnswer._Fields>, java.io.Serializable, Cloneable, Comparable<PrivateAnswer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrivateAnswer");

  private static final org.apache.thrift.protocol.TField ANALYST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("analystId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("queryId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PRIVATE_ANSWER_BITS_FIELD_DESC = new org.apache.thrift.protocol.TField("privateAnswerBits", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BITLEN_FIELD_DESC = new org.apache.thrift.protocol.TField("bitlen", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField JOIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("joinId", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PrivateAnswerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PrivateAnswerTupleSchemeFactory());
  }

  public long analystId; // required
  public long queryId; // required
  public ByteBuffer privateAnswerBits; // required
  public int bitlen; // required
  public long joinId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ANALYST_ID((short)1, "analystId"),
    QUERY_ID((short)2, "queryId"),
    PRIVATE_ANSWER_BITS((short)3, "privateAnswerBits"),
    BITLEN((short)4, "bitlen"),
    JOIN_ID((short)5, "joinId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ANALYST_ID
          return ANALYST_ID;
        case 2: // QUERY_ID
          return QUERY_ID;
        case 3: // PRIVATE_ANSWER_BITS
          return PRIVATE_ANSWER_BITS;
        case 4: // BITLEN
          return BITLEN;
        case 5: // JOIN_ID
          return JOIN_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ANALYSTID_ISSET_ID = 0;
  private static final int __QUERYID_ISSET_ID = 1;
  private static final int __BITLEN_ISSET_ID = 2;
  private static final int __JOINID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ANALYST_ID, new org.apache.thrift.meta_data.FieldMetaData("analystId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("queryId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PRIVATE_ANSWER_BITS, new org.apache.thrift.meta_data.FieldMetaData("privateAnswerBits", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.BITLEN, new org.apache.thrift.meta_data.FieldMetaData("bitlen", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JOIN_ID, new org.apache.thrift.meta_data.FieldMetaData("joinId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrivateAnswer.class, metaDataMap);
  }

  public PrivateAnswer() {
  }

  public PrivateAnswer(
    long analystId,
    long queryId,
    ByteBuffer privateAnswerBits,
    int bitlen,
    long joinId)
  {
    this();
    this.analystId = analystId;
    setAnalystIdIsSet(true);
    this.queryId = queryId;
    setQueryIdIsSet(true);
    this.privateAnswerBits = org.apache.thrift.TBaseHelper.copyBinary(privateAnswerBits);
    this.bitlen = bitlen;
    setBitlenIsSet(true);
    this.joinId = joinId;
    setJoinIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrivateAnswer(PrivateAnswer other) {
    __isset_bitfield = other.__isset_bitfield;
    this.analystId = other.analystId;
    this.queryId = other.queryId;
    if (other.isSetPrivateAnswerBits()) {
      this.privateAnswerBits = org.apache.thrift.TBaseHelper.copyBinary(other.privateAnswerBits);
    }
    this.bitlen = other.bitlen;
    this.joinId = other.joinId;
  }

  public PrivateAnswer deepCopy() {
    return new PrivateAnswer(this);
  }

  @Override
  public void clear() {
    setAnalystIdIsSet(false);
    this.analystId = 0;
    setQueryIdIsSet(false);
    this.queryId = 0;
    this.privateAnswerBits = null;
    setBitlenIsSet(false);
    this.bitlen = 0;
    setJoinIdIsSet(false);
    this.joinId = 0;
  }

  public long getAnalystId() {
    return this.analystId;
  }

  public PrivateAnswer setAnalystId(long analystId) {
    this.analystId = analystId;
    setAnalystIdIsSet(true);
    return this;
  }

  public void unsetAnalystId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ANALYSTID_ISSET_ID);
  }

  /** Returns true if field analystId is set (has been assigned a value) and false otherwise */
  public boolean isSetAnalystId() {
    return EncodingUtils.testBit(__isset_bitfield, __ANALYSTID_ISSET_ID);
  }

  public void setAnalystIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ANALYSTID_ISSET_ID, value);
  }

  public long getQueryId() {
    return this.queryId;
  }

  public PrivateAnswer setQueryId(long queryId) {
    this.queryId = queryId;
    setQueryIdIsSet(true);
    return this;
  }

  public void unsetQueryId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUERYID_ISSET_ID);
  }

  /** Returns true if field queryId is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryId() {
    return EncodingUtils.testBit(__isset_bitfield, __QUERYID_ISSET_ID);
  }

  public void setQueryIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUERYID_ISSET_ID, value);
  }

  public byte[] getPrivateAnswerBits() {
    setPrivateAnswerBits(org.apache.thrift.TBaseHelper.rightSize(privateAnswerBits));
    return privateAnswerBits == null ? null : privateAnswerBits.array();
  }

  public ByteBuffer bufferForPrivateAnswerBits() {
    return org.apache.thrift.TBaseHelper.copyBinary(privateAnswerBits);
  }

  public PrivateAnswer setPrivateAnswerBits(byte[] privateAnswerBits) {
    this.privateAnswerBits = privateAnswerBits == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(privateAnswerBits, privateAnswerBits.length));
    return this;
  }

  public PrivateAnswer setPrivateAnswerBits(ByteBuffer privateAnswerBits) {
    this.privateAnswerBits = org.apache.thrift.TBaseHelper.copyBinary(privateAnswerBits);
    return this;
  }

  public void unsetPrivateAnswerBits() {
    this.privateAnswerBits = null;
  }

  /** Returns true if field privateAnswerBits is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivateAnswerBits() {
    return this.privateAnswerBits != null;
  }

  public void setPrivateAnswerBitsIsSet(boolean value) {
    if (!value) {
      this.privateAnswerBits = null;
    }
  }

  public int getBitlen() {
    return this.bitlen;
  }

  public PrivateAnswer setBitlen(int bitlen) {
    this.bitlen = bitlen;
    setBitlenIsSet(true);
    return this;
  }

  public void unsetBitlen() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BITLEN_ISSET_ID);
  }

  /** Returns true if field bitlen is set (has been assigned a value) and false otherwise */
  public boolean isSetBitlen() {
    return EncodingUtils.testBit(__isset_bitfield, __BITLEN_ISSET_ID);
  }

  public void setBitlenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BITLEN_ISSET_ID, value);
  }

  public long getJoinId() {
    return this.joinId;
  }

  public PrivateAnswer setJoinId(long joinId) {
    this.joinId = joinId;
    setJoinIdIsSet(true);
    return this;
  }

  public void unsetJoinId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JOINID_ISSET_ID);
  }

  /** Returns true if field joinId is set (has been assigned a value) and false otherwise */
  public boolean isSetJoinId() {
    return EncodingUtils.testBit(__isset_bitfield, __JOINID_ISSET_ID);
  }

  public void setJoinIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JOINID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ANALYST_ID:
      if (value == null) {
        unsetAnalystId();
      } else {
        setAnalystId((Long)value);
      }
      break;

    case QUERY_ID:
      if (value == null) {
        unsetQueryId();
      } else {
        setQueryId((Long)value);
      }
      break;

    case PRIVATE_ANSWER_BITS:
      if (value == null) {
        unsetPrivateAnswerBits();
      } else {
        setPrivateAnswerBits((ByteBuffer)value);
      }
      break;

    case BITLEN:
      if (value == null) {
        unsetBitlen();
      } else {
        setBitlen((Integer)value);
      }
      break;

    case JOIN_ID:
      if (value == null) {
        unsetJoinId();
      } else {
        setJoinId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ANALYST_ID:
      return getAnalystId();

    case QUERY_ID:
      return getQueryId();

    case PRIVATE_ANSWER_BITS:
      return getPrivateAnswerBits();

    case BITLEN:
      return getBitlen();

    case JOIN_ID:
      return getJoinId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ANALYST_ID:
      return isSetAnalystId();
    case QUERY_ID:
      return isSetQueryId();
    case PRIVATE_ANSWER_BITS:
      return isSetPrivateAnswerBits();
    case BITLEN:
      return isSetBitlen();
    case JOIN_ID:
      return isSetJoinId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PrivateAnswer)
      return this.equals((PrivateAnswer)that);
    return false;
  }

  public boolean equals(PrivateAnswer that) {
    if (that == null)
      return false;

    boolean this_present_analystId = true;
    boolean that_present_analystId = true;
    if (this_present_analystId || that_present_analystId) {
      if (!(this_present_analystId && that_present_analystId))
        return false;
      if (this.analystId != that.analystId)
        return false;
    }

    boolean this_present_queryId = true;
    boolean that_present_queryId = true;
    if (this_present_queryId || that_present_queryId) {
      if (!(this_present_queryId && that_present_queryId))
        return false;
      if (this.queryId != that.queryId)
        return false;
    }

    boolean this_present_privateAnswerBits = true && this.isSetPrivateAnswerBits();
    boolean that_present_privateAnswerBits = true && that.isSetPrivateAnswerBits();
    if (this_present_privateAnswerBits || that_present_privateAnswerBits) {
      if (!(this_present_privateAnswerBits && that_present_privateAnswerBits))
        return false;
      if (!this.privateAnswerBits.equals(that.privateAnswerBits))
        return false;
    }

    boolean this_present_bitlen = true;
    boolean that_present_bitlen = true;
    if (this_present_bitlen || that_present_bitlen) {
      if (!(this_present_bitlen && that_present_bitlen))
        return false;
      if (this.bitlen != that.bitlen)
        return false;
    }

    boolean this_present_joinId = true;
    boolean that_present_joinId = true;
    if (this_present_joinId || that_present_joinId) {
      if (!(this_present_joinId && that_present_joinId))
        return false;
      if (this.joinId != that.joinId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_analystId = true;
    list.add(present_analystId);
    if (present_analystId)
      list.add(analystId);

    boolean present_queryId = true;
    list.add(present_queryId);
    if (present_queryId)
      list.add(queryId);

    boolean present_privateAnswerBits = true && (isSetPrivateAnswerBits());
    list.add(present_privateAnswerBits);
    if (present_privateAnswerBits)
      list.add(privateAnswerBits);

    boolean present_bitlen = true;
    list.add(present_bitlen);
    if (present_bitlen)
      list.add(bitlen);

    boolean present_joinId = true;
    list.add(present_joinId);
    if (present_joinId)
      list.add(joinId);

    return list.hashCode();
  }

  @Override
  public int compareTo(PrivateAnswer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAnalystId()).compareTo(other.isSetAnalystId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnalystId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.analystId, other.analystId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryId()).compareTo(other.isSetQueryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryId, other.queryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrivateAnswerBits()).compareTo(other.isSetPrivateAnswerBits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivateAnswerBits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privateAnswerBits, other.privateAnswerBits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBitlen()).compareTo(other.isSetBitlen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBitlen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bitlen, other.bitlen);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJoinId()).compareTo(other.isSetJoinId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJoinId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.joinId, other.joinId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PrivateAnswer(");
    boolean first = true;

    sb.append("analystId:");
    sb.append(this.analystId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryId:");
    sb.append(this.queryId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("privateAnswerBits:");
    if (this.privateAnswerBits == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.privateAnswerBits, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bitlen:");
    sb.append(this.bitlen);
    first = false;
    if (!first) sb.append(", ");
    sb.append("joinId:");
    sb.append(this.joinId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrivateAnswerStandardSchemeFactory implements SchemeFactory {
    public PrivateAnswerStandardScheme getScheme() {
      return new PrivateAnswerStandardScheme();
    }
  }

  private static class PrivateAnswerStandardScheme extends StandardScheme<PrivateAnswer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PrivateAnswer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ANALYST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.analystId = iprot.readI64();
              struct.setAnalystIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.queryId = iprot.readI64();
              struct.setQueryIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRIVATE_ANSWER_BITS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.privateAnswerBits = iprot.readBinary();
              struct.setPrivateAnswerBitsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BITLEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bitlen = iprot.readI32();
              struct.setBitlenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // JOIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.joinId = iprot.readI64();
              struct.setJoinIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PrivateAnswer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ANALYST_ID_FIELD_DESC);
      oprot.writeI64(struct.analystId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
      oprot.writeI64(struct.queryId);
      oprot.writeFieldEnd();
      if (struct.privateAnswerBits != null) {
        oprot.writeFieldBegin(PRIVATE_ANSWER_BITS_FIELD_DESC);
        oprot.writeBinary(struct.privateAnswerBits);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(BITLEN_FIELD_DESC);
      oprot.writeI32(struct.bitlen);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JOIN_ID_FIELD_DESC);
      oprot.writeI64(struct.joinId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrivateAnswerTupleSchemeFactory implements SchemeFactory {
    public PrivateAnswerTupleScheme getScheme() {
      return new PrivateAnswerTupleScheme();
    }
  }

  private static class PrivateAnswerTupleScheme extends TupleScheme<PrivateAnswer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrivateAnswer struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAnalystId()) {
        optionals.set(0);
      }
      if (struct.isSetQueryId()) {
        optionals.set(1);
      }
      if (struct.isSetPrivateAnswerBits()) {
        optionals.set(2);
      }
      if (struct.isSetBitlen()) {
        optionals.set(3);
      }
      if (struct.isSetJoinId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAnalystId()) {
        oprot.writeI64(struct.analystId);
      }
      if (struct.isSetQueryId()) {
        oprot.writeI64(struct.queryId);
      }
      if (struct.isSetPrivateAnswerBits()) {
        oprot.writeBinary(struct.privateAnswerBits);
      }
      if (struct.isSetBitlen()) {
        oprot.writeI32(struct.bitlen);
      }
      if (struct.isSetJoinId()) {
        oprot.writeI64(struct.joinId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrivateAnswer struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.analystId = iprot.readI64();
        struct.setAnalystIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.queryId = iprot.readI64();
        struct.setQueryIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.privateAnswerBits = iprot.readBinary();
        struct.setPrivateAnswerBitsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.bitlen = iprot.readI32();
        struct.setBitlenIsSet(true);
      }
      if (incoming.get(4)) {
        struct.joinId = iprot.readI64();
        struct.setJoinIdIsSet(true);
      }
    }
  }

}

