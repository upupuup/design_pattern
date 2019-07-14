package com.upupuup.factory;

/**
 * 工厂模式（多个方法）
 */
public class SendFactoryManyMethod {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender smsSender() {
        return new SmsSender();
    }

}
