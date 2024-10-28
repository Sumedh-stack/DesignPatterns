package org.example.StrategyPattern;

public class NormalSpeed implements SpeedStrategy{
    @Override
    public void getSpeed() {
        System.out.println("My Speed is Normal");
    }
}
