package org.example.StrategyPattern;

import com.sun.jdi.connect.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new NormalCar(new NormalSpeed());
        Vehicle v2 = new LuxuryCar(new UltraSpeed());
        Vehicle v3 = new SuperCar(new UltraSpeed());

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        for(Vehicle vehicle: vehicles){
            vehicle.getSpeed();
        }
    }
}
