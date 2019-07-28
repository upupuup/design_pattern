package com.upupuup.regularexpress;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/7/17 10:56
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class RegularExpressDemo {
	public static void main(String[] args) {
		boolean flag = MatchUtils.match(MatchUtils.REGEX_COMPANY_CODE, "PaAA");
		System.out.println(flag);
	}
}
