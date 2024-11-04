package org.example.kata5kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimplePigLatin {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Move the first letter of each word to the end of it, then add "ay" to the end of the word.
     *   Leave punctuation marks untouched.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
     * pigIt('Hello world !');     // elloHay orldway !
     */

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool")); //igPay atinlay siay oolcay
        System.out.println(pigIt("Hello world !")); //elloHay orldway !
    }

//    public static String pigIt(String str) {
//        String[] words = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (String word : words) {
//            if (word.matches("[a-zA-Z]+")) {
//                for (int i = 1; i < word.length(); i++) {
//                    sb.append(word.charAt(i));
//                }
//                sb.append(word.charAt(0)).append("ay");
//            } else {
//                sb.append(word);
//            }
//            sb.append(" ");
//        }
//        return sb.toString().trim();
//    }

//    public static String pigIt(String str) {
//        String[] words = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (String word : words) {
//            if (word.matches("[a-zA-Z]+")) {
//                sb.append(word.substring(1)).append(word.charAt(0)).append("ay");
//            } else {
//                sb.append(word);
//            }
//            sb.append(" ");
//        }
//        return sb.toString().trim();
//    }

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(w -> w.matches("[a-zA-Z]+") ? w.substring(1).concat(w.substring(0, 1)).concat("ay") : w)
                .collect(Collectors.joining(" "));
    }
}
