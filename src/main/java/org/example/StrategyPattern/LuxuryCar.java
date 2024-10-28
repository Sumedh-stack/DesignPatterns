package org.example.StrategyPattern;

public class LuxuryCar extends Vehicle{
    LuxuryCar(SpeedStrategy speedStrategy) {
        super(speedStrategy);
    }
}
