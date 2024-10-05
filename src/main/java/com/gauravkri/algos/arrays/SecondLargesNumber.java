package com.gauravkri.algos.arrays;

import java.lang.reflect.Array;

public class SecondLargesNumber {

    // 2,13,3,4,1,3,6,28
    // 9,3,6,2,9
    //9,6

    static Integer findSecondLargestInteger(Integer arr[]){
        Integer lrgeNo = Integer.MIN_VALUE;
        Integer max = 0;
        Integer max2 = 0;

        int counter = 0;
        if (arr.length > 1 ) {
            for(int i =0; i < arr.length-1; i++){
                for(int j =1; j < arr.length; j++ ){
                     if (arr[i] > arr[j]) {
                        if (arr[i]> max) {
                            max=arr[i];
                        }
                        if (arr[j]> max2) {
                            max2 = arr[j];
                        }
                       
                     }else if (arr[i] < arr[j]){
                        if (arr[j] > max) {
                            max=arr[j];
                        }
                       if (arr[i] > max2) {
                        max2=arr[i];
                       }
                       
                     } 
                }
            }
            if (max2 != 0) {
                lrgeNo = max2;    
            }
            
        }
        return lrgeNo;
    }
    
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{2,13,3,4,1,3,6,28};
        Integer arr1[] = new Integer[]{9,3,6,2,9};
        Integer arr2[] = new Integer[]{6,6,6,6,6,6};
        Integer arr3[] = new Integer[]{9,6};

       Integer x = findSecondLargestInteger(arr);
       System.out.println("this is 2nd largest array "+ x);

       x = findSecondLargestInteger(arr1);
       System.out.println("this is 2nd largest array "+ x);

       x = findSecondLargestInteger(arr2);
       System.out.println("this is 2nd largest array "+ x);

       x = findSecondLargestInteger(arr3);
       System.out.println("this is 2nd largest array "+ x);
    }


}
