package com.gauravkri.algos.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
/*
Find duplicates in O(n) time and O(1) extra space | Set 1
Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and use only constant memory space.

Note: The repeating element should be printed only once.
 */
    public static void main(String[] args) {
        int n=7 , array[]={1, 2, 3, 6, 3, 6, 1};
        FindDuplicate thiss = new FindDuplicate();
        thiss.repeatingNumbers(n,array);
    }

    public  List<Integer>  repeatingNumbers(int arrayLen, int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<nums.length;i++){
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()){
            if (map.get(key)>1) {
                System.out.println(key);
                l.add(key);
            }
        }
        return l;
    }
}
