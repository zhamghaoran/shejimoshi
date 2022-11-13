package org.example.Singleton;

public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}
class Singleton6 {
    private static Singleton6 singleton6;
    private Singleton6() {}
    private static class SingletonInstance {
        private static final Singleton6 SINGLETON_6 = new Singleton6();
    }
    public static synchronized Singleton6 getInstance() {
        return SingletonInstance.SINGLETON_6;
    }
}
