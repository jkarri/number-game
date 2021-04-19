package com.funmaths.numbergame.fizzbuzz;

/**
 * A number if buzz if it is divisible by 5.
 */
public class BuzzNumber implements GameNumber {
    @Override
    public boolean isValidGameNumber(int number) {
        return number % 5 == 0;
    }

    @Override
    public String transform(int number) {
        return "Buzz";
    }
}