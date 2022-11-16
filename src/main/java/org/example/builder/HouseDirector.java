package org.example.builder;

public class HouseDirector {
    HouseBuilder houseBuilder = null;
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse() {
        houseBuilder.buildBasis();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
