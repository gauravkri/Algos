package com.gauravkri.algos;

import com.gauravkri.algos.arrays.FindDuplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindDuplicateTest {


    static Stream<Arguments> argumentsStream(){
        return Stream.of(Arguments.of(new int[]{1, -2, 1, 0, 5},5, Arrays.asList(1)),
                Arguments.of(new int[]{8, 7, 2, 5, 3, 1},6,new ArrayList<>()),
                Arguments.of(new int[]{0, -1, 2, -3, 1,0,-1},7,Arrays.asList(0,-1)),
                Arguments.of(new int[]{1, 2, 3, 6, 3, 6, 1},7,Arrays.asList(1,3,6))
                ,
                Arguments.of(new int[]{1, 2, 3, 4 ,3},3,Arrays.asList(3))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findPairForSumTargetTestCase(int[] nums,int target,List<Integer> matcher){
        FindDuplicate findDuplicate = new FindDuplicate();
        List<Integer> re = findDuplicate.repeatingNumbers(target,nums);
        Assertions.assertEquals(re,matcher);
    }
}
