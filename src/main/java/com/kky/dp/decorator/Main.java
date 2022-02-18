package com.kky.dp.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new GreenTea();
        beverage.printDescription();

        beverage = new Pearl(beverage);
        beverage.printDescription();

        beverage = new Pearl(beverage);
        beverage.printDescription();

        beverage = new Coco(beverage);
        beverage.printDescription();

        beverage = new Coco(beverage);
        beverage.printDescription();
    }
}
