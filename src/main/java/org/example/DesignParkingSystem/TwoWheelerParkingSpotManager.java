package org.example.DesignParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    TwoWheelerParkingSpotManager(List<ParkingSpot> twoWheelerParkingSpotList){
        super(twoWheelerParkingSpotList,new NearToEntranceParking());
    }
}
