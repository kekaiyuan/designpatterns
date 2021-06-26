package com.kky.dp.proxy.staticproxy;

import java.util.Random;

/**
 * 静态代理
 */
public class Main {

    public static void main(String[] args) {

        new TankTimeProxy(new Tank()).move();

        System.out.println("------");

        new TankLogProxy(
                new TankTimeProxy(
                        new Tank()
                )
        ).move();

        System.out.println("------");

        new TankTimeProxy(
                new TankLogProxy(
                        new Tank()
                )
        ).move();
    }
}

//时间代理，计算程序运行的时间
class TankTimeProxy implements Movable {
    Movable movable;

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

//日志代理，输出日志
class TankLogProxy implements Movable {
    Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("stopped!");
    }
}

class Tank implements Movable {
    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

interface Movable {
    void move();
}