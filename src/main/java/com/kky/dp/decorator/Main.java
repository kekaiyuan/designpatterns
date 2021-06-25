package com.kky.dp.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new GreenTea();
        System.out.println(beverage.getDescription() + " : "+beverage.cost());

        beverage = new Pearl(beverage);
        System.out.println(beverage.getDescription() + " : "+beverage.cost());

        beverage = new Pearl(beverage);
        System.out.println(beverage.getDescription() + " : "+beverage.cost());

        beverage = new Coco(beverage);
        System.out.println(beverage.getDescription() + " : "+beverage.cost());

        beverage = new Coco(beverage);
        System.out.println(beverage.getDescription() + " : "+beverage.cost());

    }
}
