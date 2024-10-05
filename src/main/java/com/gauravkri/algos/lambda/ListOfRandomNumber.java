package com.gauravkri.algos.lambda;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListOfRandomNumber {


    public static void main(String[] args) {
        int l =10;
        List<Integer> randomList =  new Random().ints(l,1,100)
        .boxed()
        .collect(Collectors.toList());
        randomList.forEach(System.out::println);
    }
}
