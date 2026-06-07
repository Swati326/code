package com.practice.Code.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Compartor {

    public static void main(String[] args) {

        Student student=new Student(1,"wwati","aune");
        Student student1=new Student(5,"tanisha","mumbai");
        List<Student> students= Arrays.asList(student,student1);

        Collections.sort(students,new NameComparator());
        System.out.println(students);
        Collections.sort(students,new CityComparator());
        System.out.println(students);
    }
}
