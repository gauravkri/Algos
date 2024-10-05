package com.gauravkri.algos.arrays;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveNumber {


    int missingPositiveNumber(int nums[]){
        Set<Integer> positiveSet = new HashSet<>();
        int maxPositive = 1;

        for(int num : nums){
            if (num>0) {
                positiveSet.add(num);
                maxPositive= Math.max(maxPositive, num);
            }
        }

        for(int i =1; i <= positiveSet.size(); i++){
            if (!positiveSet.contains(i)) {
                return i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 6, 4, 1, 2};
        SmallestPositiveNumber sm = new SmallestPositiveNumber();
        System.out.println(sm.missingPositiveNumber(nums));
    }

}
