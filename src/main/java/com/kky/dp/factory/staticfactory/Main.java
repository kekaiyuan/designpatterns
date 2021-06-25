package com.kky.dp.factory.staticfactory;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = null;

        vehicle = StaticFactory.createVehicle(VehicleType.Car);
        vehicle.go();
    }
}
