package org.streamapi.example006;

import java.util.List;

public class NewStreamOp {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", "New York", 25, "Male", "HR", 2015, 50000.00),
                new Employee(2, "Jane", "Los Angeles", 30, "Female", "Finance", 2018, 60000.00),
                new Employee(3, "Bob", "Chicago", 35, "Male", "IT", 2020, 70000.00),
                new Employee(4, "Mary", "Houston", 40, "Female", "Marketing", 2022, 80000.00),
                new Employee(5, "Alice", "San Francisco", 45, "Female", "HR", 2023, 90000.00),
                new Employee(6, "Mike", "San Diego", 50, "Male", "Finance", 2024, 100000.00),
                new Employee(7, "Sarah", "Dallas", 55, "Female", "IT", 2025, 110000.00),
                new Employee(8, "David", "Seattle", 60, "Male", "Marketing", 2026, 120000.00),
                new Employee(9, "Emily", "Boston", 65, "Female", "HR", 2027, 130000.00),
                new Employee(10, "Alex", "Miami", 70, "Male", "Finance", 2028, 140000.00),
                new Employee(11, "Olivia", "Phoenix", 75, "Female", "IT", 2029, 150000.00),
                new Employee(12, "Liam", "Denver", 80, "Male", "Marketing", 2030, 160000.00),
                new Employee(13, "Grace", "Las Vegas", 85, "Female", "HR", 2031, 170000.00),
                new Employee(14, "Noah", "San Antonio", 90, "Male", "Finance", 2032, 180000.00),
                new Employee(15, "Chloe", "Portland", 95, "Female", "IT", 2033, 190000.00),
                new Employee(16, "Ethan", "Salt Lake City", 100, "Male", "Marketing", 2034, 200000.00),
                new Employee(17, "Ava", "Nashville", 105, "Female", "HR", 2035, 210000.00),
                new Employee(18, "Mason", "Milwaukee", 110, "Male", "Finance", 2036, 220000.00),
                new Employee(19, "Lily", "Memphis", 115, "Female", "IT", 2037, 230000.00),
                new Employee(20, "Ella", "Oklahoma City", 120, "Female", "Marketing", 2038, 240000.00)
        );

        NewStreamOp newStreamOp = new NewStreamOp();
        newStreamOp.printEmployeeProperty(employees, "Name");
        newStreamOp.printEmployeeProperty(employees, "Age");
        newStreamOp.printEmployeeProperty(employees, "City");
        newStreamOp.printEmployeeProperty(employees, "Gender");
        newStreamOp.printEmployeeProperty(employees, "Department");
        newStreamOp.printEmployeeProperty(employees, "Salary");
    }

    private void printEmployeeProperty(List<Employee> employees, String property) {
        System.out.println(property + " of all employees:");
        employees.stream().map(employee -> getProperty(employee, property)).forEach(System.out::println);
        System.out.println();
    }

    private String getProperty(Employee employee, String property) {
        return switch (property) {
            case "Name" -> employee.getName();
            case "Age" -> String.valueOf(employee.getAge());
            case "City" -> employee.getCity();
            case "Gender" -> employee.getGender();
            case "Department" -> employee.getDepartment();
            case "Salary" -> String.valueOf(employee.getSalary());
            default -> "";
        };
    }
}
