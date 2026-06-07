package com.practice.Code.interview.ignorepackage;

import com.practice.Code.cap.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupBydeptMaxSalInEach {

    public static void main(String[] args) {

        Employee employee1=new Employee("neha",2345l,"HR");
        Employee employee2=new Employee("yashi",9876l,"Developer");
        Employee employee4=new Employee("natasha",9876555l,"Developer");
        Employee employee3=new Employee("Anil",45678l,"Admin");

        List<Employee> employees= Arrays.asList(employee1,employee2,employee3,employee4);

        Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.maxBy(
                        Comparator.comparing(Employee::getSalary)  // get max salary
                )));


        System.out.println(collect);


        Optional<Employee> first = employees.stream().
                sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(first);

        Optional<Employee> first1 = employees.stream().
                sorted().skip(1).findFirst();
        System.out.println(first1);

        Optional<Employee> first12 = employees.stream().
                sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first12);
        String s="swaw";

        Map<Character, Long> collect1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new ,Collectors.counting()));
        System.out.println(collect1);

    }
}
