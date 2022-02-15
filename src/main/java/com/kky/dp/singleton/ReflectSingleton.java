package com.kky.dp.singleton;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 测试反射对于单例模式的影响
 */
public class ReflectSingleton {
    public static void main(String[] args) throws Exception {
        // 创建实例 1
        Singleton01 singleton01 = Singleton01.getInstance();

        // 通过反射获取构造器
        Class<? extends Singleton01> aClass = singleton01.getClass();
        Constructor<? extends Singleton01> constructor = aClass.getDeclaredConstructor();

        // 设置构造器为可访问的
        constructor.setAccessible(true);

        // 创建实例 2
        Singleton01 singleton02 = constructor.newInstance();

        // 对比是否是同一个对象
        System.out.println(singleton01 == singleton02); // false
    }
}