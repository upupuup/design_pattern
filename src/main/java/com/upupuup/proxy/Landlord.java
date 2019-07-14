package com.upupuup.proxy;

/**
 * 房东
 */
public class Landlord {
    public static void main(String[] args) {
        Intermediary intermediary = new Intermediary(new Tenant());
        intermediary.toFindHouse();
    }
}
