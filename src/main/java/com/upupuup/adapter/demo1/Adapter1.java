package com.upupuup.adapter.demo1;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 10:27 AM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Adapter1 extends Adaptee implements Target  {
    public void request() {
        System.out.println("类适配器1");
        this.specialRequest();
    }
}
