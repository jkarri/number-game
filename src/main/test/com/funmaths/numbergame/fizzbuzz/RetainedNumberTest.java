package com.funmaths.numbergame.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RetainedNumberTest {

    @Test
    void testThatNumberOneIsValid() {
        RetainedNumber retainedNumber = new RetainedNumber();

        boolean isValid = retainedNumber.isValidGameNumber(1);

        assertTrue(isValid);
    }

    @Test
    void testThatNumberOneIsTransformedToItsStringLiteral() {
        RetainedNumber retainedNumber = new RetainedNumber();

        String result = retainedNumber.transform(1);

        assertEquals("1", result);
    }

    @Test
    void testThatNumberTwoIsValid() {
        RetainedNumber retainedNumber = new RetainedNumber();

        String result = retainedNumber.transform(2);

        assertEquals("2", result);
    }

    @Test
    void testThatAnyNumberIsValid() {
        RetainedNumber retainedNumber = new RetainedNumber();

        IntStream.rangeClosed(1, 50).forEach(n -> {
            String result = retainedNumber.transform(n);
            assertEquals(String.valueOf(n), result);

        });
    }
}