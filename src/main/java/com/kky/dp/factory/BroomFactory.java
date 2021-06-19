package com.kky.dp.factory;

import com.kky.dp.factory.abstractfactory.vehicle.Broom;

/**
 * @author 柯凯元
 * @create 2021/6/14 20:27
 */
public class BroomFactory {

    public Broom createBroom(){
        System.out.println("a broom created");
        return new Broom();
    }

}
