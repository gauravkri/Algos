package com.gauravkri.algos.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Sort a list of strings by length using lambda expressions.
public class SortStringByLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        Comparator<String> sortedBylength1 = new Comparator<String>() {
           @Override
            public int compare(String s1, String s2){
                return Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length()));
            }
        };
        List<String> sorted = words.stream().sorted(sortedBylength1).toList();

        List<String> sorted1 = words.stream()
                                .sorted((x,y) -> Integer.compare(x.length(), y.length()))
                                .toList();

        System.out.println(Arrays.toString(sorted.toArray()));
        System.out.println(Arrays.toString(sorted1.toArray()));
    }

}
