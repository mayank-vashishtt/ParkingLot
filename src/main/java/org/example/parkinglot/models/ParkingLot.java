package org.example.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ParkingLot {

    private int id;
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gates;
    private Status status;

}
