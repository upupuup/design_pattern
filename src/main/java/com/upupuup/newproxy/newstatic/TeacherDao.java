package com.upupuup.newproxy.newstatic;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/13 16:22
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println("老师在上课");
	}
}
