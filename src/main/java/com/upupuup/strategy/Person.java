package com.upupuup.strategy;

public class Person {
    public static void main(String[] args) {
        UseStrategy useStrategy;

        // 使用策略A
        useStrategy = new UseStrategy(new AStrategy());
        useStrategy.operator();

        // 使用策略B
        useStrategy = new UseStrategy(new BStrategy());
        useStrategy.operator();

        // 使用策略C
        useStrategy = new UseStrategy(new CStrategy());
        useStrategy.operator();

    }
}
