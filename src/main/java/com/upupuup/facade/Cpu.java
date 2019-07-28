package com.upupuup.facade;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 2:51 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Cpu implements Computer {
    public void start() {
        System.out.println("CPU开始工作");
    }

    public void stop() {
        System.out.println("CPU结束工作");
    }
}
