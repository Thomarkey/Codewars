package org.example.kata7kyu;


public class Isograms {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | An isogram is a word that has no repeating letters, consecutive or non-consecutive.
     * Implement a function that determines whether a string that contains only letters is an isogram.
     * Assume the empty string is an isogram. Ignore letter case.                                             |
     * |
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    "Dermatoglyphics" --> true
     *      "aba" --> false
     *      "moOse" --> false (ignore letter case)
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(isIsogram("Dermatoglyphics"));   // Output: true
        System.out.println(isIsogram("aba"));   // Output: false
        System.out.println(isIsogram("moOse"));   // Output: false (ignore letter case)
    }

    public static boolean isIsogram(String str) {

        boolean isIsogram = true;

        char[] wordArray = str.toLowerCase().toCharArray();
        char[] newWordArray;

        for (int i = 0; i < wordArray.length; i++) {
            char c = wordArray[i];
            newWordArray = ArrayUtils.remove(wordArray, i);
            for (char cc : newWordArray) {
                if (c == cc) {
                    isIsogram = false;
                    break;
                }
            }
        }
        return isIsogram;
    }
}
