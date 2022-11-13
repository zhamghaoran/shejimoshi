package org.example.Singleton;

public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
class Singleton5 {
    private static Singleton5 singleton5;
    private Singleton5() {}
    public static Singleton5 getInstance() {
        if (singleton5 == null ) {
            synchronized (Singleton5.class) {
                if (singleton5 == null)
                    singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }
}