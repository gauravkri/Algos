package com.gauravkri.algos;


import com.gauravkri.algos.arrays.FindPairForSumTarget;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;

import java.util.stream.Stream;


public class FindPairForSumTargetTest {



    static Stream<Arguments> argumentsStream(){
        return Stream.of(Arguments.of(new int[]{1, -2, 1, 0, 5},0,null),
                Arguments.of(new int[]{8, 7, 2, 5, 3, 1},10,new int[]{8,2}),
                Arguments.of(new int[]{0, -1, 2, -3, 1},-2,new int[]{-3,1})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findPairForSumTargetTestCase(int[] nums,int target,int[] matcher){
        int[] re =FindPairForSumTarget.findPair(nums,target);
        Assertions.assertArrayEquals(re,matcher);
    }

}
