package com.gauravkri.algos;




import com.gauravkri.algos.arrays.BestTimeToBuyStocks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class BestTimeToBuyStocksTest {

    static Stream<Arguments> argumentsStream(){
        return Stream.of(Arguments.of(new int[]{1, 1, 1, 1, 5},4),
                Arguments.of(new int[]{8, 7, 2, 5, 3, 1},3),
                Arguments.of(new int[]{7, 6, 4, 3, 1},0),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4},5)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findPairForSumTargetTestCase(int[] nums,int result){
        int re = BestTimeToBuyStocks.maximumProfit(nums);
        Assertions.assertEquals(re,result);
    }


}
