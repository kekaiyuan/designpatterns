package com.kky.dp.adapter;

public class Adapter {
    public int convertVoltage(int voltage) {
        if (voltage > 110) {
            return 110;
        } else {
            return voltage;
        }
    }
}
