package com.gauravkri.algos.arrays;

import java.util.*;

public class SubArrayWithZeroSum {

    /*
    Check if a subarray with 0 sum exists or not
    Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
    Output: Subarray with zero-sum exists
    The subarrays with a sum of 0 are:
    { 3, 4, -7 }
    { 4, -7, 3 }
    { -7, 3, 1, 3 }
    { 3, 1, -4 }
    { 3, 1, 3, 1, -4, -2, -2 }
    { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
     */
    public static void main(String[] args) {
        int[] nums = { 4, -6, 3, -1, 4, 2, 7 };
        findSubArrayWithZeroSum(nums);
        System.out.println("--------------------------------\n");
        int[] nums1 = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        findSubArrayWithZeroSumPrint(nums1);
    }


    public static Boolean findSubArrayWithZeroSum(int[] arrays){
        Set<Integer> sumSet = new HashSet<>();
        sumSet.add(0);
        int sum=0;
        for (int i=0; i < arrays.length; i++){
            sum += arrays[i];
            if (sumSet.contains(sum)) {
                int[] subArray = new int[i+1];
                System.arraycopy(arrays,0,subArray,0,i+1);
                System.out.println("subArray with zero sum : "+ Arrays.toString(subArray));
                return true;
            }
        }
        System.out.println("No sub array found");
        return false;
    }




    public static Boolean findSubArrayWithZeroSumPrint(int[] arrays){
        Set<Integer> sumSet = new HashSet<>();
        sumSet.add(0);

        List<int[]> subArrayList = new ArrayList<>();
        for (int i=0; i < arrays.length; i++){
            int sum = arrays[i];
            for (int j=i+1; j < arrays.length; j++) {
                sum += arrays[j];
                if (sumSet.contains(sum)) {
                    int[] subArray = Arrays.copyOfRange(arrays,i,j+1);
                    System.out.println("subArray with zero sum : " + Arrays.toString(subArray) + "\n");
                    subArrayList.add(subArray);
                }
            }
        }

        if (subArrayList.size()>0){
            return true;
        }
        System.out.println("No sub array found");
        return false;
    }

}
