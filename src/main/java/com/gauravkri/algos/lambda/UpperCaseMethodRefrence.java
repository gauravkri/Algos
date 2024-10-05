package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;

public class UpperCaseMethodRefrence {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream");

        List<String> upperWords= words.stream().map(String::toUpperCase).toList();
        System.out.println(Arrays.toString(upperWords.toArray()));
    }

}
