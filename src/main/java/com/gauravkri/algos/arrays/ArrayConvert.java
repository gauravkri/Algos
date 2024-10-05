package com.gauravkri.algos.arrays;

import java.util.ArrayList;
import java.util.List;

//Write program of array input [3,6,8,9] output [1,2,4,5,7,10]
public class ArrayConvert {
   
    

    List<Integer> converArrya(int[] arr){
        List<Integer> nearr = new ArrayList<>();
        int maxvalue = arr[arr.length-1]+1;
        for(int i=0; i<= maxvalue;i++){
            if (!checkValuePresent(arr, i)) {
                nearr.add(i);
            }
        }
        return nearr;
    }

    boolean checkValuePresent(int[] arr,int value){
        for(int i =0; i<arr.length; i++){
            if (arr[i]==value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ar = new int[]{3,6,8,9};
        ArrayConvert arcn = new ArrayConvert();
        System.out.println(arcn.converArrya(ar));
    }

}
