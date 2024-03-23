package com.gauravkri.algos;



import com.gauravkri.algos.arrays.SubArrayWithZeroSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class SubArrayWithZeroSumTest {

    static Stream<Arguments> argumentsStream(){
        return Stream.of(Arguments.of(new int[]{1, -2, 1, 0, 5},true),
                Arguments.of(new int[]{8, 7, 2, 5, 3, 1},false),
                Arguments.of(new int[]{0, -1, 2, -3, 1},true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findPairForSumTargetTestCase(int[] nums,Boolean result){
        Boolean re =SubArrayWithZeroSum.findSubArrayWithZeroSum(nums);
        Assertions.assertEquals(re,result);
    }


    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findSubArrayWithZeroSumPrintTest(int[] nums,Boolean result){
        Boolean re =SubArrayWithZeroSum.findSubArrayWithZeroSumPrint(nums);
        Assertions.assertEquals(re,result);
    }
}
