package com.kky.dp.factory.staticfactory;

/**
 * @author 柯凯元
 * @create 2021/6/14 20:24
 */

/**
 * 静态工厂
 */
public class StaticFactory {
    private StaticFactory(){}

    public static Vehicle createVehicle(VehicleType type) {
        Vehicle vehicle = null;
        switch (type){
            case Car:
                vehicle = new Car();
                break;
        }
        return vehicle;
    }
}

class Car extends Vehicle{
    public void go() {
        System.out.println("开汽车");
    }
}
