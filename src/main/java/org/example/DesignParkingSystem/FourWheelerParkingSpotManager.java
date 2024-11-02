package org.example.DesignParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{


    FourWheelerParkingSpotManager(List<ParkingSpot> fourWheelerParkingSpotList ){
        super(fourWheelerParkingSpotList,new NeartoEntranceElevator());
    }
}
