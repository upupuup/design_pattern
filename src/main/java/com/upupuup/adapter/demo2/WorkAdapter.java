package com.upupuup.adapter.demo2;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 12:35 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class WorkAdapter implements IWorkAdapter {
    /**
     * 工作
     * @param worker
     */
    public void work(Object worker) {
        // 判断是否是程序员
        if (worker instanceof IProgrammer) {
            System.out.println(((IProgrammer)worker).program());
        }

        // 判断是否是厨师
        if (worker instanceof ICooker) {
            System.out.println(((ICooker) worker).cook());
        }
    }

    public boolean support(Object worker) {
        return false;
    }
}
