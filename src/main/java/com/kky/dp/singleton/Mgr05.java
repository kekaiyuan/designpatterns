package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 22:13
 */
/*
* Mgr04的改进，尝试减小同步代码块，结果不可行
* 注意：该代码不可行！
* */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05(){

    }

    public static Mgr05 getInstance() {
        if(INSTANCE == null){
            //该方法不可行！！!
            synchronized (Mgr05.class){
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //多线程访问，通过hashcode检验是否是单例模式
        for(int i=0;i<100;i++){
            new Thread(()-> System.out.println(Mgr05.getInstance().hashCode())).start();
        }
    }
}

