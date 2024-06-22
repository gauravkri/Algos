package com.gauravkri.algos.stacks;

import java.util.Stack;
import java.util.stream.Stream;

public class TrappingRainWater {

    public int trap(int[] height) {
        int maxL=0, maxR=0;
        for(int i=0; i< height.length; i++){
            maxL = Math.max(maxL,height[i]);
        }

        return 0;
    }


}
