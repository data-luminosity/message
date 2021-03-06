// Autogenerated by Thrift Compiler (0.9.3)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

package query

import (
	"bytes"
	"fmt"
	"git.apache.org/thrift.git/lib/go/thrift"
)

// (needed to ensure safety because of naive import list construction.)
var _ = thrift.ZERO
var _ = fmt.Printf
var _ = bytes.Equal

var GoUnusedProtection__ int

type SensorType int64

const (
	SensorType_LOCATION      SensorType = 0
	SensorType_GYROSCOPE     SensorType = 1
	SensorType_ACCELEROMETER SensorType = 2
	SensorType_MAGNETOMETER  SensorType = 3
	SensorType_PROXIMITY     SensorType = 4
	SensorType_BRIGHTNESS    SensorType = 5
	SensorType_SOUNDLEVEL    SensorType = 6
	SensorType_BATTERYLEVEL  SensorType = 7
	SensorType_WIFIDATAUSAGE SensorType = 8
	SensorType_CELLDATAUSAGE SensorType = 9
)

func (p SensorType) String() string {
	switch p {
	case SensorType_LOCATION:
		return "LOCATION"
	case SensorType_GYROSCOPE:
		return "GYROSCOPE"
	case SensorType_ACCELEROMETER:
		return "ACCELEROMETER"
	case SensorType_MAGNETOMETER:
		return "MAGNETOMETER"
	case SensorType_PROXIMITY:
		return "PROXIMITY"
	case SensorType_BRIGHTNESS:
		return "BRIGHTNESS"
	case SensorType_SOUNDLEVEL:
		return "SOUNDLEVEL"
	case SensorType_BATTERYLEVEL:
		return "BATTERYLEVEL"
	case SensorType_WIFIDATAUSAGE:
		return "WIFIDATAUSAGE"
	case SensorType_CELLDATAUSAGE:
		return "CELLDATAUSAGE"
	}
	return "<UNSET>"
}

func SensorTypeFromString(s string) (SensorType, error) {
	switch s {
	case "LOCATION":
		return SensorType_LOCATION, nil
	case "GYROSCOPE":
		return SensorType_GYROSCOPE, nil
	case "ACCELEROMETER":
		return SensorType_ACCELEROMETER, nil
	case "MAGNETOMETER":
		return SensorType_MAGNETOMETER, nil
	case "PROXIMITY":
		return SensorType_PROXIMITY, nil
	case "BRIGHTNESS":
		return SensorType_BRIGHTNESS, nil
	case "SOUNDLEVEL":
		return SensorType_SOUNDLEVEL, nil
	case "BATTERYLEVEL":
		return SensorType_BATTERYLEVEL, nil
	case "WIFIDATAUSAGE":
		return SensorType_WIFIDATAUSAGE, nil
	case "CELLDATAUSAGE":
		return SensorType_CELLDATAUSAGE, nil
	}
	return SensorType(0), fmt.Errorf("not a valid SensorType string")
}

func SensorTypePtr(v SensorType) *SensorType { return &v }

func (p SensorType) MarshalText() ([]byte, error) {
	return []byte(p.String()), nil
}

func (p *SensorType) UnmarshalText(text []byte) error {
	q, err := SensorTypeFromString(string(text))
	if err != nil {
		return err
	}
	*p = q
	return nil
}

type MatchingType int64

const (
	MatchingType_LOCATION_MATCHING  MatchingType = 0
	MatchingType_NUMERICAL_MATCHING MatchingType = 1
	MatchingType_STRING_MATCHING    MatchingType = 2
)

func (p MatchingType) String() string {
	switch p {
	case MatchingType_LOCATION_MATCHING:
		return "LOCATION_MATCHING"
	case MatchingType_NUMERICAL_MATCHING:
		return "NUMERICAL_MATCHING"
	case MatchingType_STRING_MATCHING:
		return "STRING_MATCHING"
	}
	return "<UNSET>"
}

func MatchingTypeFromString(s string) (MatchingType, error) {
	switch s {
	case "LOCATION_MATCHING":
		return MatchingType_LOCATION_MATCHING, nil
	case "NUMERICAL_MATCHING":
		return MatchingType_NUMERICAL_MATCHING, nil
	case "STRING_MATCHING":
		return MatchingType_STRING_MATCHING, nil
	}
	return MatchingType(0), fmt.Errorf("not a valid MatchingType string")
}

func MatchingTypePtr(v MatchingType) *MatchingType { return &v }

func (p MatchingType) MarshalText() ([]byte, error) {
	return []byte(p.String()), nil
}

