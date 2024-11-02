package org.example.DesignParkingSystem;

public class ExitGate {

    Ticket ticket;
    CostComputation costComputation;
    ParkingSpotManager parkingSpotManager;
    CostComputationFactory costComputationFactory;
    ParkingManagerFactory parkingManagerFactory;
    long priceCalculation(){
        return costComputation.getPrice();
    }

    //Payment
}
