package com.kky.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 */

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.cry("bed");

        System.out.println("------");

        Child2 child2 = new Child2();
        child2.cry("bed");
    }

}

//被观察者
class Child {

    private List<Observer> observers = new ArrayList<>();

    //添加观察者
    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }

    public void cry(String location) {

        //记录事件
        CryEvent event = new CryEvent(System.currentTimeMillis(), location, this);

        //通知所有观察者
        for (Observer o : observers) {
            o.actionOnCry(event);
        }
    }

}

class Child2 {

    private List<Observer> observers = new ArrayList<>();

    //添加观察者
    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }

    public void cry(String location) {

        //记录事件
        CryEvent event = new CryEvent(System.currentTimeMillis(), location, this);

        //通知所有观察者
        for (Observer o : observers) {
            o.actionOnCry(event);
        }
    }

}

abstract class Event<T> {

    //事件源
    T source;

    public T getSource() {
        return source;
    }

}

class CryEvent<T> extends Event {

    long timestamp;
    String location;

    public CryEvent(long timestamp, String location, T source) {
        this.timestamp = timestamp;
        this.location = location;
        super.source = source;
    }

}

//观察者
interface Observer {

    void actionOnCry(Event event);

}

class Dad implements Observer {

    @Override
    public void actionOnCry(Event event) {
        if (event.getSource() instanceof Child) {
            System.out.println("dad feeding...");
        }
    }

}

class Mom implements Observer {

    @Override
    public void actionOnCry(Event event) {
        if (event.getSource() instanceof Child) {
            System.out.println("mom hugging...");
        }
    }

}

class Dog implements Observer {

    @Override
    public void actionOnCry(Event event) {
        if (event.getSource() instanceof Child) {
            System.out.println("dog wang...");
        }
    }

}


