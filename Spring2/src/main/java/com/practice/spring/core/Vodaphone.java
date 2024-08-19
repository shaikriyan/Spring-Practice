package com.practice.spring.core;

import com.practice.spring.core.Sim;

public class Vodaphone implements Sim {

    public Vodaphone() {
        System.out.println("vodaphone class constr is called.");

    }

    @Override
    public void calling() {
        System.out.println("Calling from calling method vodaphone class");
    }

    @Override
    public void data() {
        System.out.println("Calling from data method of  vodaphone class");

    }
}
