package com.upupuup.adapter.demo1;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 10:27 AM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Adapter2 implements Target {
    /**
     * 被适配者，通过new的方式实现
     */
    Adaptee adaptee = new Adaptee();

    public void request() {
        System.out.println("类适配器2");
        adaptee.specialRequest();
    }
}
