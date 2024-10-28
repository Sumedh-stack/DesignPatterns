package org.example.StrategyPattern;

public class UltraSpeed implements SpeedStrategy{
    @Override
    public void getSpeed() {
        System.out.println("My Speed is Ultra fast");
    }
}
