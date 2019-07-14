package com.upupuup.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CglibProxy implements MethodInterceptor {
    private Object target;

    public Object getInstance(Object target) {
/*        this.target = target;
        Enhancer enhancer = new Enhancer();

        // 设置父类为实例类
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();*/
        this.target = target;
        Enhancer enhancer = new Enhancer();
        // 设置父类为实例类
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        Map<String, String> hashtable = new Hashtable();
        hashtable.put("1", "1");

        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "1");
        return result;
    }
}
