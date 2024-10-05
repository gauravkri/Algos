package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "epam");

        List<String> uppCaseWord =  words.stream().map(String::toUpperCase).collect(Collectors.toList());

        uppCaseWord.forEach(System.out::println);
    }
}
