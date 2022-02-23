package com.kky.dp.chainofresponsibility;

import java.util.Random;

/**
 * 具体方法
 *
 * @author 柯凯元
 * @date 2022-02-23 17:34
 */
public class Method2 implements MethodInterface {
    @Override
    public boolean method() {
        System.out.println("执行方法 2");
        Random random = new Random();
        if (random.nextInt(10) > 8) {
            return false;
        }
        return true;
    }
}
