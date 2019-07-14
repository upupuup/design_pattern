package com.upupuup.proxy;

/**
 * 房客
 */
public class Tenant implements FindHouse {

    @Override
    public void toFindHouse() {
        System.out.println("房客要找房子！");
    }
}
