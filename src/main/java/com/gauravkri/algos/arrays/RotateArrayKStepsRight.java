package com.gauravkri.algos.arrays;

import java.util.Arrays;

//Given an array A of N integers and an integer K, rotate the array to the right by K steps.
public class RotateArrayKStepsRight {


    static void reversArray(int arr[],int si,int ei){
        while (si<ei) {
            int tmp = arr[si];
            arr[si] = arr[ei];
            arr[ei]=tmp;
            si++;
            ei--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int l = arr.length -1;
        int k = 2;
        
        //Reverse the entire arrya
        //5,4,3,2,1
        reversArray(arr,0,l);

        //Reverse first k elements
        //4,5,3,2,1
        reversArray(arr,0,k-1);


        //reverse remaining elements
        //4,5,3,2,1
        reversArray(arr,k,l);

        System.out.println(Arrays.toString(arr));;
    }

}