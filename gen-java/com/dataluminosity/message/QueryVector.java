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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-10")
public class QueryVector implements org.apache.thrift.TBase<QueryVector, QueryVector._Fields>, java.io.Serializable, Cloneable, Comparable<QueryVector> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryVector");

  private static final org.apache.thrift.protocol.TField QUERYTYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("querytype", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MATCHINGTYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("matchingtype", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("ranges", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryVectorStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryVectorTupleSchemeFactory());
  }

  /**
   * 
   * @see SensorType
   */
  public SensorType querytype; // required
  /**
   * 
   * @see MatchingType
   */
  public MatchingType matchingtype; // required
  public List<String> ranges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SensorType
     */
    QUERYTYPE((short)1, "querytype"),
    /**
     * 
     * @see MatchingType
     */
    MATCHINGTYPE((short)2, "matchingtype"),
    RANGES((short)3, "ranges");

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
        case 1: // QUERYTYPE
          return QUERYTYPE;
        case 2: // MATCHINGTYPE
          return MATCHINGTYPE;
        case 3: // RANGES
          return RANGES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERYTYPE, new org.apache.thrift.meta_data.FieldMetaData("querytype", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SensorType.class)));
    tmpMap.put(_Fields.MATCHINGTYPE, new org.apache.thrift.meta_data.FieldMetaData("matchingtype", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MatchingType.class)));
    tmpMap.put(_Fields.RANGES, new org.apache.thrift.meta_data.FieldMetaData("ranges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryVector.class, metaDataMap);
  }

  public QueryVector() {
  }

  public QueryVector(
    SensorType querytype,
    MatchingType matchingtype,
    List<String> ranges)
  {
    this();
    this.querytype = querytype;
    this.matchingtype = matchingtype;
    this.ranges = ranges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryVector(QueryVector other) {
    if (other.isSetQuerytype()) {
      this.querytype = other.querytype;
    }
    if (other.isSetMatchingtype()) {
      this.matchingtype = other.matchingtype;
    }
    if (other.isSetRanges()) {
      List<String> __this__ranges = new ArrayList<String>(other.ranges);
      this.ranges = __this__ranges;
    }
  }

  public QueryVector deepCopy() {
    return new QueryVector(this);
  }

  @Override
  public void clear() {
    this.querytype = null;
    this.matchingtype = null;
    this.ranges = null;
  }

  /**
   * 
   * @see SensorType
   */
  public SensorType getQuerytype() {
    return this.querytype;
  }

  /**
   * 
   * @see SensorType
   */
  public QueryVector setQuerytype(SensorType querytype) {
    this.querytype = querytype;
    return this;
  }

  public void unsetQuerytype() {
    this.querytype = null;
  }

  /** Returns true if field querytype is set (has been assigned a value) and false otherwise */
  public boolean isSetQuerytype() {
    return this.querytype != null;
  }

  public void setQuerytypeIsSet(boolean value) {
    if (!value) {
      this.querytype = null;
    }
  }

  /**
   * 
   * @see MatchingType
   */
  public MatchingType getMatchingtype() {
    return this.matchingtype;
  }

  /**
   * 
   * @see MatchingType
   */
  public QueryVector setMatchingtype(MatchingType matchingtype) {
    this.matchingtype = matchingtype;
    return this;
  }

  public void unsetMatchingtype() {
    this.matchingtype = null;
  }

  /** Returns true if field matchingtype is set (has been assigned a value) and false otherwise */
  public boolean isSetMatchingtype() {
    return this.matchingtype != null;
  }

  public void setMatchingtypeIsSet(boolean value) {
    if (!value) {
      this.matchingtype = null;
    }
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  public java.util.Iterator<String> getRangesIterator() {
    return (this.ranges == null) ? null : this.ranges.iterator();
  }

  public void addToRanges(String elem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<String>();
    }
    this.ranges.add(elem);
  }

  public List<String> getRanges() {
    return this.ranges;
  }

  public QueryVector setRanges(List<String> ranges) {
    this.ranges = ranges;
    return this;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERYTYPE:
      if (value == null) {
        unsetQuerytype();
      } else {
        setQuerytype((SensorType)value);
      }
      break;

    case MATCHINGTYPE:
      if (value == null) {
        unsetMatchingtype();
      } else {
        setMatchingtype((MatchingType)value);
      }
      break;

    case RANGES:
      if (value == null) {
        unsetRanges();
      } else {
        setRanges((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERYTYPE:
      return getQuerytype();

    case MATCHINGTYPE:
      return getMatchingtype();

    case RANGES:
      return getRanges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERYTYPE:
      return isSetQuerytype();
    case MATCHINGTYPE:
      return isSetMatchingtype();
    case RANGES:
      return isSetRanges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryVector)
      return this.equals((QueryVector)that);
    return false;
  }

  public boolean equals(QueryVector that) {
    if (that == null)
      return false;

    boolean this_present_querytype = true && this.isSetQuerytype();
    boolean that_present_querytype = true && that.isSetQuerytype();
    if (this_present_querytype || that_present_querytype) {
      if (!(this_present_querytype && that_present_querytype))
        return false;
      if (!this.querytype.equals(that.querytype))
        return false;
    }

    boolean this_present_matchingtype = true && this.isSetMatchingtype();
    boolean that_present_matchingtype = true && that.isSetMatchingtype();
    if (this_present_matchingtype || that_present_matchingtype) {
      if (!(this_present_matchingtype && that_present_matchingtype))
        return false;
      if (!this.matchingtype.equals(that.matchingtype))
        return false;
    }

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_querytype = true && (isSetQuerytype());
    list.add(present_querytype);
    if (present_querytype)
      list.add(querytype.getValue());

    boolean present_matchingtype = true && (isSetMatchingtype());
    list.add(present_matchingtype);
    if (present_matchingtype)
      list.add(matchingtype.getValue());

    boolean present_ranges = true && (isSetRanges());
    list.add(present_ranges);
    if (present_ranges)
      list.add(ranges);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryVector other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuerytype()).compareTo(other.isSetQuerytype());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuerytype()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.querytype, other.querytype);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMatchingtype()).compareTo(other.isSetMatchingtype());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMatchingtype()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.matchingtype, other.matchingtype);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRanges()).compareTo(other.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ranges, other.ranges);
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
    StringBuilder sb = new StringBuilder("QueryVector(");
    boolean first = true;

    sb.append("querytype:");
    if (this.querytype == null) {
      sb.append("null");
    } else {
      sb.append(this.querytype);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("matchingtype:");
    if (this.matchingtype == null) {
      sb.append("null");
    } else {
      sb.append(this.matchingtype);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ranges:");
    if (this.ranges == null) {
      sb.append("null");
    } else {
      sb.append(this.ranges);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QueryVectorStandardSchemeFactory implements SchemeFactory {
    public QueryVectorStandardScheme getScheme() {
      return new QueryVectorStandardScheme();
    }
  }

  private static class QueryVectorStandardScheme extends StandardScheme<QueryVector> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryVector struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUERYTYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.querytype = com.dataluminosity.message.SensorType.findByValue(iprot.readI32());
              struct.setQuerytypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MATCHINGTYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.matchingtype = com.dataluminosity.message.MatchingType.findByValue(iprot.readI32());
              struct.setMatchingtypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ranges = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.ranges.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRangesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryVector struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.querytype != null) {
        oprot.writeFieldBegin(QUERYTYPE_FIELD_DESC);
        oprot.writeI32(struct.querytype.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.matchingtype != null) {
        oprot.writeFieldBegin(MATCHINGTYPE_FIELD_DESC);
        oprot.writeI32(struct.matchingtype.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.ranges != null) {
        oprot.writeFieldBegin(RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.ranges.size()));
          for (String _iter3 : struct.ranges)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryVectorTupleSchemeFactory implements SchemeFactory {
    public QueryVectorTupleScheme getScheme() {
      return new QueryVectorTupleScheme();
    }
  }

  private static class QueryVectorTupleScheme extends TupleScheme<QueryVector> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryVector struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQuerytype()) {
        optionals.set(0);
      }
      if (struct.isSetMatchingtype()) {
        optionals.set(1);
      }
      if (struct.isSetRanges()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetQuerytype()) {
        oprot.writeI32(struct.querytype.getValue());
      }
      if (struct.isSetMatchingtype()) {
        oprot.writeI32(struct.matchingtype.getValue());
      }
      if (struct.isSetRanges()) {
        {
          oprot.writeI32(struct.ranges.size());
          for (String _iter4 : struct.ranges)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryVector struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.querytype = com.dataluminosity.message.SensorType.findByValue(iprot.readI32());
        struct.setQuerytypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.matchingtype = com.dataluminosity.message.MatchingType.findByValue(iprot.readI32());
        struct.setMatchingtypeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ranges = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.ranges.add(_elem6);
          }
        }
        struct.setRangesIsSet(true);
      }
    }
  }

}

