package org.example.adapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5,不能充电");
        }
    }
}
