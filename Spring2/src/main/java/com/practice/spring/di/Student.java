package com.practice.spring.di;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Student {

    private String studentName;
    private int id;

    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    /*
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public void setId(int id) {
        this.id = id;
    }
*/

    public String getCourseInfo(){
        return STR."name = \{course.getCourseName()}, price = \{course.getCoursePrice()}, duration = \{course.getCourseDuration()}";
    }


    @Override
    public String toString() {
        return STR."name = \{studentName} , id = \{id}, course = \{course}";
    }
}
