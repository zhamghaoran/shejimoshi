package org.example.Factory;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("这是抽象工厂模式");
        Pizza pizza = null;
        return pizza;
    }
}
