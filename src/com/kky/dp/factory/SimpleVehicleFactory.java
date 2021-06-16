package com.kky.dp.factory;

/**
 * @author 柯凯元
 * @create 2021/6/14 20:24
 */

import com.kky.dp.factory.abstractfactory.vehicle.Broom;
import com.kky.dp.factory.abstractfactory.vehicle.Car;

/**
 * 简单工厂
 * 扩展性不好
 */
public class SimpleVehicleFactory {

    public Car createCar(){
        return new Car();
    }

    public Broom createBroom(){
        return new Broom();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
