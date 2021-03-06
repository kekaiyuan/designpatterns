package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 22:14
 */
/*
* 枚举方式
* 不仅可以解决线程同步，还可以防止反序列化
* 完美版本3
* */
public enum Singleton06 {

    INSTANCE;

    public static Singleton06 getInstance(){
        return INSTANCE;
    }
}
