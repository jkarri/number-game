package com.funmaths.numbergame.fizzbuzz;

/**
 * A number is fizzbuzz if it is both divisible by 3 and 5.
 */
public class FizzBuzzNumberFeature implements GameNumberFeature {
    @Override
    public boolean isValidGameNumber(int number) {
        return number % 15 == 0;
    }

    @Override
    public String transform(int number) {
        return "FizzBuzz";
    }
}
