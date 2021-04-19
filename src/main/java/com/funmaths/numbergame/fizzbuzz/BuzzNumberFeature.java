package com.funmaths.numbergame.fizzbuzz;

/**
 * A number is buzz if it is divisible by 5.
 */
public class BuzzNumberFeature implements GameNumberFeature {
    @Override
    public boolean isValidGameNumber(int number) {
        return number % 5 == 0;
    }

    @Override
    public String transform(int number) {
        return "Buzz";
    }
}
