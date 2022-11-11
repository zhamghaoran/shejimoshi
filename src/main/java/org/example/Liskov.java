package org.example;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func(11,3));
        System.out.println("1 - 8 = " + a.func(1,8));
        System.out.println("--------");
        B b = new B();
        System.out.println("11 - 3 = " + b.func(11,3));
        System.out.println("1 - 8 = " + b.func(11,3));
        System.out.println("11 + 3 + 9 = " + b.func(11,3));
    }

}

class A {
    public int func(int num1,int num2) {
        return num1 - num2;
    }
}
class B extends A {
    @Override
    public int func(int num1, int num2) {
        return num1 + num2;
    }
    public int fun2(int a,int b) {
        return func(a,b) + 9;
    }
}