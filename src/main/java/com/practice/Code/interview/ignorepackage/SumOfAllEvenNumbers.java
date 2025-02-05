package com.practice.Code.interview.ignorepackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllEvenNumbers {

    public static void main(String[] args) {


        int[] number = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        int sum1 = Arrays.stream(number).filter(n -> n % 2 == 0).sum();
        System.out.println(sum1);


        // How would you sort a list of employees based on name and department when each employee has an ID, name, salary, and department?


        List<Person> people=new ArrayList<>();
        Person person1=new Person("John",23);
        Person person2=new Person("prya",28);

        Person person3=new Person("Arbaz",67);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        List<Person> collect = people.stream().sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge)).collect(Collectors.toList());
        System.out.println(collect);


        // Sorting by name (Descending) and then age
        List<Person> collect1 = people.stream().sorted(Comparator.comparing(Person::getName,Comparator.reverseOrder()).thenComparing(Person::getAge,Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(collect1);

        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Alice");
        employees.put(2, "Bob");
        employees.put(3, "Charlie");
        employees.put(4, "David");
        employees.put(5, "Amar");

        // Filter employees whose names start with 'A' or 'B' and then sort them by name
        List<String> name = employees.entrySet().stream().
                filter(employee -> employee.getValue().startsWith("A") ||
                        employee.getValue().startsWith("B")).sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getValue).collect(Collectors.toList());
        System.out.println(name);
    }
}
