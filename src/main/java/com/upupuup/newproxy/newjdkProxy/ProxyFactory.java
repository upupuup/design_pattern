package com.upupuup.newproxy.newjdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/13 16:47
 * @Version: 1.0
 * @Description: 代理对象
 */
public class ProxyFactory {
	/**
	 * 维护一个目标对象
 	 */
	private Object target;

	/**
	 * 构造方法
	 * @param target
	 */
	public ProxyFactory(Object target) {
		this.target = target;
	}

	/**
	 * 给目标对象生成一个代理对象
	 * @return
	 */
	public Object getProxyInstance() {
		/**
		 *     public static Object newProxyInstance(ClassLoader loader,
		 *                                           Class<?>[] interfaces,
		 *                                           InvocationHandler h)
		 *                                           // loader: 当前目标对象的类加载器
		 *                                           // interfaces：目标对象的接口类型
		 *                                           // h: 事件处理
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK代理开始");
				// 使用反射机制调用目标对象
				Object invoke = method.invoke(target, args);
				System.out.println("JDK代理结束");
				return invoke;
			}
		});
	}
}
