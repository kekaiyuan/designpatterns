package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 21:09
 */

/*
* 饿汉式
* 类加载到内存后，就实例化一个单例，JVM保证线程安全
* 简单使用，推荐！
* 唯一缺点：不管用到与否，类装载时就完成实例化
* 经典中的经典
* */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();
    //将构造函数设置为private，这样外部类就无法创建，单例模式的关键点
    private Mgr01(){}
    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
    }
}
