package com.kky.dp.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
        Electricity electricity = new Electricity(220);
        TV1 tv1 = new TV1();
        tv1.work(electricity);

        System.out.println("------");

        TV2 tv2 = new TV2();
        Adapter adapter = new Adapter(electricity);
        tv2.work(adapter);
    }
}
