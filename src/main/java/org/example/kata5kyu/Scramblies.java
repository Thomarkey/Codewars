package org.example.kata5kyu;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Complete the function scramble(str1, str2) that returns true
     * if a portion of str1 characters can be rearranged to match str2,
     * otherwise returns false.
     *
     * Notes:
     *
     * Only lower case letters will be used (a-z).
     * No punctuation or digits will be included.
     * Performance needs to be considered.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | scramble('rkqodlw', 'world') ==> True
     * scramble('cedewaraaossoqqyt', 'codewars') ==> True
     * scramble('katas', 'steak') ==> False
     */

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world")); // ==> True
        System.out.println(scramble("cedewaraaossoqqyt", "codewars")); // ==> True
        System.out.println(scramble("katas", "steak")); // ==> False);
        System.out.println(scramble("mam", "mama")); //,false);
    }

    //doesnt take the duplicates in account
//    public static boolean scramble(String str1, String str2) {
//        for (int i = 0; i < str2.length(); i++) {
//            if (str1.indexOf(str2.charAt(i)) == -1) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean scramble(String str1, String str2) {
            Map<Character, Integer> charCount = new HashMap<>();
            for (char c : str1.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            for (char c : str2.toCharArray()) {
                if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                    return false;
                }
                charCount.put(c, charCount.get(c) - 1);
            }
            return true;
    }


}
