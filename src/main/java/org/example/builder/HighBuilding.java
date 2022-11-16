package org.example.builder;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasis() {
        System.out.println("100mi");
    }

    @Override
    public void buildWall() {
        System.out.println("20cm");
    }

    @Override
    public void roofed() {
        System.out.println("透明屋顶");
    }
}
