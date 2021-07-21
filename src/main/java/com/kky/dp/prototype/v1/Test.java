package com.kky.dp.prototype.v1;

/**
 * 浅克隆
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
//        System.out.println(p1 == p2);
//        System.out.println(p1.toString().equals(p2.toString()));

        p1.age = 18;
        System.out.println(p2.age);

        p1.loc.street = "sh";
        System.out.println(p2.loc.street);

        System.out.println(p1.loc == p2.loc);
    }
}

class Person implements Cloneable {
    int age = 8;
    int score = 100;

    Location loc = new Location("bj", 22);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", score=" + score +
                ", loc=" + loc +
                '}';
    }
}

class Location {
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
