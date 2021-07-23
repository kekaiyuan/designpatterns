package com.kky.dp.builder;

public class ComplexComputerBuilder implements ComputerBuilder {
    Computer computer = new Computer();

    @Override
    public ComputerBuilder buildCPU(String producer, String model, String frequency, Integer coreNum) {
        computer.cpu = new CPU(producer, model, frequency, coreNum);
        return this;
    }

    @Override
    public ComputerBuilder buildGPU(String producer, String model, String memory) {
        computer.gpu = new GPU(producer, model, memory);
        return this;
    }

    @Override
    public ComputerBuilder buildMainBoard(String producer, String model, String interfaceType) {
        computer.mainBoard = new MainBoard(producer, model, interfaceType);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
