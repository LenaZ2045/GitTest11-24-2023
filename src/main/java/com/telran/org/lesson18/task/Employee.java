package com.telran.org.lesson18.task;

public class Employee {

    private String name;
    private String duty;
    private double salary;

    public Employee(String name, String duty, double salary) {
        this.name = name;
        this.duty = duty;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", duty='" + duty + '\'' +
                ", salary=" + salary +
                '}';
    }
}
