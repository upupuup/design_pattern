package com.upupuup.factory;

public class FactoryTest {
    public static void main(String[] args) {
        // 工厂模式（普通实现）
        System.out.println("工厂模式（普通实现），如果传入的参数有误，那么就不能创建实例对象");
        SendFactoryCommon sendFactoryCommon = new SendFactoryCommon();
        Sender mailCommon = sendFactoryCommon.produce("mail");
        mailCommon.send();

        // 工厂模式（多个方法）
        System.out.println("工厂模式（多个方法）");
        SendFactoryManyMethod sendFactoryManyMethod = new SendFactoryManyMethod();
        Sender senderManyMethod = sendFactoryManyMethod.produceMail();
        senderManyMethod.send();

        // 工厂模式（静态方法）
        System.out.println("工厂模式（静态方法）,相对于第二种，不需要实例化，所以大多数情况下会使用第三种。");
        Sender senderStatic = SendFactoryStatic.produceMail();
        senderStatic.send();
    }
}
