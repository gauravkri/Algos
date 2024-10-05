package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//You are given a list of employees where each employee has a name and an age. 
//Write a function to sort the employees by age using lambda expressions


/**
 * Employees
 */
class Employees {
    String name;
    int age;



    Employees(String name, int age){
        this.age=age;
        this.name =name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class SortListByEmp {

    public static void main(String[] args) {
        List<Employees> list = Arrays.asList(
            new Employees("gaurav",26),
            new Employees("John",26),
            new Employees("Bob",26),
            new Employees("Alice",26)
        );

        list.sort(Comparator.comparingInt(Employees::getAge));
        list.forEach(System.out::println);
    }
}
