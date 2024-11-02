package org.example.DesignParkingSystem;

public class HourlyPricing extends PricingStrategy{

    long priceCalculate(Ticket ticket){
        return (100-ticket.entryTime)* ticket.parkingSpot.price;
        // ticket.entryTime- current)
    }
}
