package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 21:14
 */
/*
* 与Singleton02一样，只是写法略有不同，使用静态代码块实现
* */
public class Singleton02 {

    private static final Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }

    private Singleton02(){}

    public static Singleton02 getInstance(){
        return INSTANCE;
    }
}
