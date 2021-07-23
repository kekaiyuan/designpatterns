package com.kky.dp.iterator;

public class Main {
    public static void main(String[] args) {
        Collection_<String> list = new ArrayList_<>();
        for(int i=0; i<15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        //使用迭代器遍历
        Iterator_<String> it = list.iterator();
        while(it.hasNext()) {
            String string = it.next();
            System.out.print(string+" ");
        }

        System.out.println("\n--------------");

        Collection_<String> linkedList = new LinkedList_<>();
        for(int i=0; i<15; i++) {
            linkedList.add(new String("s" + i));
        }
        System.out.println(linkedList.size());

        //使用迭代器遍历
        Iterator_<String> it2 = linkedList.iterator();
        while(it2.hasNext()) {
            String string = it2.next();
            System.out.print(string+" ");
        }
    }
}


