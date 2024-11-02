package org.example.DesignParkingSystem;

public class CostComputationFactory {


    public CostComputation getCostCOmputation(VehicleType vehicleType){
        switch (vehicleType){
            case TWO_WHEELER -> {
                return new TwoWheelerComputation();
            }
            case FOUR_WHEELER -> {
                return new FourWheelerComputation();
            }
            default -> {
                return new FourWheelerComputation();
            }
        }

    }
}
