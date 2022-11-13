package org.example.Singleton;

public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());

    }
}
class Singleton4 {
    private static Singleton4 singleton4;
    private Singleton4() {}
    public static Singleton4 getInstance() {
        if (singleton4 == null)
            synchronized (Singleton4.class) {
                singleton4 = new Singleton4();
            }
        return singleton4;
    }
}
