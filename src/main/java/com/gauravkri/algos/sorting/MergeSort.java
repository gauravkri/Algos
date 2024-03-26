package com.gauravkri.algos.sorting;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] arr,int start, int mid, int end){
        System.out.println("start "+start+" mid "+ mid + " end "+end);

        int n1 = mid - start + 1;
        int n2 = end - mid;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[start + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];


        int i = 0, j = 0;

        int k = start;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    private static void sorting(int[] arr,int start,int end){

        System.out.println("start "+start+ " end "+end);
        if (start<end){
            int mid = (start + (end-1)) / 2;
            System.out.println(mid);
            sorting(arr,start,mid);
            sorting(arr,mid+1,end);

            merge(arr,start,mid,end);
        }
    }


    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        sorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
