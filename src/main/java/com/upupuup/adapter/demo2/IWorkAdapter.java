package com.upupuup.adapter.demo2;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 12:34 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public interface IWorkAdapter {
    /**
     * 工作
     * @param worker
     */
    void work(Object worker);

    /**
     * 判断当前适配器是否支持指定工种
     * @param worker
     */
    boolean support(Object worker);
}
