package com.upupuup.Singleton;

public class King {
    private static King king = null;

    public King() {

    }

    public static King getInstance() {
        // 如果没有定义皇帝，定义一个
        if (king == null) {
            king = new King();
        }
        return king;
    }

    public static void kingInfo() {
        System.out.println("我是国王");
    }
}
