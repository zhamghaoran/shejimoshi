package org.example.utils;

/**
 * 1.简单比较容易想到
 * 2.如果我们获取的对象是 微信，短信等，则新增类，同时person也要增加相应的接受方法
 * 3.解决方法:引入一个抽象的接口IReceiver，表示接受者，这样Person类与接口IReceiver发生依赖
 *  因为Email，WeiXin 等等属于接受的范畴，他们各自实现IReceiver接口就ok，这样我们就完成了依赖倒置
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}
interface IReceiver {
    public String getInfo();
}
class Email implements IReceiver{
    public String getInfo() {
        return "电子邮件信息: hello world";
    }
}
class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息: hello ,ok";
    }
}
class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}