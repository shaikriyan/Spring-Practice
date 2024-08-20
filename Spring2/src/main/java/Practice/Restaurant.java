package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Restaurant {

    public static void main(String[] args) {


//        Chef chef = new Chef();

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans-practice.xml");
//        Chef chef = context.getBean("chef", Chef.class);
//        chef.cooking();
//
//        Chef chef1 = context.getBean("chef1", Chef.class);
//        chef1.cooking();
//
//        Chef chef2 = context.getBean("chef2", Chef.class);
//        chef2.cooking();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-practice.xml");
        Chef chef = context.getBean("chef", Chef.class);
        chef.cooking();

    }


}
