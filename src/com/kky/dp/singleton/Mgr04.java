package com.kky.dp.singleton;

/**
 * @author 柯凯元
 * @create 2021/6/2 22:09
 */
/*
* Mgr03的改进，实现线程同步，但是效率会下降
* */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04(){

    }

    public static synchronized Mgr04 getInstance() {
        if(INSTANCE == null){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //多线程访问，通过hashcode检验是否是单例模式
        for(int i=0;i<100;i++){
            new Thread(()-> System.out.println(Mgr04.getInstance().hashCode())).start();
        }
    }
}
