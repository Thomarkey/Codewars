package org.example.kata5kyu;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * Write a function named first_non_repeating_letter† that takes a string input, and returns the first character that is not repeated anywhere in the string.
     * For example, if given the input 'stress', the function should return 't', since the letter t only occurs once in the string, and occurs first in the string.
     * <p>
     * As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. For example, the input 'sTreSS' should return 'T'.
     * If a string contains all repeating characters, it should return an empty string ("");
     * <p>
     * † Note: the function is called firstNonRepeatingLetter for historical reasons, but your function should handle any Unicode character.
     * /**
     * <p>
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | stress --> t
     * | sTreSS --> T
     */

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("a")); // 'a'
        System.out.println(firstNonRepeatingLetter("streSS")); // 't'
        System.out.println(firstNonRepeatingLetter("sTreSS")); // 'T'
        System.out.println(firstNonRepeatingLetter("moon-men")); // '-'
        System.out.println(firstNonRepeatingLetter("moonmoon")); // ''

    }

    public static String firstNonRepeatingLetter(String s) {
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (char c : s.toLowerCase().toCharArray()) {
//            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            hashMap.merge(c, 1, Integer::sum);
        }

        for (char c : s.toCharArray()) {
            if (hashMap.get(Character.toLowerCase(c)) == 1) {
                return String.valueOf(c);
            }
        }
        return "";
    }
}


