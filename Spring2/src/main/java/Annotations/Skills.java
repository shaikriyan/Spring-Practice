package Annotations;

import lombok.Setter;

@Setter
public class Skills {

    private String skill;

    private int yearsOfExperience;

    public void showSkills(){
        System.out.println(STR."I have \{yearsOfExperience} years of Experience in \{skill}");
    }



}
