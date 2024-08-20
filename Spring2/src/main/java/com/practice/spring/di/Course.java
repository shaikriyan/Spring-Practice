package com.practice.spring.di;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static java.lang.StringTemplate.STR;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private String courseName;

    private int coursePrice;

    private int courseDuration;





    @Override
    public String toString() {
        return STR."courseName = \{courseName}, coursePrice = \{coursePrice}, duration = \{courseDuration}";
    }
}
