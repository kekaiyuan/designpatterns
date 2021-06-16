package com.kky.dp.factory.abstractfactory;

import com.kky.dp.factory.abstractfactory.factory.AbstractFactory;
import com.kky.dp.factory.abstractfactory.factory.MagicFactory;
import com.kky.dp.factory.abstractfactory.factory.ModernFactory;

/**
 * @author 柯凯元
 * @create 2021/6/15 23:04
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = new MagicFactory();
        show(abstractFactory1);

        System.out.println("-------");

        AbstractFactory abstractFactory2 = new ModernFactory();
        show(abstractFactory2);

    }

    public static void show(AbstractFactory abstractFactory){
        abstractFactory.getFood().getName();
        abstractFactory.getVehicle().go();
        abstractFactory.getWeapon().shoot();
    }
}
