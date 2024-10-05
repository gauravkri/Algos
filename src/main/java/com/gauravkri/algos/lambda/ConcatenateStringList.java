package com.gauravkri.algos.lambda;

import java.util.function.BiFunction;

// Concatenate two strings using BiFunction.
public class ConcatenateStringList {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        BiFunction<String,String,String> biFunction = (s1,s2) -> {
            return s1+s2;
        };

        System.out.println(biFunction.apply(a, b));
    }

}
