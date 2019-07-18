package com.upupuup.newproxy.newstatic;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/13 16:29
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		ITeacherDao teacherDao = new TeacherDao();
		teacherDao.teach();

		// 创建代理对象
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

		// 调用代理对象方法
		teacherDaoProxy.teach();
	}
}
