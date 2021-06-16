package com.kky.dp.factory.abstractfactory.factory;

import com.kky.dp.factory.abstractfactory.food.Food;
import com.kky.dp.factory.abstractfactory.food.InstantNoodles;
import com.kky.dp.factory.abstractfactory.vehicle.Car;
import com.kky.dp.factory.abstractfactory.vehicle.Vehicle;
import com.kky.dp.factory.abstractfactory.weapon.AK47;
import com.kky.dp.factory.abstractfactory.weapon.Weapon;

/**
 * @author 柯凯元
 * @create 2021/6/15 23:02
 */
public class ModernFactory extends AbstractFactory{

    @Override
    public Food getFood() {
        return new InstantNoodles();
    }

    @Override
    public Vehicle getVehicle() {
        return new Car();
    }

    @Override
    public Weapon getWeapon() {
        return new AK47();
    }

}
