package com.kky.dp.builder;

public interface ComputerBuilder {
    //返回类型为 ComputerBuilder 是为了链式编程
    ComputerBuilder buildCPU(String producer, String model, String frequency, Integer coreNum);

    ComputerBuilder buildGPU(String producer, String model, String memory);

    ComputerBuilder buildMainBoard(String producer, String model, String interfaceType);

    Computer build();
}
