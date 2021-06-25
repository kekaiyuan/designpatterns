package com.kky.dp.decorate;

//椰果
public class Coco extends CondimentDecorator{
    private Beverage beverage = null;

    public Coco(Beverage beverage){
        this.beverage = beverage;
    }

    //价格+2
    @Override
    public double cost() {
        return beverage.cost()+2;
    }

    //添加描述
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 椰果";
    }
}
