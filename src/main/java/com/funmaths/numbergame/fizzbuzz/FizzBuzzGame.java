package com.funmaths.numbergame.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Utility class to map a range of numbers to fizz buzz series.
 * A fizz buzz series is a series of numbers with the below properties
 *  A number is mapped to Fizz if it is divisible by 3
 *  A number is mapped to Buzz if it is divisible by 5
 *  A number if mapped to FizzBuzz if it is divisible by both 3 and 5
 *  A number is not changed when it does not match any of the above conditions
 */
public class FizzBuzzGame {
    private List<GameNumberFeature> gameNumberFeatures;

    /**
     * Constructor to initialize all game number features
     */
    public FizzBuzzGame() {
        this.gameNumberFeatures = new ArrayList<>();
        this.gameNumberFeatures.add(new FizzBuzzNumberFeature());
        this.gameNumberFeatures.add(new FizzNumberFeature());
        this.gameNumberFeatures.add(new BuzzNumberFeature());
    }

    /**
     * Transform a number into string literal based on what feature the number falls under.
     * @param number input number
     * @return transformed fizzbuzz number
     */
    public String transformGameNumber(int number) {
        return gameNumberFeatures.stream().filter(gameNumberFeature -> gameNumberFeature.isValidGameNumber(number))
                .findFirst()
                .orElseGet(RetainedNumberFeature::new)
                .transform(number);
    }

    /**
     * Fetches the fizz buzz series for the given range of numbers.
     * @param start start of the range, inclusive
     * @param end end of the range, inclusive
     * @return fizz buzz series
     */
    public List<String> fizzBuzzSeries(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(this::transformGameNumber)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.fizzBuzzSeries(1, 100).forEach(System.out::println);
    }
}
