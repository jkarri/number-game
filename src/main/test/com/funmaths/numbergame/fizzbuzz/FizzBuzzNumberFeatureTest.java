package com.funmaths.numbergame.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzNumberFeatureTest {

    @Test
    void testThatNumberFifteenIsFizzBuzz() {
        FizzBuzzNumberFeature fizzBuzzNumber = new FizzBuzzNumberFeature(new FizzNumberFeature(), new BuzzNumberFeature());

        boolean isFizzBuzz = fizzBuzzNumber.isValidGameNumber(15);

        assertTrue(isFizzBuzz);
    }

    @Test
    void testThatNumberTenIsNotFizzBuzz() {
        FizzBuzzNumberFeature fizzBuzzNumber = new FizzBuzzNumberFeature(new FizzNumberFeature(), new BuzzNumberFeature());

        boolean isFizzBuzz = fizzBuzzNumber.isValidGameNumber(10);

        assertFalse(isFizzBuzz);
    }

    @Test
    void testThatNumberThirtyFiveIsNotFizzBuzz() {
        FizzBuzzNumberFeature fizzBuzzNumber = new FizzBuzzNumberFeature(new FizzNumberFeature(), new BuzzNumberFeature());

        boolean isFizzBuzz = fizzBuzzNumber.isValidGameNumber(35);

        assertTrue(isFizzBuzz);
    }
}