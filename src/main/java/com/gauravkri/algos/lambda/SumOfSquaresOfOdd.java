package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double result = numbers.stream().filter(a->a%2 !=0).map(a -> Math.pow(a,2)).reduce(0.0, Double::sum );
        System.out.println(result);
    }
}