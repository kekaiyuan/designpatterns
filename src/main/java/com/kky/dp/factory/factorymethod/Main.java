package com.kky.dp.factory.factorymethod;

import com.kky.dp.factory.vehicle.*;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.go();

        VehicleFactory planeFactory = new PlaneFactory();
        Vehicle plane = planeFactory.createVehicle();
        plane.go();

        VehicleFactory broomFactory = new BroomFactory();
        Vehicle broom = broomFactory.createVehicle();
        broom.go();
    }
}
