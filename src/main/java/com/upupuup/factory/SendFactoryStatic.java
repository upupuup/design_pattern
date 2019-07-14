package com.upupuup.factory;

/**
 * 工厂模式（静态方法）
 */
public class SendFactoryStatic {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
