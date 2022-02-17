package com.kky.dp.factory.staticfactory;


import com.kky.dp.factory.vehicle.*;

/**
 * 静态工厂
 *
 * @author 柯凯元
 * @create 2021/6/14 20:24
 */
public class StaticFactory {
    private StaticFactory() {
    }

    public static Vehicle createVehicle(VehicleType type) {
        switch (type) {
            case Car:
                return new Car();
            case Plane:
                return new Plane();
            case Broom:
                return new Broom();
            default:
                return null;
        }
    }
}
