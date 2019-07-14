package com.upupuup.newproxy.cglib;

/**
 * @Author:upupupuup
 * @Date:2019/7/14 3:05 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 获取代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        // 执行代理对象，intercept方法，从而实现对目标方法的调用
        proxyInstance.teach();
    }
}
