package com.upupuup.newproxy.newjdkProxy;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/13 17:00
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		ITeacherDao target = new TeacherDao();

		// 给目标对象创建代理对象,
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
		System.out.println(proxyInstance.getClass());
		proxyInstance.teach();
	}
}
