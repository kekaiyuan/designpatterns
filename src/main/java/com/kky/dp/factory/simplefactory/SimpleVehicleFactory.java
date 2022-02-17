package com.kky.dp.factory.simplefactory;

import com.kky.dp.factory.vehicle.*;

/**
 * @author 柯凯元
 * @create 2021/6/14 20:24
 */

/**
 * 简单工厂
 */
public class SimpleVehicleFactory {

    public Vehicle createVehicle(VehicleType type) {
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

