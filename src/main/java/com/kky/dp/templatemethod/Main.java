package com.kky.dp.templatemethod;

/**
 * @author 柯凯元
 * @date 2021/07/19 11:53
 */
public class Main {
    public static void main(String[] args) {
        Superclass aClass1 = new Subclass1();
        aClass1.templateMethod();

        System.out.println("------");

        Superclass aClass2 = new Subclass2();
        aClass2.templateMethod();
    }
}

abstract class Superclass {
    public void templateMethod(){
        method1();
        method2();
    }

    abstract void method1();
    abstract void method2();
}

class Subclass1 extends Superclass{
    @Override
    void method1() {
        System.out.println("subclass1 method1");
    }

    @Override
    void method2() {
        System.out.println("subclass1 method2");
    }
}

class Subclass2 extends Superclass{
    @Override
    void method1() {
        System.out.println("subclass2 method1");
    }

    @Override
    void method2() {
        System.out.println("subclass2 method2");
    }
}