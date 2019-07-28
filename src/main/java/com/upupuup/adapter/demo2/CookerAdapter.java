package com.upupuup.adapter.demo2;

import com.sun.org.apache.bcel.internal.generic.ICONST;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 2:10 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class CookerAdapter implements IWorkAdapter{
    public void work(Object worker) {
        System.out.println(((ICooker) worker).cook());
    }

    public boolean support(Object worker) {
        return worker instanceof ICooker;
    }
}
