package com.gauravkri.algos.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reversArray(int[] arr,int start, int end){
        if (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reversArray(arr,start+1,end-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reversArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
