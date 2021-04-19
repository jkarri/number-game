package com.funmaths.numbergame.fizzbuzz;

/**
 * Represents a number which display two features.
 * A number can be a valid game number if it satisfies the properties of fizz, buzz or both.
 * A number can be transformed to either fizz, buzz or fizzbuzz if it is valid
 * Else the number is retained.
 */
public interface GameNumber {
    /**
     * A number can be a valid game number if it satisfies the properties of fizz, buzz or both.
     * @param number the input number
     * @return true if valid, else false is returned.
     */
    boolean isValidGameNumber(int number);

    /**
     * A number is transformed to a string and the value depends on whether the number is fizz or buzz or both.
     * The number in its literal form is returned if it is not valid.
     * @param number the input number
     * @return the transformed number.
     */
    String transform(int number);
}
