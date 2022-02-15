package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 22:14
 */
/*
 * 双检锁，懒汉式的升级版，减小同步代码块的大小，提高并发度和效率
 * */
public class Singleton04 {

    //使用volatile关键字，防止JVM内部语句重排后，没有初始化就返回INSTANCE
    private static volatile Singleton04 INSTANCE;

    private Singleton04(){
    }

    public static Singleton04 getInstance() {
        if(INSTANCE == null){
            // 上锁
            synchronized (Singleton04.class){
                //双重检查
                if(INSTANCE == null){
                    // 增加运行时间，测试多线程环境下是否安全
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton04();
                }
            }
        }
        return INSTANCE;
    }
}

