package com.telran.org.lesson18.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Alex", "developer", 1500),
                new Employee("Thomas", "manager", 680.50),
                new Employee("Lia", "CEO", 5000),
                new Employee("Mary", "manager", 700),
                new Employee("Ken", "developer", 900)
        );

        // receive/get employee who gets salary more than 1000
        // receive/get employee with the lowest salary

        List<Employee> listResult = employeeList.stream().filter(x -> x.getSalary() > 1000).collect(Collectors.toList());

        System.out.println(listResult);

//        Optional<Employee> min = employeeList.stream().min(Comparator.comparingDouble(o1, o2) -> o1.getSalary() - o2.getSalary());
//        System.out.println(min.get());
        Optional<Employee> min = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(min.get());

    }
}
