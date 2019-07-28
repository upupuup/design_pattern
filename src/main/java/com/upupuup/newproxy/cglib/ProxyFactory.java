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
        /**
         * Enhancer是一个非常重要的类,它允许为非接口类型创建一个JAVA代理,
         * Enhancer动态的创建给定类的子类并且拦截代理类的所有的方法，
         * 和JDK动态代理不一样的是不管是接口还是类它都能正常工作
         */
        Enhancer enhancer = new Enhancer();
        // 设置父类，告诉Cglib，生成的子类要继承哪个类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数，使生成的代理类对象在调用被代理类方法时，都去调用下面的intercept方法
        enhancer.setCallback(new ProxyFactory(target));
        // 创建子类对象，即代理对象。做的工作：1.生成源代码。2.编译成class文件。3.加载到JVM中，生成并返回被代理对象等等。
        return enhancer.create();
    }

    /**
     * 调用目标对象的方法
     * @param object cglib生成的代理对象
     * @param method 被代理对象方法
     * @param args 方法入参
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib start");
        System.out.println("打印日志：方法" + method.getName() + "执行了");
        Object invoke = method.invoke(target, args);
        System.out.println("cglib end");
        return invoke;

    }
}
