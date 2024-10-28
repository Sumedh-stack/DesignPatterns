package org.example.StrategyPattern;

public class NormalCar extends Vehicle{
    NormalCar(SpeedStrategy speedStrategy) {
        super(speedStrategy);
    }
}
