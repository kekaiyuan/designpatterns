package com.kky.dp.factory.factorymethod;

import com.kky.dp.factory.vehicle.*;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
