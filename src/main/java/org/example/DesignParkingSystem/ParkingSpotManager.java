package org.example.DesignParkingSystem;

import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpotList;

    ParkingStrategy parkingStrategy;

    ParkingSpotManager(List<ParkingSpot> parkingSpotList,ParkingStrategy parkingStrategy){
        this.parkingSpotList=parkingSpotList;
        this.parkingStrategy=parkingStrategy;
    }

    void findParkingSpace(){
        parkingStrategy.findParkingSpace();
    }
    void addParkingspace(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }
    void removeParkingSpace(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }

    void parkVehicle(){

    }

    void removeVehicle(){

    }

}
