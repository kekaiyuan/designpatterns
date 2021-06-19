package com.kky.dp.factory.abstractfactory.factory;

import com.kky.dp.factory.abstractfactory.food.Food;
import com.kky.dp.factory.abstractfactory.vehicle.Vehicle;
import com.kky.dp.factory.abstractfactory.weapon.Weapon;

/**
 * @author 柯凯元
 * @create 2021/6/15 22:58
 */
public abstract class AbstractFactory {

    public abstract Food getFood();
    public abstract Vehicle getVehicle();
    public abstract Weapon getWeapon();

}
