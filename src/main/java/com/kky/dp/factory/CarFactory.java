package com.kky.dp.factory;

import com.kky.dp.factory.abstractfactory.vehicle.Car;

/**
 * @author 柯凯元
 * @create 2021/6/14 20:27
 */
public class CarFactory {

    public Car createCar(){
        System.out.println("a car created");
        return new Car();
    }

}
