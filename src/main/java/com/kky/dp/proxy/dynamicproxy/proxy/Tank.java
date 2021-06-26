package com.kky.dp.proxy.dynamicproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * jdk反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        Tank tank = new Tank();

        Movable movable = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TimeProxy(tank)
        );

        movable.move();

    }
}

class TimeProxy implements InvocationHandler {
    Object object;

    public TimeProxy(Object object) {
        this.object = object;
    }

    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object o = method.invoke(object, args);
        after();
        return o;
    }

}

interface Movable {
    void move();
}