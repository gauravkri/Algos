package com.gauravkri.algos.lambda;


import java.util.Optional;

//Convert a string to an Optional<Integer>.
public class ToOptionalInteger {

    public static void main(String[] args) {
        String input = "123";

        Optional<Integer> optional = Optional.ofNullable(input)
        .map(s -> {
           try{
                return Integer.parseInt(s);
           }catch(NumberFormatException e){
                return null;
           } 
        });

        System.out.println(optional.orElse(-1));
    }

}
