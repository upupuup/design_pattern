package com.upupuup.newproxy.newstatic;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/13 16:23
 * @Version: 1.0
 * @Description: 代理对象，静态代理
 */
public class TeacherDaoProxy implements ITeacherDao{
	/**
	 * 被代理的对象
 	 */
	private ITeacherDao iTeacherDao;

	/**
	 * 构造方法
 	 * @param iTeacherDao
	 */
	public TeacherDaoProxy(ITeacherDao iTeacherDao) {
		this.iTeacherDao = iTeacherDao;
	}

	@Override
	public void teach() {
		System.out.println("开始代理");
		iTeacherDao.teach();
		System.out.println("代理结束");
	}
}
