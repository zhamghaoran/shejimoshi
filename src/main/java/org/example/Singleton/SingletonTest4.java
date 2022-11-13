package org.example.Singleton;

public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance = Singleton3.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3() {}
    public static synchronized  Singleton3 getInstance() {
        if (singleton3 == null)
            singleton3 = new Singleton3();
        return singleton3;
    }
}
