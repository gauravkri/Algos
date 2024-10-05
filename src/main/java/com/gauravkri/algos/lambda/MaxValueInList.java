package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;

public class MaxValueInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 5, 12, 7);

        Integer n = numbers.stream().reduce(0,(a,b)-> a>b?a:b);
        System.out.println(n);
    }

}
