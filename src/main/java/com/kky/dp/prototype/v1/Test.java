package com.kky.dp.prototype.v1;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * 浅克隆
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(18, 100, new Location("bj", 22));
        System.out.println(p1);

        Person p2 = (Person) p1.clone();
        System.out.println(p2);

        System.out.println(p1 == p2);
        System.out.println(p1.loc == p2.loc);

        p1.age = 8;
        System.out.println(p2.age);

        p1.loc.street = "sh";
        System.out.println(p2.loc.street);
    }
}

@AllArgsConstructor
@ToString
class Person implements Cloneable {
    int age;
    int score;
    Location loc;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

@AllArgsConstructor
@ToString
class Location {
    String street;
    int roomNo;
}
