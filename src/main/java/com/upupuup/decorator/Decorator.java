package com.upupuup.decorator;

/**
 * 装饰者类
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator");
        sourceable.method();
        System.out.println("before after");
    }
}
