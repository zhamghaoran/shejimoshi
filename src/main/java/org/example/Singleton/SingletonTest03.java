package org.example.Singleton;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null)
            singleton2 = new Singleton2();
        return singleton2;
    }
}
