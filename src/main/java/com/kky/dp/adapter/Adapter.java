package com.kky.dp.adapter;

//变压器
public class Adapter {
    Electricity electricity;

    public Adapter(Electricity electricity) {
        this.electricity = electricity;
    }

    public int getVoltage() {
        if (electricity.getVoltage() > 110) {
            return 110;
        } else {
            return electricity.getVoltage();
        }
    }
}
