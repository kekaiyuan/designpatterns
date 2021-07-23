package com.kky.dp.builder;

import java.awt.*;

public class Computer {
    CPU cpu;                //CPU
    GPU gpu;                //GPU
    MainBoard mainBoard;    //主板

    @Override
    public String toString() {
        return cpu.toString() + "\n" + gpu.toString() + "\n" + mainBoard.toString();
    }
}

class CPU {
    String producer;    //制造商
    String model;       //型号
    String frequency;   //主频
    Integer coreNum;    //核心数

    public CPU(String producer, String model, String frequency, Integer coreNum) {
        this.producer = producer;
        this.model = model;
        this.frequency = frequency;
        this.coreNum = coreNum;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", frequency='" + frequency + '\'' +
                ", coreNum=" + coreNum +
                '}';
    }
}

class GPU {
    String producer;    //制造商
    String model;       //型号
    String memory;      //内存大小

    public GPU(String producer, String model, String memory) {
        this.producer = producer;
        this.model = model;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}

class MainBoard {
    String producer;        //制造商
    String model;           //型号
    String interfaceType;   //接口类型

    public MainBoard(String producer, String model, String interfaceType) {
        this.producer = producer;
        this.model = model;
        this.interfaceType = interfaceType;
    }

    @Override
    public String toString() {
        return "MainBoard{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", interfaceType='" + interfaceType + '\'' +
                '}';
    }
}


