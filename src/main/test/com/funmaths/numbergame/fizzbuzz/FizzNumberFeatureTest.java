package com.funmaths.numbergame.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzNumberFeatureTest {

    @Test
    void testThatNumberThreeIsFizzy() {
        // Given
        FizzNumberFeature fizzNumber = new FizzNumberFeature();
        // When
        boolean isFizzy = fizzNumber.isValidGameNumber(3);

        assertTrue(isFizzy);
    }

    @Test
    void testThatNumberOneIsNotFizzy() {
        // Given
        FizzNumberFeature fizzNumber = new FizzNumberFeature();
        // When
        boolean isFizzy = fizzNumber.isValidGameNumber(1);

        assertFalse(isFizzy);
    }

    @Test
    void testThatNumberNinetyThreeIsFizzy() {
        // Given
        FizzNumberFeature fizzNumber = new FizzNumberFeature();
        // When
        boolean isFizzy = fizzNumber.isValidGameNumber(93);

        assertTrue(isFizzy);
    }

    @Test
    void testThatNumberThirtyOneIsFizzy() {
        // Given
        FizzNumberFeature fizzNumber = new FizzNumberFeature();
        // When
        boolean isFizzy = fizzNumber.isValidGameNumber(31);

        assertTrue(isFizzy);
    }
}