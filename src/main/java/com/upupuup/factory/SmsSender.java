package com.upupuup.factory;

/**
 * 发送短信
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("send sms");
    }
}
