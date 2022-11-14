package org.example.Singleton;

public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.INSTANCE;
        Singleton7 instance1 = Singleton7.INSTANCE;
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}
enum Singleton7 {
    INSTANCE; // 属性
    public void sayOK() {
        System.out.println("ok");
    }
}
