package com.kky.dp.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory1 = new CarFactory();
        Vehicle vehicle1 = factory1.createVehicle();
        vehicle1.go();

        VehicleFactory factory2 = new PlaneFactory();
        Vehicle vehicle2 = factory2.createVehicle();
        vehicle2.go();
    }
}
