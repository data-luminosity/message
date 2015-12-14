// Autogenerated by Thrift Compiler (0.9.3)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

package privateanswer

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

// Attributes:
//  - AnalystId
//  - QueryId
//  - PrivateAnswerBits
//  - Bitlen
//  - JoinId
type PrivateAnswer struct {
	AnalystId         int64  `thrift:"analystId,1" json:"analystId"`
	QueryId           int64  `thrift:"queryId,2" json:"queryId"`
	PrivateAnswerBits []byte `thrift:"privateAnswerBits,3" json:"privateAnswerBits"`
	Bitlen            int32  `thrift:"bitlen,4" json:"bitlen"`
	JoinId            int64  `thrift:"joinId,5" json:"joinId"`
}

func NewPrivateAnswer() *PrivateAnswer {
	return &PrivateAnswer{}
}

func (p *PrivateAnswer) GetAnalystId() int64 {
	return p.AnalystId
}

func (p *PrivateAnswer) GetQueryId() int64 {
	return p.QueryId
}

func (p *PrivateAnswer) GetPrivateAnswerBits() []byte {
	return p.PrivateAnswerBits
}

func (p *PrivateAnswer) GetBitlen() int32 {
	return p.Bitlen
}

func (p *PrivateAnswer) GetJoinId() int64 {
	return p.JoinId
}
func (p *PrivateAnswer) Read(iprot thrift.TProtocol) error {
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

func (p *PrivateAnswer) readField1(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 1: ", err)
	} else {
		p.AnalystId = v
	}
	return nil
}

func (p *PrivateAnswer) readField2(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 2: ", err)
	} else {
		p.QueryId = v
	}
	return nil
}

func (p *PrivateAnswer) readField3(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadBinary(); err != nil {
		return thrift.PrependError("error reading field 3: ", err)
	} else {
		p.PrivateAnswerBits = v
	}
	return nil
}

func (p *PrivateAnswer) readField4(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI32(); err != nil {
		return thrift.PrependError("error reading field 4: ", err)
	} else {
		p.Bitlen = v
	}
	return nil
}

func (p *PrivateAnswer) readField5(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return thrift.PrependError("error reading field 5: ", err)
	} else {
		p.JoinId = v
	}
	return nil
}

func (p *PrivateAnswer) Write(oprot thrift.TProtocol) error {
	if err := oprot.WriteStructBegin("PrivateAnswer"); err != nil {
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
	if err := oprot.WriteFieldStop(); err != nil {
		return thrift.PrependError("write field stop error: ", err)
	}
	if err := oprot.WriteStructEnd(); err != nil {
		return thrift.PrependError("write struct stop error: ", err)
	}
	return nil
}

func (p *PrivateAnswer) writeField1(oprot thrift.TProtocol) (err error) {
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

func (p *PrivateAnswer) writeField2(oprot thrift.TProtocol) (err error) {
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

func (p *PrivateAnswer) writeField3(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("privateAnswerBits", thrift.STRING, 3); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 3:privateAnswerBits: ", p), err)
	}
	if err := oprot.WriteBinary(p.PrivateAnswerBits); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.privateAnswerBits (3) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 3:privateAnswerBits: ", p), err)
	}
	return err
}

func (p *PrivateAnswer) writeField4(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("bitlen", thrift.I32, 4); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 4:bitlen: ", p), err)
	}
	if err := oprot.WriteI32(int32(p.Bitlen)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.bitlen (4) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 4:bitlen: ", p), err)
	}
	return err
}

func (p *PrivateAnswer) writeField5(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("joinId", thrift.I64, 5); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field begin error 5:joinId: ", p), err)
	}
	if err := oprot.WriteI64(int64(p.JoinId)); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T.joinId (5) field write error: ", p), err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return thrift.PrependError(fmt.Sprintf("%T write field end error 5:joinId: ", p), err)
	}
	return err
}

func (p *PrivateAnswer) String() string {
	if p == nil {
		return "<nil>"
	}
	return fmt.Sprintf("PrivateAnswer(%+v)", *p)
}
