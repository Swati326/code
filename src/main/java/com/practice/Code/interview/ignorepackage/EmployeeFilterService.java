package com.practice.Code.interview.ignorepackage;

import com.practice.Code.cap.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class EmployeeFilterService {

    public List<Employee> getEmployee()
    {
        Employee employee = new Employee("swati",2000l,"IT");
        List<Employee> employees= Arrays.asList(employee);
        return employees;
    }

    public CompletableFuture<List<Employee>> getHighSalaryEmployees() {
        return CompletableFuture.supplyAsync(() ->
                getEmployee().stream().filter(e->e.getSalary()>100l).collect(Collectors.toList())
                );
    }

    public CompletableFuture<List<Employee>> getEmployeesFromPune() {
        return CompletableFuture.supplyAsync(() ->
                getEmployee().stream().filter(e->e.getDept().equalsIgnoreCase("IT")).collect(Collectors.toList())
                );
    }

    public CompletableFuture<List<Employee>> getFilteredEmployees() {
        CompletableFuture<List<Employee>> salaryFuture = getHighSalaryEmployees();
        CompletableFuture<List<Employee>> puneFuture = getEmployeesFromPune();

        return salaryFuture.thenCombine(puneFuture, (salaryList, puneList) ->
                salaryList.stream()
                        .filter(puneList::contains)  // common employees in both lists
                        .collect(Collectors.toList())
        );
    }

    public static void main(String[] args) {
        EmployeeFilterService service = new EmployeeFilterService();
        List<Employee> finalList = service.getFilteredEmployees().join();

        System.out.println("Employees with salary > 20000 and from Pune:");
        finalList.forEach(System.out::println);
    }
}

