package org.example.builder;

public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasis();
    public abstract void buildWall();
    public abstract void roofed();
    public House buildHouse() {
        return house;
    }
}
