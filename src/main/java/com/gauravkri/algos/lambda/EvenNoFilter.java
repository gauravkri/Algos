package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a lambda function to filter even numbers from a given list of integers.
public class EvenNoFilter {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

       List<Integer> eveIntegers =  numbers.stream().filter(a -> a%2 == 0).collect(Collectors.toList());

       eveIntegers.forEach(System.out::println);
    }
}
