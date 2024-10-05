package com.gauravkri.algos.exceptions;

import java.util.Arrays;
import java.util.List;

public class TryWithoutCatch {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,3,2,3,4,5,5);
        try{
            int a=0;
            for(int i =0; i < ints.size(); i++){
               System.out.println("123");
               a=  i/0;
            }
        }finally{
            System.out.println("in finally");
        }
    }
}
