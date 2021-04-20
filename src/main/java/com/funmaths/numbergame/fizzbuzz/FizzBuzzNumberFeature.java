package com.funmaths.numbergame.fizzbuzz;

/**
 * A number is fizzbuzz if it is both divisible by 3 and 5.
 */
public class FizzBuzzNumberFeature implements GameNumberFeature {
    private final FizzNumberFeature fizzNumberFeature;
    private final BuzzNumberFeature buzzNumberFeature;

    public FizzBuzzNumberFeature(FizzNumberFeature fizzNumberFeature, BuzzNumberFeature buzzNumberFeature) {
        this.fizzNumberFeature = fizzNumberFeature;
        this.buzzNumberFeature = buzzNumberFeature;
    }

    @Override
    public boolean isValidGameNumber(int number) {
        return fizzNumberFeature.isValidGameNumber(number) && buzzNumberFeature.isValidGameNumber(number);
    }

    @Override
    public String transform(int number) {
        return "FizzBuzz";
    }
}
