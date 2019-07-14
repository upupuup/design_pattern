package com.upupuup.factory;

/**
 * 发送工厂类(普通)
 */
public class SendFactoryCommon {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("please enter");
            return null;
        }
    }
}
