package com.funmaths.numbergame.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RetainedNumberFeatureTest {

    @Test
    void testThatNumberOneIsValid() {
        RetainedNumberFeature retainedNumber = new RetainedNumberFeature();

        boolean isValid = retainedNumber.isValidGameNumber(1);

        assertTrue(isValid);
    }

    @Test
    void testThatNumberOneIsTransformedToItsStringLiteral() {
        RetainedNumberFeature retainedNumber = new RetainedNumberFeature();

        String result = retainedNumber.transform(1);

        assertEquals("1", result);
    }

    @Test
    void testThatNumberTwoIsValid() {
        RetainedNumberFeature retainedNumber = new RetainedNumberFeature();

        String result = retainedNumber.transform(2);

        assertEquals("2", result);
    }

    @Test
    void testThatAnyNumberIsValid() {
        RetainedNumberFeature retainedNumber = new RetainedNumberFeature();

        IntStream.rangeClosed(1, 50).forEach(n -> {
            String result = retainedNumber.transform(n);
            assertEquals(String.valueOf(n), result);

        });
    }
}