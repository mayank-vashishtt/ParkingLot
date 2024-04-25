package org.example.parkinglot.models;

import java.util.Date;

public class Ticket {
    private int id;
    private int number;
    private Date entryTime;
    private Vechicle vechicle;
    private ParkingSpot parkingSpot;
    private Gate gate;
    private Status status;
}
