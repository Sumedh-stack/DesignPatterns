package org.example.DesignParkingSystem;

import java.util.List;

public class ParkingManagerFactory {

    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> parkingSpotList){

        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerParkingSpotManager(parkingSpotList);
            case FOUR_WHEELER:
                return new FourWheelerParkingSpotManager(parkingSpotList);
            default:
                throw new IllegalArgumentException("No manager available for vehicle type: " + vehicleType);
        }

    }
}
