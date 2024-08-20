package com.practice.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-di.xml");
        System.out.println("context loaded successfully");

        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1);

        Student stu2 = (Student) context.getBean("student2");
        System.out.println(stu2);

    }


}
