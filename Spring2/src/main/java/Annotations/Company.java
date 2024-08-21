package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
        Employee emp1 = context.getBean("emp1", Employee.class);
        emp1.intro();


    }
}
