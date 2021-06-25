package com.kky.dp.factory.factorymethod;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    class Car extends Vehicle{
        @Override
        public void go() {
            System.out.println("开汽车");
        }
    }
}
