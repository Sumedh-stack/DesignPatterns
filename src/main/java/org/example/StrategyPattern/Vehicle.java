package org.example.StrategyPattern;

public class Vehicle {

    SpeedStrategy speedStrategy ;

    Vehicle(SpeedStrategy speedStrategy){
        this.speedStrategy=speedStrategy;
    }

    void getSpeed(){
        speedStrategy.getSpeed();
    }
}
