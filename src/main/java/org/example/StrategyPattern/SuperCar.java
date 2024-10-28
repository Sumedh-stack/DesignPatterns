package org.example.StrategyPattern;

public class SuperCar extends Vehicle{
    SuperCar(SpeedStrategy speedStrategy) {
        super(speedStrategy);
    }
}
