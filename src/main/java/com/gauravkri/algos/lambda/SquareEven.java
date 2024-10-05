package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, return a list of the square of each number that is even.
public class SquareEven {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenSquare = numbers.stream().filter(n -> n%2 ==0 ).map(n-> (int)Math.pow(n, 2)).toList();

        for(Integer i : evenSquare)
         System.out.println(i);
    }

}
