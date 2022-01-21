package com.kky.dp.prototype.v2;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * 通过全克隆实现深克隆
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(18, 100, new Location("bj", 22));
        Person p2 = (Person) p1.clone();

        System.out.println(p1.loc == p2.loc);
        p1.loc.street = "sh";
        System.out.println(p2.loc.street);

        // 直接创建 10000000 个对象要多久？
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Person temp = new Person(18, 100, new Location("bj", 22));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        // 全克隆 10000000 个对象要多久？
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Person temp = (Person) p1.clone();
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}

@AllArgsConstructor
@ToString
class Person implements Cloneable {
    int age;
    int score;
    Location loc;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.loc = (Location) this.loc.clone();
        return person;
    }
}

@AllArgsConstructor
@ToString
class Location implements Cloneable {
    String street;
    int roomNo;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
