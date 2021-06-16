package com.kky.dp.strategy;

/**
 * @author 柯凯元
 * @create 2021/6/3 15:17
 */
public class Dog {

    //食量
    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }


    public int compareTo(Dog d) {
        if (this.food < d.food) {
            return -1;
        } else if (this.food > d.food) {
            return 1;
        } else {
            return 0;
        }
    }
}
