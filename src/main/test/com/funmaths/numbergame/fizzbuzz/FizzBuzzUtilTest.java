package com.funmaths.numbergame.fizzbuzz;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FizzBuzzUtilTest {
    private FizzBuzzUtil fizzBuzzUtil = new FizzBuzzUtil();

    @Test
    void testThatFizzBuzzSeriesWithFizzIsFetched() {
        List<String> fizzBuzzSeries = fizzBuzzUtil.fizzBuzzSeries(1, 3);
        assertEquals(Lists.newArrayList("1", "2", "Fizz"), fizzBuzzSeries);
    }

     @Test
     void testThatFizzBuzzSeriesWithFizzAndBuzzIsFetched() {
         List<String> fizzBuzzSeries = fizzBuzzUtil.fizzBuzzSeries(1, 5);
         assertEquals(Lists.newArrayList("1", "2", "Fizz", "4", "Buzz"), fizzBuzzSeries);
     }
}