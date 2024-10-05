package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullAndEmpty {

 public static void main(String[] args) {
    List<String> strings = Arrays.asList("epam", "", null, "lambda", "java");

    List<String> nonNullAndEmpty = strings.stream().filter(a -> a != null && !a.isEmpty()).collect(Collectors.toList());

    nonNullAndEmpty.forEach(System.out::println);
 }
}
