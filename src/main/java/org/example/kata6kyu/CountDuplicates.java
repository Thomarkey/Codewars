package org.example.kata6kyu;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicates {
    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
     * that occur more than once in the input string.
     * The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | "abcde" -> 0 # no characters repeats more than once
     * "aabbcde" -> 2 # 'a' and 'b'
     * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
     * "indivisibility" -> 1 # 'i' occurs six times
     * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
     * "aA11" -> 2 # 'a' and '1'
     * "ABBA" -> 2 # 'A' and 'B' each occur twice
     */

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde")); //2
        System.out.println(duplicateCount("aabbcde")); //2
        System.out.println(duplicateCount("aabBcde")); //2
        System.out.println(duplicateCount("indivisibility")); //1

    }

//    public static int duplicateCount(String text) {
//        char[] charText = text.toLowerCase().toCharArray();
//        List<Character> charList = new ArrayList<>();
//        int amount = 0;
//        int amountOfDuplicates = 0;
//        for (char charToCheck : charText) {
//            if (!charList.contains(charToCheck)) {
//                for (char c : charText) {
//                    if (c == charToCheck) {
//                        amount++;
//                    }
//                }
//                charList.add(charToCheck);
//                if (amount > 1)
//                    amountOfDuplicates++;
//                amount = 0;
//            }
//        }
//        return amountOfDuplicates;
//    }

    public static int duplicateCount(String text) {
        List<Character> letters = new ArrayList<>();
        List<Character> duplicates = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            Character value = text.toLowerCase().charAt(i);
            if (!letters.contains(value)) {
                letters.add(value);
            } else if(!duplicates.contains(value)){
                duplicates.add(value);
            }
        }
        return duplicates.size();
    }
}
