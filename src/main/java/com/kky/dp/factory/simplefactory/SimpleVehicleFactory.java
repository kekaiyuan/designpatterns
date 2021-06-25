package com.kky.dp.factory.simplefactory;

/**
 * @author 柯凯元
 * @create 2021/6/14 20:24
 */

/**
 * 简单工厂
 */
public class SimpleVehicleFactory {

    public Vehicle createVehicle(VehicleType type) {
        Vehicle vehicle = null;
        switch (type) {
            case Car:
                vehicle = new Car();
                break;
            case Plane:
                vehicle = new Plane();
                break;
            case Broom:
                vehicle = new Broom();
                break;
        }
        return vehicle;
    }

    class Car extends Vehicle {

        @Override
        public void go() {
            System.out.println("开汽车");
        }
    }

    class Plane extends Vehicle {

        @Override
        public void go() {
            System.out.println("开飞机");
        }
    }

    class Broom extends Vehicle {

        @Override
        public void go() {
            System.out.println("骑扫帚");
        }
    }
}

