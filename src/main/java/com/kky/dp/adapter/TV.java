package com.kky.dp.adapter;

public class TV {
    public void work(int voltage){
        if(voltage>110){
            System.out.println("can't work");
        }else{
            System.out.println("normal work");
        }
    }
}
