package com.funmaths.numbergame.fizzbuzz;

/**
 * A number will not be replaced with either fizz, buzz or fizzbuzz when it does not match any other criteria.
 * The number will be transformed to string literal.
 *
 * This class should be used as a catch all umbrella, when all other matching criteria are exhausted.
 */
public class RetainedNumberFeature implements GameNumberFeature {
    @Override
    public boolean isValidGameNumber(int number) {
        return true;
    }

    @Override
    public String transform(int number) {
        return String.valueOf(number);
    }
}
