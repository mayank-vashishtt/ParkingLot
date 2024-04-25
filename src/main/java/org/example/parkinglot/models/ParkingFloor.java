package org.example.parkinglot.models;


import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter

public class ParkingFloor {

    private int floorId;
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private Status status;






}
