package com.practice.Code.cap;

public class Employee implements Comparable<Employee> {

    private int id;
    private String firstName;
    private Long salary;
    private String dept;

    public Employee() {

    }

    public Employee(int id, String firstName, Long salary, String dept) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
        this.dept = dept;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(String firstName, Long salary, String dept) {
        this.firstName = firstName;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary,o.salary);
    }
}
