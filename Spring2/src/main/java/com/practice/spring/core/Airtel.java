package com.practice.spring.core;

public class Airtel implements Sim {

    public Airtel() {
        System.out.println("airtel class constr is called.");
    }

    @Override
    public void calling() {
        System.out.println("Calling from calling method airtel class");
    }

    @Override
    public void data() {
        System.out.println("Calling from data method of  airtel class");

    }
}
