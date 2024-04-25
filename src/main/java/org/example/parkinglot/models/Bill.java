package org.example.parkinglot.models;

import java.util.*;

public class Bill {
    private int id;
    private Ticket ticket;
    private Date exitTime;
    private int amount;
    private List<Payment> Payments;
    private Status status;

}
