package com.kky.dp.bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ModernFurniture(new Chair()));
        System.out.println(new ClassicalFurniture(new Chair()));
        System.out.println(new ModernFurniture(new Table()));
        System.out.println(new ClassicalFurniture(new Table()));
    }
}
