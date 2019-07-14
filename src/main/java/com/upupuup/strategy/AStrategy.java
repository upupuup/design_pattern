package com.upupuup.strategy;

public class AStrategy implements Strategy {

    @Override
    public void operator() {
        System.out.println("策略A");
    }
}
