package com.gauravkri.algos.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3,1,2,6,5,8,7};
        System.out.println(Arrays.toString(sorting(array)));
        int[] array1 = {7,33,20,11,6};
        System.out.println(Arrays.toString(sorting(array1)));
    }

    public static int[] sorting(int array[]){


        for (int items: array ) {
            for (int i=0; i<array.length-1; i++){
                if (array[i+1] > array[i]){
                    int temp = array[i];
                    array[i]=array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        return array;
    }


}
