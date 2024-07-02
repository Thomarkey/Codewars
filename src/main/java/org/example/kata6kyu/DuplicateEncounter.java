package org.example.kata6kyu;

public class DuplicateEncounter {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | The goal of this exercise is to convert a string to a new string where each
     * | character in the new string is "(" if that character appears only once in the original string, or ")"
     * | if that character appears more than once in the original string.
     * |
     * | Ignore capitalization when determining if a character is a duplicate.                                             |
     * |
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | "din"      =>  "((("
     * | "recede"   =>  "()()()"
     * | "Success"  =>  ")())())"
     * | "(( @"     =>  "))(("
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(encode("din"));   // Output: (((
        System.out.println(encode("bbc"));   // Output: ))(
        System.out.println(encode("recede"));   // Output: ()()()
        System.out.println(encode("Success"));   // Output: )())())
        System.out.println(encode("(( @"));   // Output: ))((
    }

//    static String encode(String word) {
//        char[] chars = word.toLowerCase().toCharArray();
//        StringBuilder sb = new StringBuilder();
//        int counter = 0;
//        for (char c : chars) {
//            for (char aChar : chars) {
//                if (c == aChar)
//                    counter++;
//            }
//            if (counter > 1) {
//                sb.append(")");
//            } else {
//                sb.append("(");
//            }
//            counter = 0;
//        }
//        return sb.toString();
//    }

    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            //indexOf = first occurrence
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? '(' : ')');
        }
        return result.toString();
    }
}
