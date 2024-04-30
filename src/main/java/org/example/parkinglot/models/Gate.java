package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.parkinglot.models.BaseModel;
import org.example.parkinglot.models.GateStatus;

@Getter
@Setter

public class Gate extends BaseModel {
    private int gateNumber;
    private org.example.models.Operator operator;
    private GateStatus gateStatus;
    private GateType gateType;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}