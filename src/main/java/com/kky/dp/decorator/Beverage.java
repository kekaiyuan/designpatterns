package com.kky.dp.decorator;

public abstract class Beverage {

    //饮料的描述
    protected String description = null;
    public String getDescription(){
        return description;
    }

    //饮料的价格
    public abstract double cost();
}
