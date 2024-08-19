package com.practice.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("loaded successfully");

        Sim sim = context.getBean("sim", Sim.class);

        sim.data();
        sim.calling();


    }


}
