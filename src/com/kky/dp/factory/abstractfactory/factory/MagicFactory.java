package com.kky.dp.factory.abstractfactory.factory;

import com.kky.dp.factory.abstractfactory.food.Food;
import com.kky.dp.factory.abstractfactory.food.MushRoom;
import com.kky.dp.factory.abstractfactory.vehicle.Broom;
import com.kky.dp.factory.abstractfactory.vehicle.Vehicle;
import com.kky.dp.factory.abstractfactory.weapon.MagicStick;
import com.kky.dp.factory.abstractfactory.weapon.Weapon;

/**
 * @author 柯凯元
 * @create 2021/6/15 23:02
 */
public class MagicFactory extends AbstractFactory{

    @Override
    public Food getFood() {
        return new MushRoom();
    }

    @Override
    public Vehicle getVehicle() {
        return new Broom();
    }

    @Override
    public Weapon getWeapon() {
        return new MagicStick();
    }

}
