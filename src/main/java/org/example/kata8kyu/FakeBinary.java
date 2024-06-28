package org.example.kata8kyu;

public class FakeBinary {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
     * | Return the resulting string.
     *
     * | Note: input will never be an empty string
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | 45385593107843568 -> 01011110001100111
     * | 509321967506747 -> 101000111101101
     * | 366058562030849490134388085 -> 011011110000101010000011011
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(fakeBin("45385593107843568"));   // Output:  01011110001100111
        System.out.println(fakeBin("509321967506747"));   // Output:  101000111101101
        System.out.println(fakeBin("366058562030849490134388085"));   // Output:  011011110000101010000011011
    }

//    public static String fakeBin(String numberString) {
//
//        char[] array = numberString.toCharArray();
//
//        for (int i = 0; i < array.length; i++) {
//            if (Integer.parseInt(String.valueOf(array[i])) < 5) {
//                array[i] = '0';
//            } else {
//                array[i] = '1';
//            }
//        }
//
//        return new String(array);
//    }

    public static String fakeBin(String numberString) {
        char[] array = numberString.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < '5' ? '0' : '1';
        }
        return new String(array);
    }
}
