package org.example.Singleton;

public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

class Singleton1 {
    private Singleton1(){}
    private static Singleton1 instance;
    static {
        instance = new Singleton1();
    }
    public static Singleton1 getInstance() {
        return instance;
    }
}

