package com.gauravkri.algos.arrays;

import java.util.Arrays;

public class RotationArray {

    public static void rotateArray(int[] arr, int n){
        int l = arr.length-1;

        for (int i=0 ; i<n; i++){
            int lastel = arr[l];
            for (int j=l; j>0; j--)
                arr[j]=arr[j-1];
            arr[0]=lastel;

        }
    }

    public static void rotateAntiClockArray(int[] arr, int n){
        int l = arr.length-1;

        for (int i=0 ; i<n; i++){
            int firstEl = arr[0];
            for (int j=0; j<l; j++)
                arr[j]=arr[j+1];
            arr[l]=firstEl;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,3,4,5};

        rotateArray(arr,2);
        System.out.println(Arrays.toString(arr));
        rotateAntiClockArray(arr1,2);
        System.out.println(Arrays.toString(arr1));
    }
}
