package com.practice.Code.comparble;

import com.practice.Code.cap.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeComparable {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setDept("IT");
        e1.setSalary(5000l);

        Employee e2 = new Employee();
        e2.setDept("IT");
        e2.setSalary(2007l);


        List<Employee> employees= Arrays.asList(e1,e2);


        Collections.sort(employees);
        System.out.println(employees);
    }
}
