package com.gauravkri.algos.lambda;


import java.util.List;
import java.util.stream.IntStream;

//Calculate the sum of a large list of integers using parallel streams.
public class SumofLargeInteger {

    public static void main(String[] args) {
        List<Integer> largeNumbers = IntStream
            .rangeClosed(1, 1_000_000)
            .boxed()
            .toList();

        long sum = largeNumbers.parallelStream().mapToLong(Integer::intValue).sum();
        System.out.println("sum " + sum);

    }
}
