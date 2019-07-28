package com.upupuup.adapter.demo2;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 2:12 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class ProgrammerAdapter implements IWorkAdapter {
    public void work(Object worker) {
        System.out.println(((IProgrammer) worker).program());
    }

    public boolean support(Object worker) {
        return worker instanceof IProgrammer;
    }
}
