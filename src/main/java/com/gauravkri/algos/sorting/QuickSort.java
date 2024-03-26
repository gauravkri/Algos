package com.gauravkri.algos.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3,1,2,6,5,8,7};
        System.out.println(Arrays.toString(sorting(array)));
        int[] array1 = {7,33,20,11,6};
        System.out.println(Arrays.toString(sorting(array1)));
    }

    private static int partition(int arr[], int start, int end){
        int pivote = arr[end];
        int i = start -1;

        for (int j= start; j<end; j++){
            if (arr[j]<=pivote){
                i++;

                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp = arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;

        return i+1;
    }

    private static void quickSort(int[] arr, int start, int end){
        if (start<end){
            int partition=partition(arr,start,end);

            quickSort(arr,start,partition-1);
            quickSort(arr,partition+1,end);
        }
    }
    private static int[] sorting(int[] arr){
        int n= arr.length;

        quickSort(arr,0,n-1);
        return arr;

    }
}
