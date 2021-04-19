package com.funmaths.numbergame.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzNumberTest {

    @Test
    void testThatNumberThreeIsFizzy() {
        // Given
        FizzNumber fizzNumber = new FizzNumber();
        // When
        boolean isFizzy = fizzNumber.isValidGameNumber(3);

        assertTrue(isFizzy);
    }

    @Test
    void testThatNumberOneIsNotFizzy() {
        // Given
        FizzNumber fizzNumber = new FizzNumber();
        // When
        boolean isFizzy = fizzNumber.isValidGameNumber(1);

        assertFalse(isFizzy);
    }

    @Test
    void testThatNumberNinetyThreeIsFizzy() {
        // Given
        FizzNumber fizzNumber = new FizzNumber();
        // When
        boolean isFizzy = fizzNumber.isValidGameNumber(93);

        assertTrue(isFizzy);
    }
}