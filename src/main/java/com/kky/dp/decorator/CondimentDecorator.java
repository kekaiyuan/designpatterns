package com.kky.dp.decorator;

//装饰抽象类：奶茶配料
public abstract class CondimentDecorator extends Beverage {

    //被装饰的对象
    protected Beverage beverage = null;

    @Override
    public abstract String getDescription();

}
