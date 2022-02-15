package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 22:14
 */
/*
* 静态内部类方式
* 由JVM保证单例
* 加载外部类时不会加载内部类，实现懒加载
* 完美版本2
* */
public class Singleton05 {

    private Singleton05(){}

    private static class Singleton{
        private final static Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance(){
        return Singleton.INSTANCE;
    }
}
