package org.example.Factory;

import lombok.Data;

public class SimpleFactory {
    public static void main(String[] args) {}
    public Pizza cratePizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪pisa");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}

@Data
class Pizza {
    public String name;
}

@Data
class GreekPizza extends Pizza {

}

@Data
class CheesePizza extends Pizza {

}

@Data
class PepperPizza extends Pizza {

}