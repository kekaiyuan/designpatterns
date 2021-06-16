package com.kky.dp.singleton.src.com.kky;

/**
 * @author 柯凯元
 * @create 2021/6/2 21:14
 */
/*
* 与Mgr01一样，只是写法略有不同
* */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }
    private Mgr02(){}
    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
    }
}
