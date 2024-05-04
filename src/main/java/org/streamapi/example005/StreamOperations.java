package org.streamapi.example005;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = List.of(
                new Employee(1, "John", "New York", 30, "Male", "HR", 2010, 60000),
                new Employee(2, "Jane", "Los Angeles", 25, "Female", "Finance", 2015, 70000),
                new Employee(3, "Bob", "Chicago", 40, "Male", "IT", 2005, 80000),
                new Employee(4, "Mary", "Houston", 35, "Female", "Marketing", 2008, 75000),
                new Employee(5, "Alice", "San Francisco", 28, "Female", "HR", 2012, 65000)
        );

        // Sample operations
        System.out.println("Names of all employees:");
        printEmployeeNames(employees);

        System.out.println("\nList of employees in the IT department:");
        List<Employee> itEmployees = filterEmployeesByDepartment(employees, "IT");
        printEmployeeNames(itEmployees);

        System.out.println("\nList of employees older than 30:");
        List<Employee> above30Employees = filterEmployeesByAge(employees, 30);
        printEmployeeNames(above30Employees);

        System.out.println("\nTotal salary of all employees: " + calculateTotalSalary(employees));
    }

    // Print names of all employees
    public static void printEmployeeNames(List<Employee> employees) {
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    // Filter employees by a specific department
    public static List<Employee> filterEmployeesByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    // Filter employees older than a specific age
    public static List<Employee> filterEmployeesByAge(List<Employee> employees, int age) {
        return employees.stream()
                .filter(employee -> employee.getAge() > age)
                .collect(Collectors.toList());
    }

    // Calculate total salary of all employees
    public static double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}
