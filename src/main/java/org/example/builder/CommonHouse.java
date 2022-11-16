package org.example.builder;

public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasis() {
        System.out.println("5m");
    }

    @Override
    public void buildWall() {
        System.out.println("10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
