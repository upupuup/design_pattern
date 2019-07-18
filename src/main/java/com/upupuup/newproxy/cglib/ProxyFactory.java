package com.upupuup.newproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author:upupupuup
 * @Date:2019/7/14 2:50 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 维护一个目标对象
     */
    private Object target;

    /**
     * 构造函数
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 创建工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数,调用自己
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 调用目标对象的方法
     * @param object
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib start");
        System.out.println("打印日志：方法" + method.getName() + "执行了");
        Object invoke = method.invoke(target, args);
        System.out.println("cglib end");
        return invoke;

    }
}
