package com.kky.dp.singleton.src.com.kky;

/**
 * @author 柯凯元
 * @create 2021/6/2 22:14
 */
/*
 * Mgr05的改进，双重检查
 * 完美版本1
 * */
public class Mgr06 {

    //使用volatile关键字，防止JVM内部语句重排后，没有初始化就返回INSTANCE
    private static volatile Mgr06 INSTANCE;

    private Mgr06(){

    }

    public static Mgr06 getInstance() {
        if(INSTANCE == null){
            //双重检查
            synchronized (Mgr06.class){
                if(INSTANCE == null){
                    try{
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //多线程访问，通过hashcode检验是否是单例模式
        for(int i=0;i<100;i++){
            new Thread(()-> System.out.println(Mgr06.getInstance().hashCode())).start();
        }
    }
}

