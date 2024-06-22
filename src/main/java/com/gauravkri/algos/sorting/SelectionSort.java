package com.gauravkri.algos.sorting;


import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] array = {3,1,2,6,5,8,7};
        System.out.println(Arrays.toString(sorting(array)));
        int[] array1 = {7,33,20,11,6};
        System.out.println(Arrays.toString(sorting(array1)));
        int[] array2 = {1,0,2,0,1,3,2,3,1,0,0,1,2,3};
        System.out.println(Arrays.toString(sorting(array2)));
    }


    public static int[] sorting(int array[]){
        int index ;
        int n=array.length;


        for(int i = 0; i < n; i++){
            index = i;
            for(int j = i; j < n; j++) //Search for the smaller
                if(array[j] < array[index])
                    index=j;

            int temp = array[index];
            array[index]=array[i];
            array[i]=temp;
        }
        return array;
    }
}
