package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 21:18
 */
/*
* 懒汉式
* 用的时候才初始化
* 多线程并发访问时容易创建出多个实例，无法达成单例的目的
* */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03(){

    }

    public static Mgr03 getInstance() {
        if(INSTANCE == null){
            //增加执行时间，便于检验多线程访问的结果
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //多线程访问，通过hashcode检验是否是单例模式
        for(int i=0;i<100;i++){
            new Thread(()-> System.out.println(Mgr03.getInstance().hashCode())).start();
        }
    }
}
