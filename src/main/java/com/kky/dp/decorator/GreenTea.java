package com.kky.dp.decorator;

//被装饰类：绿茶
public class GreenTea extends Beverage{

    public GreenTea(){
        this.description = "绿茶";
    }

    @Override
    public double cost() {
        return 8;
    }
}
