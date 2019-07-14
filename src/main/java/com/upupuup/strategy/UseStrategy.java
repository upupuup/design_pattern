package com.upupuup.strategy;

public class UseStrategy {
    private Strategy strategy;

    // 构造函数，你需要使用哪个策略
    public UseStrategy (Strategy strategy) {
        this.strategy = strategy;
    }

    // 使用策略
    public void operator() {
        this.strategy.operator();
    }

}
