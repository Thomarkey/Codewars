package org.example.kata5kyu;

import java.math.BigInteger;

public class StringIncrementer {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Your job is to write a function which increments a string, to create a new string.
     *
     * If the string already ends with a number, the number should be incremented by 1.
     * If the string does not end with a number. the number 1 should be appended to the new string.
     * Attention: If the number has leading zeros the amount of digits should be considered.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | foo -> foo1
     * foobar23 -> foobar24
     * foo0042 -> foo0043
     * foo9 -> foo10
     * foo099 -> foo100
     */

    public static void main(String[] args) {
        System.out.println(incrementString("foo")); //foo1
        System.out.println(incrementString("foobar23")); //foobar24
        System.out.println(incrementString("foo0042")); //foo0043
        System.out.println(incrementString("foo9")); //foo10
        System.out.println(incrementString("foo099")); //foo100
        System.out.println(incrementString("123")); //124
        System.out.println(incrementString("80238888324896477921543593037122")); //80238888324896477921543593037123
    }

//    public static String incrementString(String str) {
//        int size = str.length();
//        String lastchar = String.valueOf(str.charAt(size - 1));
//        if (lastchar.matches("\\d+")) {
//                str = str.substring(0, str.length() - 1) + (Integer.parseInt(lastchar) + 1);
//            return str;
//        }
//        return str;
//    }

    //wont work for big digit 80238888324896477921543593037122
//    public static String incrementString(String str) {
//        if (!str.matches(".*\\d+$")) {
//            return str + "1";
//        }
//        String numPart = str.replaceAll(".*?(?=\\d+$)", "");
//        String textPart = str.substring(0, str.length() - numPart.length());
//        int numLength = numPart.length();
//        int incrementedNum = Integer.parseInt(numPart) + 1;
//        String incrementedNumStr = String.format("%0" + numLength + "d", incrementedNum);
//        return textPart + incrementedNumStr;
//    }

    public static String incrementString(String str) {
        if (!str.matches(".*\\d+$")) {
            return str + "1";
        }
        String numPart = str.replaceAll(".*?(?=\\d+$)", "");
        String textPart = str.substring(0, str.length() - numPart.length());
        int numLength = numPart.length();
        BigInteger incrementedNum = new BigInteger(numPart).add(BigInteger.ONE);
        String incrementedNumStr = String.format("%0" + numLength + "d", incrementedNum);
        return textPart + incrementedNumStr;
    }

}
