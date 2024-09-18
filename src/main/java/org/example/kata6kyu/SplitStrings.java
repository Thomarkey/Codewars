package org.example.kata6kyu;

public class SplitStrings {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Complete the solution so that it splits the string into pairs of two characters.
     * | If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * 'abc' =>  ['ab', 'c_']
     * 'abcdef' => ['ab', 'cd', 'ef']
     */


    public static void main(String[] args) {
        System.out.println(solution("abc")); // Output: ["ab", "c_"]
        System.out.println(solution("abcdef")); // Output: ["ab", "cd", "ef"]
    }

//    public static String[] solution(String s) {
//        int x = s.length();
//        int size = x / 2;
//        int arraySize = x % 2 == 0 ? size : size + 1;
//
//        String[] result = new String[arraySize];
//        for (int i = 0, j = 0; i < arraySize; i++, j++) {
//            result[i] = s.charAt(j) + (j + 1 < s.length() ? String.valueOf(s.charAt(++j)) : "_");
//        }
//
//        return result;
//    }

    public static String[] solution(String s) {
        int arraySize = (s.length() + 1) / 2;
        String[] result = new String[arraySize];

        for (int i = 0, j = 0; i < arraySize; i++, j += 2) {
            char first = s.charAt(j);
            char second = (j + 1 < s.length()) ? s.charAt(j + 1) : '_';
            result[i] = "" + first + second;
        }
        return result;
    }

}
