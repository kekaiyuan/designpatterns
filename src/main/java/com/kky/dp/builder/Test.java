package com.kky.dp.builder;

public class Test {
    public static void main(String[] args) {
        //链式编程
        Computer computer = new ComplexComputerBuilder()
                .buildCPU("intel", "i5-8600K", "3.6GHZ", 6)
                .buildGPU("NVIDIA", "GTX 1060", "6G")
                .buildMainBoard("华硕", "B250M-PLUS", "LGA 1151")
                .build();
        System.out.println(computer);
    }
}
