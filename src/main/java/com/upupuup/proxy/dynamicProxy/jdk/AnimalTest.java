package com.upupuup.proxy.dynamicProxy.jdk;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalProxy animalProxy = new AnimalProxy();
        Animal dog = (Animal) animalProxy.getInstance(new Dog());
        dog.eat();
    }
}
