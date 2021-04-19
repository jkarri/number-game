package com.funmaths.numbergame.fizzbuzz;

/**
 * A number is fizz if it is divisible by 3.
 */
public class FizzNumberFeature implements GameNumberFeature {
    @Override
    public boolean isValidGameNumber(int number) {
        return number % 3 == 0;
    }

    @Override
    public String transform(int number) {
        return "Fizz";
    }
}
