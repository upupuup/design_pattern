package com.upupuup.proxy;

/**
 * 中介
 */
public class Intermediary implements FindHouse {
    private FindHouse findHouse;

    public Intermediary(FindHouse findHouse) {
        this.findHouse = findHouse;
    }

    @Override
    public void toFindHouse() {
        this.findHouse.toFindHouse();
    }
}
