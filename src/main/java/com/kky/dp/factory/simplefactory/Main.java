package com.kky.dp.factory.simplefactory;

import com.kky.dp.factory.vehicle.*;

/**
 * @author kekaiyuan
 */
public class Main {
    public static void main(String[] args) {
        SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();

        Vehicle car = simpleVehicleFactory.createVehicle(VehicleType.Car);
        car.go();

        Vehicle plane = simpleVehicleFactory.createVehicle(VehicleType.Plane);
        plane.go();

        Vehicle broom = simpleVehicleFactory.createVehicle(VehicleType.Broom);
        broom.go();
    }
}
