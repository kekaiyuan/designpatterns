package com.kky.dp.decorator;

//珍珠
public class Pearl extends CondimentDecorator{

    public Pearl(Beverage beverage){
        this.beverage = beverage;
    }

    //价格+1
    @Override
    public double cost() {
        return beverage.cost()+1;
    }

    //添加描述
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 珍珠";
    }

}
