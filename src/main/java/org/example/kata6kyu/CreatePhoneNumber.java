package org.example.kata6kyu;

import java.util.Arrays;

public class CreatePhoneNumber {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Write a function that accepts an array of 10 integers (between 0 and 9),
     * that returns a string of those numbers in the form of a phone number. |
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | (123) 456-7890
     * | (111) 111-1111
     * | (123) 456-7890
     */

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})); // Output: (123) 456-7890
        System.out.println(createPhoneNumber(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1})); // Output: (111) 111-1111
    }

    public static String createPhoneNumber(int[] numbers) {
        String convertedNumber = Arrays.toString(numbers).replace("[", "").replace("]", "").replace(",", "").replaceAll(" ", "");

        String prefix = convertedNumber.substring(0, 3);
        String mid = convertedNumber.substring(3, 6);
        String suffix = convertedNumber.substring(6, 10);

        return String.format("(%s) %s-%s", prefix, mid, suffix);
    }
}
