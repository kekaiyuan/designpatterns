package com.kky.dp.decorator;

//抽象类
public abstract class Beverage {

    //饮料的描述
    protected String description = null;

    public String getDescription() {
        return description;
    }

    //饮料的价格
    public abstract double cost();

    public void printDescription() {
        System.out.println(getDescription() + " : " + cost() + " 元");
    }
}
