package org.example.kata8kyu;

public class ConvertAStringToANumber {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | We need a function that can transform a string into a number. What ways of achieving this do you know?                                                         |
     * | Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    "1234" --> 1234
     * |    "605"  --> 605
     * |    "1405" --> 1405
     * |    "-7" --> -7
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(stringToNumber("1234"));   // Output: 1234
        System.out.println(stringToNumber("605"));   // Output: 605
        System.out.println(stringToNumber("1405"));   // Output: 1405
        System.out.println(stringToNumber("-7"));   // Output: -7
    }


    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
