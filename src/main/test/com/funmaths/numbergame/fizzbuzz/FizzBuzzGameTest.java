package com.funmaths.numbergame.fizzbuzz;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

    @Test
    void testThatFizzBuzzSeriesWithFizzIsFetched() {
        List<String> fizzBuzzSeries = fizzBuzzGame.fizzBuzzSeries(1, 3);
        assertEquals(Lists.newArrayList("1", "2", "Fizz"), fizzBuzzSeries);
    }

     @Test
     void testThatFizzBuzzSeriesWithFizzAndBuzzIsFetched() {
         List<String> fizzBuzzSeries = fizzBuzzGame.fizzBuzzSeries(1, 5);
         assertEquals(Lists.newArrayList("1", "2", "Fizz", "4", "Buzz"), fizzBuzzSeries);
     }

     @Test
     void testThatFizzBuzzSeriesWithFizzAndBuzzAndFizzBuzzIsFetched() {
         List<String> fizzBuzzSeries = fizzBuzzGame.fizzBuzzSeries(1, 15);
         assertEquals(Lists.newArrayList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
                 "Fizz", "Fizz", "14", "FizzBuzz"), fizzBuzzSeries);
     }
}