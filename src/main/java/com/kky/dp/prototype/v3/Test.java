package com.kky.dp.prototype.v3;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 通过反序列化实现深克隆
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(18, 100, new Location("bj", 22));
        Person p2 = CloneUtil.clone(p1);
        System.out.println(p2);

        System.out.println(p1.loc == p2.loc);
        p1.loc.street = "sh";
        System.out.println(p2.loc.street);

        // 全克隆 100000 个对象要多久？
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Person temp = CloneUtil.clone(p1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}

@AllArgsConstructor
@ToString
class Person implements Serializable {
    private static final long serialVersionUID = -280939426127136800L;
    int age;
    int score;
    Location loc;
}

@AllArgsConstructor
@ToString
class Location implements Serializable {
    private static final long serialVersionUID = 5934373144430208588L;
    String street;
    int roomNo;
}
