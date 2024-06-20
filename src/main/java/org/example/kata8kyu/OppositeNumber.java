package org.example.kata8kyu;

public class OppositeNumber {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * |  Very simple, given a number (integer/decimal/both depending on the language), find its opposite (additive |inverse).                                               |
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    1  : -1
     * |    14 : -14
     * |    -34: 34
     */

    public static void main(String[] args) {
        System.out.println(opposite(1));   // Output: -1
        System.out.println(opposite(14));  // Output: -14
        System.out.println(opposite(-34)); // Output: 34
    }

    public static int opposite(int number) {
        return -number;
    }
}
