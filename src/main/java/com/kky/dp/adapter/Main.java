package com.kky.dp.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Main {

    public static final int VOLTAGE = 220;

    public static void main(String[] args) throws Exception {
        TV tv = new TV();
        tv.work(VOLTAGE);

        System.out.println("------");

        Adapter adapter = new Adapter();
        tv.work(adapter.convertVoltage(VOLTAGE));
    }
}
