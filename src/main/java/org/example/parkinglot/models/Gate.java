package org.example.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Gate {
    private int id;
    private int number;
    private Status status;
    private Operator operator;
    private Gatetype gatetype;
}
