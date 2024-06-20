package org.example.kata8kyu;

public class StringRepeat {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * |   Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
     * |                                                                                                                                                                         
     * |                                                                                                                                                                         
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    6, "I"     -> "IIIIII"
     * |    5, "Hello" -> "HelloHelloHelloHelloHello"
     * |
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(repeatStr(6, "I"));   // Output: IIIIII
        System.out.println(repeatStr(5, "Hello"));   // Output: HelloHelloHelloHelloHello
    }


    public static String repeatStr(final int repeat, final String string) {

//        StringBuilder newString = new StringBuilder();

//        for (int i = 0; i < repeat; i++) {
//            newString.append(string);
//        }

        //refactored:
        return String.valueOf(string).repeat(Math.max(0, repeat));
    }
}
