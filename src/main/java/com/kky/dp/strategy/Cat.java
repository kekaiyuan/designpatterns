package com.kky.dp.strategy;

/**
 * @author 柯凯元
 * @create 2021/6/3 15:02
 */
public class Cat {

    //体重和身高
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