func (p *MatchingType) UnmarshalText(text []byte) error {
	q, err := MatchingTypeFromString(string(text))
	if err != nil {
		return err
	}
	*p = q
	return nil
}

// Attributes:
//  - Ranges
type QueryVector struct {
	Ranges []string `thrift:"ranges,1" json:"ranges"`
}

func NewQueryVector() *QueryVector {
	return &QueryVector{}
}

func (p *QueryVector) GetRanges() []string {
	return p.Ranges
}
func (p *QueryVector) Read(iprot thrift.TProtocol) error {
	if _, err := iprot.ReadStructBegin(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
	}

	for {
		_, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
		if err != nil {
			return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
		}
		if fieldTypeId == thrift.STOP {
			break
		}
		switch fieldId {
		case 1:
			if err := p.readField1(iprot); err != nil {
				return err
			}
		default:
			if err := iprot.Skip(fieldTypeId); err != nil {
				return err
			}
		}
		if err := iprot.ReadFieldEnd(); err != nil {
			return err
		}
	}
	if err := iprot.ReadStructEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
	}
	return nil
}

func (p *QueryVector) readField1(iprot thrift.TProtocol) error {
	_, size, err := iprot.ReadListBegin()
	if err != nil {
		return thrift.PrependError("error reading list begin: ", err)
	}
	tSlice := make([]string, 0, size)
	p.Ranges = tSlice
	for i := 0; i < size; i++ {
		var _elem0 string
		if v, err := iprot.ReadString(); err != nil {
			return thrift.PrependError("error reading field 0: ", err)
		} else {
			_elem0 = v
		}
		p.Ranges = append(p.Ranges, _elem0)
	}
	if err := iprot.ReadListEnd(); err != nil {
		return thrift.PrependError("error reading list end: ", err)
	}
	return nil
}

func (p *QueryVector) Write(oprot thrift.TProtocol) error {
	if err := oprot.WriteStructBegin("QueryVector"); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err)
	}
	if err := p.writeField1(oprot); err != nil {
		return err
	}
	if err := oprot.WriteFieldStop(); err != nil {
		return thrift.PrependError("write field stop error: ", err)
	}
	if err := oprot.WriteStructEnd(); err != nil {
		return thrift.PrependError("write struct stop error: ", err)
	}
	return nil
}

func (p *QueryVector) writeField1(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("ranges", thrift.LIST, 1); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 1:ranges: ", p), err)
	}
	if err := oprot.WriteListBegin(thrift.STRING, len(p.Ranges)); err != nil {
		return thrift.PrependError("error writing list begin: ", err)
	}
	for _, v := range p.Ranges {
		if err := oprot.WriteString(string(v)); err != nil {
			return thrift.PrependError(fmt.Sprintf("%T. (0) field write error: ", p), err)
		}
	}
	if err := oprot.WriteListEnd(); err != nil {
		return thrift.PrependError("error writing list end: ", err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 1:ranges: ", p), err)
	}
	return err
}

func (p *QueryVector) String() string {
	if p == nil {
		return "<nil>"
	}
	return fmt.Sprintf("QueryVector(%+v)", *p)
}

// Attributes:
//  - AnalystId
//  - QueryId
//  - QueryStartTime
//  - QueryEndTime
//  - Epoch
//  - SensorType
//  - MatchingType
//  - QueryVector
//  - Epsilon
//  - FlipOne
//  - FlipTwo
//  - VersionId
type Query struct {
	AnalystId      int64        `thrift:"analystId,1" json:"analystId"`
	QueryId        int64        `thrift:"queryId,2" json:"queryId"`
	QueryStartTime int64        `thrift:"queryStartTime,3" json:"queryStartTime"`
	QueryEndTime   int64        `thrift:"queryEndTime,4" json:"queryEndTime"`
	Epoch          int64        `thrift:"epoch,5" json:"epoch"`
	SensorType     SensorType   `thrift:"sensorType,6" json:"sensorType"`
	MatchingType   MatchingType `thrift:"matchingType,7" json:"matchingType"`
	QueryVector    *QueryVector `thrift:"queryVector,8" json:"queryVector"`
	Epsilon        float64      `thrift:"epsilon,9" json:"epsilon"`
	FlipOne        string       `thrift:"flipOne,10" json:"flipOne"`
	FlipTwo        string       `thrift:"flipTwo,11" json:"flipTwo"`
	VersionId      int64        `thrift:"versionId,12" json:"versionId"`
}

func NewQuery() *Query {
	return &Query{}
}

func (p *Query) GetAnalystId() int64 {
	return p.AnalystId
}

