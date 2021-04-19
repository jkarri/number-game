package com.funmaths.numbergame.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuzzNumberTest {

    @Test
    void testThatNumberThreeIsBuzzy() {
        // Given
        BuzzNumberFeature buzzNumber = new BuzzNumberFeature();
        // When
        boolean isBuzzy = buzzNumber.isValidGameNumber(5);
        // Then
        assertTrue(isBuzzy);
    }

    @Test
    void testThatNumberOneIsNotBuzzy() {
        // Given
        BuzzNumberFeature buzzNumber = new BuzzNumberFeature();
        // When
        boolean isBuzzy = buzzNumber.isValidGameNumber(1);
        // Then
        assertFalse(isBuzzy);
    }

    @Test
    void testThatNumberNinetyThreeIsBuzzy() {
        // Given
        BuzzNumberFeature buzzNumber = new BuzzNumberFeature();
        // When
        boolean isBuzzy = buzzNumber.isValidGameNumber(25);

        assertTrue(isBuzzy);
    }
}