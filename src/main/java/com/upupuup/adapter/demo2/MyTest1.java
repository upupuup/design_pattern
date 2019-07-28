package com.upupuup.adapter.demo2;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 12:32 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class MyTest1 {
    public static void main(String[] args) {
        // 北京厨师
        ICooker iCooker = new BeijingCooker();
        System.out.println(iCooker.cook());

        // 腾讯程序员
        IProgrammer iProgrammer = new TencentProgrammer();
        System.out.println(iProgrammer.program());
    }
}
