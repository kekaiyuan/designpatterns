package com.kky.dp.singleton;

public class Test {
    public static void main(String[] args) {
        //多线程访问，通过hashcode检验是否是单例模式
        for(int i=0;i<100;i++){
//            new Thread(()-> System.out.println(Singleton01.getInstance().hashCode())).start();
//            new Thread(()-> System.out.println(Singleton02.getInstance().hashCode())).start();
//            new Thread(()-> System.out.println(Singleton03.getInstance().hashCode())).start();
//            new Thread(()-> System.out.println(Singleton04.getInstance().hashCode())).start();
//            new Thread(()-> System.out.println(Singleton05.getInstance().hashCode())).start();
            new Thread(()-> System.out.println(Singleton06.getInstance().hashCode())).start();
        }
    }
}
