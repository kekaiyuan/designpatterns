package com.kky.dp.adapter;

/*
当电压 < 110 V 时，电视无法工作。
当电压 = 110 V 时，电视正常工作。
当电压 > 110 V 时，电视爆炸！
 */
public class TV1 {
    public void work(Electricity electricity) {
        if (electricity.getVoltage() > 110) {
            System.out.println("boom!!!");
        } else if (electricity.getVoltage() == 110) {
            System.out.println("normal work");
        } else if (electricity.getVoltage() < 110) {
            System.out.println("can't work");
        }
    }
}
