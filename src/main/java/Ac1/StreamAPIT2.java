package Ac1;

import com.practice.Code.cap.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIT2 {

    /*

     */

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
       new Employee(1,"swati",80l,"IT"),
                new Employee(5,"nisha",120l,"IT"),
        new Employee(3,"nira",90l,"HR"),
        new Employee(2,"mira",60l,"OPERATION"),
        new Employee(7,"priya",20l,"RECEPTIONIST"));

        employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));


        Optional<Employee> maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxSalary);
        // group dept, find salary, avg function
        Map<String, Double> collect = employees.stream().collect(
                Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collect);

        Map<String, Long> collect1 = employees.stream().collect(
                Collectors.groupingBy(Employee::getDept, Collectors.counting())
        );

        System.out.println(collect1);


        //👉 Find the department with the highest average salary

        Optional<Map.Entry<String, Double>> first = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary))).entrySet()
                .stream().max(Comparator.comparing(Map.Entry::getValue)).stream().findFirst();
        System.out.println(first);

        // 2️⃣2️⃣ Find longest string using streams


    }
}
