package org.example.kata6kyu;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * The main idea is to count all the occurring characters in a string.
     * If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
     *
     * What if the string is empty? Then the result should be empty object literal, {}.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * aabbbac -> {a=3, b=3, c=1}
     * abc -> {a=1, b=1, c=1}
     * "" -> {}
     * aabb -> {a=2, b=2}
     */

    public static void main(String[] args) {
        System.out.println(count("aabbbac")); // {a=3, b=3, c=1}
        System.out.println(count("abc")); // {a=1, b=1, c=1}
        System.out.println(count("")); // {}
        System.out.println(count("aabb")); // {a=2, b=2}
    }

//    public static Map<Character, Integer> count(String str) {
//        Map<Character, Integer> finalMap = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            int freq = finalMap.getOrDefault(str.charAt(i), 0);
//            finalMap.put(str.charAt(i), ++freq);
//        }
//        return finalMap;
//    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> finalMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            finalMap.put(c, finalMap.getOrDefault(c, 0) + 1);
        }
        return finalMap;
    }

}
