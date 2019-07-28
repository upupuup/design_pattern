package com.upupuup.facade;

import javax.jws.Oneway;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 2:54 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Facade {
    private Cpu cpu;
    private Ddr ddr;
    private Ssd ssd;

    public void onFacade() {
        cpu = new Cpu();
        cpu.start();
        ddr = new Ddr();
        ddr.start();
        ssd = new Ssd();
        ssd.start();
    }
}
