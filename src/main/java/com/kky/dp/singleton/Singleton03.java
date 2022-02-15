package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 22:09
 */
/*
* 懒汉式，实现懒加载，即使用实例时才创建
* 需要进行线程同步
* */
public class Singleton03 {

    private static Singleton03 INSTANCE;

    private Singleton03(){
    }

    public static synchronized Singleton03 getInstance() {
        if(INSTANCE == null){
            // 增加运行时间，测试多线程环境下是否安全
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
}
