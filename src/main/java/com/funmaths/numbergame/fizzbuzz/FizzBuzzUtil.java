package com.funmaths.numbergame.fizzbuzz;

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
public class FizzBuzzUtil {
    private List<GameNumberFeature> gameNumberFeatures;

    /**
     * Fetches the fizz buzz series for the given range of numbers.
     * @param start start of the range, inclusive
     * @param end end of the range, inclusive
     * @return fizz buzz series
     */
    public List<String> fizzBuzzSeries(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(n -> String.valueOf(n))
                .map(n -> fizzbuzz(n))
                .map(n -> fizz(n))
                .map(n -> buzz(n))
                .collect(Collectors.toList());
    }

    /**
     * Returns if a number is fizzy (i.e. divisible by 3)
     * @param n input number
     * @return Fizz or the original number
     */
    private String fizz(String n) {
        try {
            if (Integer.parseInt(n) % 3 == 0) {
                return "Fizz";
            }
        } catch (NumberFormatException nfe) {
            // swallow
        }
        return n;
    }

    /**
     * Returns if a number is buzzy (i.e. divisible by 5)
     * @param n input number
     * @return Buzz or the original number
     */
    private String buzz(String n) {
        try {
            if (Integer.parseInt(n) % 5 == 0) {
                return "Buzz";
            }
        } catch (NumberFormatException nfe) {
            // swallow
        }
        return n;
    }

    private String fizzbuzz(String n) {
        try {
            if (Integer.parseInt(n) % 3 == 0 && Integer.parseInt(n) % 5 == 0) {
                return "FizzBuzz";
            }
        } catch (NumberFormatException nfe) {
            // swallow
        }
        return n;
    }

    public static void main(String[] args) {
        FizzBuzzUtil fizzBuzzUtil = new FizzBuzzUtil();
        fizzBuzzUtil.fizzBuzzSeries(1, 100).forEach(System.out::println);
    }
}
