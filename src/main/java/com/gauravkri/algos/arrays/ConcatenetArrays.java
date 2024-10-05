package com.gauravkri.algos.arrays;

import java.util.Arrays;

public class ConcatenetArrays {
    
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*nums.length];
        
        for(int i =0; i< nums.length; i++){
            
                ans[i] = nums[i];
                ans[i+nums.length] = nums[i];
            
        }

        return ans;

    }

    public static void main(String[] args) {
        
        ConcatenetArrays cn = new ConcatenetArrays();
        int[] nums = {1,2,4};
        System.out.println(Arrays.toString(cn.getConcatenation(nums)));
    }


}
