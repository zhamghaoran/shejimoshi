package org.example;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}
class Singleton {
    private Singleton() {}
    public final static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }
}

