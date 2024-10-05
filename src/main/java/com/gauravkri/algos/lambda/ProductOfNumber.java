package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;

//Find the product of all numbers in a list using reduce().
public class ProductOfNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer product = numbers.stream().reduce(1,(a,b)-> a * b);
        System.out.println(product);
    }
}
