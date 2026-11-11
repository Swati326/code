package fiveyrs;

import com.practice.Code.cap.Employee;
import com.practice.Code.poly.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SecondndHighSalPerDept {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Rahul",30000l,"IT");
        Employee e2=new Employee(2,"Nisha",1300l,"IT");
        Employee e3=new Employee(15,"Swati",5005l,"IT");
        Employee e4=new Employee(17,"Mihul",4000l,"IT");

        Employee e5=new Employee(11,"Rina",30000l,"HR");
        Employee e6=new Employee(25,"Tanisha",13000l,"HR");
        Employee e7=new Employee(65,"Pooja",507l,"HR");
        Employee e8=new Employee(87,"Neha",4000l,"HR");

        Employee e9=new Employee(22,"Tina",500l,"Admin");
        Employee e10=new Employee(89,"Manu",790l,"Admin");
        Employee e11=new Employee(9,"Gauri",658l,"Admin");
        Employee e12=new Employee(10,"dipa",700l,"Admin");

        List<Employee> employeeList= Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12);

        Map<String, Optional<Employee>> collect = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(
                        Collectors.toList(), list -> list.stream().
                         sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst()
                )));

        System.out.println(collect);

        //Find duplicate char in string with count

        String s="swwiss";
        List<Map.Entry<Character, Long>> collect1 = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()))
                .entrySet().stream().filter(set -> set.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect1);

        //Department with highest average salary

        Map.Entry<String, Double> stringDoubleEntry = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingLong(Employee::getSalary)))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();


        System.out.println(stringDoubleEntry);


        // Flatten List

        List<List<Integer>> list =
                Arrays.asList(
                        Arrays.asList(1,2,3),
                        Arrays.asList(4,5),
                        Arrays.asList(6,7));

        List<Integer> collect4 = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect4);

        // Find Top 3 salaries accross all department

        List<Employee> collect2 = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3).collect(Collectors.toList());
        System.out.println(collect2);
    }
}
