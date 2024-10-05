package com.gauravkri.algos.lambda;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStrngBylength {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("epam", "java", "programming", "code", "lambda");

       Map<Integer, List<String>> gr =  words.stream().collect(Collectors.groupingBy(String::length));
      System.out.println(gr);
    }

}
