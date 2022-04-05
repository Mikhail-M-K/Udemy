package com.javalesson.Inheritance;

import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Truck truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 1000);
        ElectricCar car = new ElectricCar("Tesla", "Model S", 4, 100500);
        Auto bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
//        Auto auto = new Auto("WV", "Polo", busEngine);

        runCar(bus);
        runCar(truck);
        runCar(car);
//        runCar(auto);
    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();

    }
}