func (p *Query) GetQueryId() int64 {
	return p.QueryId
}

func (p *Query) GetQueryStartTime() int64 {
	return p.QueryStartTime
}

func (p *Query) GetQueryEndTime() int64 {
	return p.QueryEndTime
}

func (p *Query) GetEpoch() int64 {
	return p.Epoch
}

func (p *Query) GetSensorType() SensorType {
	return p.SensorType
}

func (p *Query) GetMatchingType() MatchingType {
	return p.MatchingType
}

var Query_QueryVector_DEFAULT *QueryVector

func (p *Query) GetQueryVector() *QueryVector {
	if !p.IsSetQueryVector() {
		return Query_QueryVector_DEFAULT
	}
	return p.QueryVector
}

func (p *Query) GetEpsilon() float64 {
	return p.Epsilon
}

func (p *Query) GetFlipOne() string {
	return p.FlipOne
}

func (p *Query) GetFlipTwo() string {
	return p.FlipTwo
}

func (p *Query) GetVersionId() int64 {
	return p.VersionId
}
func (p *Query) IsSetQueryVector() bool {
	return p.QueryVector != nil
}

func (p *Query) Read(iprot thrift.TProtocol) error {
	if _, err := iprot.ReadStructBegin(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
	}

	for {
		_, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
		if err != nil {
			return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
		}
		if fieldTypeId == thrift.STOP {
			break
		}
		switch fieldId {
		case 1:
			if err := p.readField1(iprot); err != nil {
				return err
			}
		case 2:
			if err := p.readField2(iprot); err != nil {
				return err
			}
		case 3:
			if err := p.readField3(iprot); err != nil {
				return err
			}
		case 4:
			if err := p.readField4(iprot); err != nil {
				return err
			}
		case 5:
			if err := p.readField5(iprot); err != nil {
				return err
			}
		case 6:
			if err := p.readField6(iprot); err != nil {
				return err
			}
		case 7:
			if err := p.readField7(iprot); err != nil {
				return err
			}
		case 8:
			if err := p.readField8(iprot); err != nil {
				return err
			}
		case 9:
			if err := p.readField9(iprot); err != nil {
				return err
			}
		case 10:
			if err := p.readField10(iprot); err != nil {
				return err
			}
		case 11:
			if err := p.readField11(iprot); err != nil {
				return err
			}
		case 12:
			if err := p.readField12(iprot); err != nil {
				return err
			}
		default:
			if err := iprot.Skip(fieldTypeId); err != nil {
				return err
			}
		}
		if err := iprot.ReadFieldEnd(); err != nil {
			return err
		}
	}
	if err := iprot.ReadStructEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
	}
	return nil
}

func (p *Query) readField1(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 1: ", err)
	} else {
		p.AnalystId = v
	}
	return nil
}

func (p *Query) readField2(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 2: ", err)
	} else {
		p.QueryId = v
	}
	return nil
}

func (p *Query) readField3(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 3: ", err)
	} else {
		p.QueryStartTime = v
	}
	return nil
}

func (p *Query) readField4(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 4: ", err)
	} else {
		p.QueryEndTime = v
	}
	return nil
}

func (p *Query) readField5(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 5: ", err)
	} else {
		p.Epoch = v
	}
	return nil
}

func (p *Query) readField6(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI32(); err != nil {
		return thrift.PrependError("error reading field 6: ", err)
	} else {
		temp := SensorType(v)
		p.SensorType = temp
	}
	return nil
}

func (p *Query) readField7(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI32(); err != nil {
		return thrift.PrependError("error reading field 7: ", err)
	} else {
		temp := MatchingType(v)
		p.MatchingType = temp
	}
	return nil
}

func (p *Query) readField8(iprot thrift.TProtocol) error {
	p.QueryVector = &QueryVector{}
	if err := p.QueryVector.Read(iprot); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T error reading struct: ", p.QueryVector), err)
	}
	return nil
}

func (p *Query) readField9(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadDouble(); err != nil {
		return thrift.PrependError("error reading field 9: ", err)
	} else {
		p.Epsilon = v
	}
	return nil
}

func (p *Query) readField10(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadString(); err != nil {
		return thrift.PrependError("error reading field 10: ", err)
	} else {
		p.FlipOne = v
	}
	return nil
}

func (p *Query) readField11(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadString(); err != nil {
		return thrift.PrependError("error reading field 11: ", err)
	} else {
		p.FlipTwo = v
	}
	return nil
}

func (p *Query) readField12(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 12: ", err)
	} else {
		p.VersionId = v
	}
	return nil
}

