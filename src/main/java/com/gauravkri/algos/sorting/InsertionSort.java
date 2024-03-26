package com.gauravkri.algos.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {3,1,2,6,5,8,7};
        System.out.println(Arrays.toString(sorting(array)));
        int[] array1 = {7,33,20,11,6};
        System.out.println(Arrays.toString(sorting(array1)));
    }

    public static int[] sorting(int array[]){

        for (int i=1; i<array.length; ++i){
            int val = array[i];
            int j = i-1;
            while (j>=0 && array[j] > val){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = val;
        }
        return array;
    }
}
