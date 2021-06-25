package com.kky.dp.factory.factorymethod;

public class PlaneFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }

    class Plane extends Vehicle{
        @Override
        public void go() {
            System.out.println("开飞机");
        }
    }
}
