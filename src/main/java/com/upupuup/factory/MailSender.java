package com.upupuup.factory;

/**
 * 发送邮件
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send e-mail");
    }
}
