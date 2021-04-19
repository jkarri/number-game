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
    public List<String> fizzBuzzSeries(int start, int end) {
        return IntStream.rangeClosed(start, end).mapToObj(n -> String.valueOf(n)).map(n -> fizz(n))
                .collect(Collectors.toList());
    }

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
}
