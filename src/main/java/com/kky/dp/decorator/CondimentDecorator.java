package com.kky.dp.decorator;

//配料装饰类
public abstract class CondimentDecorator extends Beverage{

    //被装饰的对象
    protected Beverage beverage = null;

    @Override
    public abstract String getDescription();

}
