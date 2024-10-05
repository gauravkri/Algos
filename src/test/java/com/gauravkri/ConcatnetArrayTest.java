package com.gauravkri;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.gauravkri.algos.arrays.ConcatenetArrays;

public class ConcatnetArrayTest {
    

    static Stream<Arguments> argumentsStream(){
        return Stream.of(Arguments.of(new int[]{1, 1, 1, 1, 5},new int[]{1, 1, 1, 1, 5,1, 1, 1, 1, 5}),
                Arguments.of(new int[]{8, 7, 2, 5, 3, 1},new int[]{8, 7, 2, 5, 3, 1,8, 7, 2, 5, 3, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void getConcatenationTest(int[] input, int[] output){
            ConcatenetArrays cn = new ConcatenetArrays();
           int[] ret = cn.getConcatenation(input);

           Assertions.assertArrayEquals(ret,output);
    }
}
