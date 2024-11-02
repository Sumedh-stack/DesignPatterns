package org.example.DesignParkingSystem;

public class FourWheelerComputation extends CostComputation{

    FourWheelerComputation(){
        super(new MinutePricing());
    }

}
