package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * InnerGroupEmployeeByDepartment
 */
class Employee {

    String name;

    String department;

    Employee(String name, String department){
        this.name=name;
        this.department=department;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }
    
}
//Group employees by department.
public class GroupEmployeeByDepartment {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "Engineering"),
            new Employee("Charlie", "HR"),
            new Employee("David", "Engineering")
        );

        Map<String, List<String>> ret = employees.stream()
            .collect(Collectors
            .groupingBy(Employee::getDepartment,
            Collectors.mapping(Employee::getName,Collectors.toList())));

        System.out.println(ret);

    }
}
