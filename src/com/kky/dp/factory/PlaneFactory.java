package com.kky.dp.factory;

/**
 * @author 柯凯元
 * @create 2021/6/14 20:27
 */
public class PlaneFactory {

    public Plane createPlane(){
        System.out.println("a plane created");
        return new Plane();
    }

}
