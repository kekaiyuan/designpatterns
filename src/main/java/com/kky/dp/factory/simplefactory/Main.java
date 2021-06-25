package com.kky.dp.factory.simplefactory;

    public class Main {
        public static void main(String[] args) {
            Vehicle vehicle = null;
            SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();

            vehicle = simpleVehicleFactory.createVehicle(VehicleType.Car);
            vehicle.go();

            vehicle = simpleVehicleFactory.createVehicle(VehicleType.Plane);
            vehicle.go();

            vehicle = simpleVehicleFactory.createVehicle(VehicleType.Broom);
            vehicle.go();

        }
    }
