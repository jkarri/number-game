package com.funmaths.numbergame.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzNumberTest {

    @Test
    void testThatNumberFifteenIsFizzBuzz() {
        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber();

        boolean isFizzBuzz = fizzBuzzNumber.isValidGameNumber(15);

        assertTrue(isFizzBuzz);
    }

    @Test
    void testThatNumberTenIsNotFizzBuzz() {
        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber();

        boolean isFizzBuzz = fizzBuzzNumber.isValidGameNumber(10);

        assertFalse(isFizzBuzz);
    }

    @Test
    void testThatNumberThirtyFiveIsNotFizzBuzz() {
        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber();

        boolean isFizzBuzz = fizzBuzzNumber.isValidGameNumber(35);

        assertFalse(isFizzBuzz);
    }
}