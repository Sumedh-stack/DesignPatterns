package org.example.DesignParkingSystem;

import java.sql.Time;

public class MinutePricing extends PricingStrategy{

//    MinutePricing(Ticket ticket){
//
//    }

    long priceCalculate(Ticket ticket){
        return (100-ticket.entryTime)* ticket.parkingSpot.price;
        // ticket.entryTime- current)
    }
}
