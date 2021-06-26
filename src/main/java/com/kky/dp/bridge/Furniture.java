package com.kky.dp.bridge;

public abstract class Furniture {
    String name = null;
    FurnitureType furnitureType;

    public Furniture(FurnitureType furnitureType){
        this.furnitureType = furnitureType;
    }

    @Override
    public String toString() {
        return name + " " + furnitureType.name;
    }
}
