package Annotations;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//@Setter
public class Employee {

    @Setter
    @Value("${name}")
    private String name;

    @Setter
    @Value("${id}")
    private int id;

    @Autowired
    @Qualifier("skills123")
    private Skills skills;

    public Employee(Skills skills) {
        System.out.println("Employee.Employee constructor");
        this.skills = skills;
    }

    public Employee() {
    }

    public void setSkills(Skills skills) {
        System.out.println("Employee.setSkills setter method");
        this.skills = skills;
    }

    public void intro(){
        System.out.println(STR."Hi I'm \{name}. and my empId is \{id}");
        skills.showSkills();
    }

}
