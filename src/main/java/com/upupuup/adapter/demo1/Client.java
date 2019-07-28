package com.upupuup.adapter.demo1;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 10:25 AM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter1();
        target.request();

        target = new Adapter2();
        target.request();
    }
}