func (p *Query) Write(oprot thrift.TProtocol) error {
	if err := oprot.WriteStructBegin("Query"); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err)
	}
	if err := p.writeField1(oprot); err != nil {
		return err
	}
	if err := p.writeField2(oprot); err != nil {
		return err
	}
	if err := p.writeField3(oprot); err != nil {
		return err
	}
	if err := p.writeField4(oprot); err != nil {
		return err
	}
	if err := p.writeField5(oprot); err != nil {
		return err
	}
	if err := p.writeField6(oprot); err != nil {
		return err
	}
	if err := p.writeField7(oprot); err != nil {
		return err
	}
	if err := p.writeField8(oprot); err != nil {
		return err
	}
	if err := p.writeField9(oprot); err != nil {
		return err
	}
	if err := p.writeField10(oprot); err != nil {
		return err
	}
	if err := p.writeField11(oprot); err != nil {
		return err
	}
	if err := p.writeField12(oprot); err != nil {
		return err
	}
	if err := oprot.WriteFieldStop(); err != nil {
		return thrift.PrependError("write field stop error: ", err)
	}
	if err := oprot.WriteStructEnd(); err != nil {
		return thrift.PrependError("write struct stop error: ", err)
	}
	return nil
}

func (p *Query) writeField1(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("analystId", thrift.I64, 1); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 1:analystId: ", p), err)
	}
	if err := oprot.WriteI64(int64(p.AnalystId)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.analystId (1) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 1:analystId: ", p), err)
	}
	return err
}

func (p *Query) writeField2(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("queryId", thrift.I64, 2); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 2:queryId: ", p), err)
	}
	if err := oprot.WriteI64(int64(p.QueryId)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.queryId (2) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 2:queryId: ", p), err)
	}
	return err
}

func (p *Query) writeField3(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("queryStartTime", thrift.I64, 3); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 3:queryStartTime: ", p), err)
	}
	if err := oprot.WriteI64(int64(p.QueryStartTime)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.queryStartTime (3) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 3:queryStartTime: ", p), err)
	}
	return err
}

func (p *Query) writeField4(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("queryEndTime", thrift.I64, 4); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 4:queryEndTime: ", p), err)
	}
	if err := oprot.WriteI64(int64(p.QueryEndTime)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.queryEndTime (4) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 4:queryEndTime: ", p), err)
	}
	return err
}

func (p *Query) writeField5(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("epoch", thrift.I64, 5); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 5:epoch: ", p), err)
	}
	if err := oprot.WriteI64(int64(p.Epoch)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.epoch (5) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 5:epoch: ", p), err)
	}
	return err
}

func (p *Query) writeField6(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("sensorType", thrift.I32, 6); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 6:sensorType: ", p), err)
	}
	if err := oprot.WriteI32(int32(p.SensorType)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.sensorType (6) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 6:sensorType: ", p), err)
	}
	return err
}

func (p *Query) writeField7(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("matchingType", thrift.I32, 7); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 7:matchingType: ", p), err)
	}
	if err := oprot.WriteI32(int32(p.MatchingType)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.matchingType (7) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 7:matchingType: ", p), err)
	}
	return err
}

func (p *Query) writeField8(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("queryVector", thrift.STRUCT, 8); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 8:queryVector: ", p), err)
	}
	if err := p.QueryVector.Write(oprot); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T error writing struct: ", p.QueryVector), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 8:queryVector: ", p), err)
	}
	return err
}

func (p *Query) writeField9(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("epsilon", thrift.DOUBLE, 9); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 9:epsilon: ", p), err)
	}
	if err := oprot.WriteDouble(float64(p.Epsilon)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.epsilon (9) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 9:epsilon: ", p), err)
	}
	return err
}

func (p *Query) writeField10(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("flipOne", thrift.STRING, 10); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 10:flipOne: ", p), err)
	}
	if err := oprot.WriteString(string(p.FlipOne)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.flipOne (10) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 10:flipOne: ", p), err)
	}
	return err
}

func (p *Query) writeField11(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("flipTwo", thrift.STRING, 11); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 11:flipTwo: ", p), err)
	}
	if err := oprot.WriteString(string(p.FlipTwo)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.flipTwo (11) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 11:flipTwo: ", p), err)
	}
	return err
}

func (p *Query) writeField12(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("versionId", thrift.I64, 12); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 12:versionId: ", p), err)
	}
	if err := oprot.WriteI64(int64(p.VersionId)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.versionId (12) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 12:versionId: ", p), err)
	}
	return err
}

func (p *Query) String() string {
	if p == nil {
		return "<nil>"
	}
	return fmt.Sprintf("Query(%+v)", *p)
}
