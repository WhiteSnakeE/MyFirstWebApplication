package com.vladkharchenko.spring.mvc_hibernate_aop.questions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor

public class Questions {

    private int schoolsOfWitchers;

    private int nameOfSword;

    private int LethoOfGulet;

    private int sum;

//    public int sum = 0;



//    public Set<String> getSchoolsOfWitchers() {
//        return schoolsOfWitchers.keySet();
//    }
//
//    public void setSchoolsOfWitchers(Map<String, Integer> schoolsOfWitchers) {
//        this.schoolsOfWitchers = schoolsOfWitchers;
//    }
//
//    private Map<String,Integer> schoolsOfWitchers;
//
//
//    public Questions() {
//        schoolsOfWitchers = new HashMap<>();
//        schoolsOfWitchers.put("Wolf school",1);
//        schoolsOfWitchers.put("Griffin school",0);
//        schoolsOfWitchers.put("Snake school",0);
//        schoolsOfWitchers.put("Bear school",0);
//    }
}
