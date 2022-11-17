package org.example.adapter;

public class VoltageAdapter extends VOltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        int scrV = output220v();
        int dstV = scrV / 44;
        return dstV;
    }
}
