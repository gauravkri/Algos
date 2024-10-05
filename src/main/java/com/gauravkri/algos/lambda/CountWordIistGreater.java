package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;


//You are given a list of words. Write a lambda expression to count the number of words whose length is greater than 4.
public class CountWordIistGreater {
    public static void main(String[] args) {
        
    List<String> words = Arrays.asList("java", "lambda", "expression", "epam", "code");

    long count =  words.stream().filter(a -> a.length()>4).count();
     
    System.out.println(count);
    }
}
