package org.example.kata6kyu;

public class SumOfDigitsDigitalRoot {
    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Digital root is the recursive sum of all the digits in a number.
     *
     * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
     * The input will be a non-negative integer.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |        16  -->  1 + 6 = 7
     *    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
     *  132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
     *  493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
     */

    public static void main(String[] args) {
        System.out.println(digital_root(16)); // Output: 7
        System.out.println(digital_root(942)); // Output: 6
        System.out.println(digital_root(132189)); // Output: 6
        System.out.println(digital_root(493193)); // Output: 2
    }

//    public static int digital_root(int n) {
//        int sumOfDigits;
//        char[] digits = String.valueOf(n).toCharArray();
//        do {
//            sumOfDigits = 0;
//            for (char c : digits) {
//                sumOfDigits += Integer.parseInt(String.valueOf(c));
//            }
//            digits = String.valueOf(sumOfDigits).toCharArray();
//        } while (sumOfDigits >= 10);
//        return sumOfDigits;
//    }

    public static int digital_root(int n) {
        while (n >= 10) {
            String digits = String.valueOf(n);
            n = 0;
            for (char c : digits.toCharArray()) {
                n += Integer.parseInt(String.valueOf(c));
            }
        }
        return n;
    }
}
