package org.example.DesignParkingSystem;

public class TwoWheelerComputation extends CostComputation {

    TwoWheelerComputation(){
        super(new HourlyPricing());
    }
}
