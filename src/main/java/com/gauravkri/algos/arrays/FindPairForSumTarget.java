package com.gauravkri.algos.arrays;

public class FindPairForSumTarget {

    public static int[] findPair(int[] nums,int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if (sum==target){
                    System.out.println("Pair found "+nums[i]+", "+nums[j]+" for target "+target);
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        System.out.println("No pair found");
        return null;
    }
}
