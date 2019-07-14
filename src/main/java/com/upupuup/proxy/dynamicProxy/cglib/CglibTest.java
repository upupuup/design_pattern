package com.upupuup.proxy.dynamicProxy.cglib;

public class CglibTest {
    public static void main(String[] args) {
        // CgLib动态代理调用
        CglibProxy proxy = new CglibProxy();
        Panda panda = (Panda)proxy.getInstance(new Panda());
        panda.eat();
    }
}
