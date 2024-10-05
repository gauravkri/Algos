package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombineNames {

  


 public static void main(String[] args) {
    List<String> firstNames = Arrays.asList("John", "Jane", "Paul");
    List<String> lastNames = Arrays.asList("Doe", "Smith", "Walker");

    List<String> combList = IntStream.range(0, firstNames.size())
                            .mapToObj(i -> firstNames.get(i)+" "+lastNames.get(i))
                            .collect(Collectors.toList());

    combList.forEach(System.out::println);
 }
}
