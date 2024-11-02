package org.example.DesignParkingSystem;

public class ParkingSpot {

    int price;
    boolean isEmpty;
    Vehicle vehicle;

    ParkingSpot(){

    }

    void parkVehicle(Vehicle v){
        this.vehicle=v;
        isEmpty=false;
    }

    void removeVehicle(){
        this.vehicle=null;
        isEmpty=true;
    }
}
