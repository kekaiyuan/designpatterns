package com.kky.dp.decorate;

public class GreenTea extends Beverage{

    public GreenTea(){
        this.description = "绿茶";
    }

    @Override
    public double cost() {
        return 8;
    }
}
