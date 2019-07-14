package com.upupuup.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Source source = new Source();
        // 动态扩展一个类的功能，动态的为一个对象增加功能，而且还能动态撤销
        // 缺点：产生过多的相似对象，不易排错
        Sourceable sourceable = new Decorator(source);
        sourceable.method();
    }
}
