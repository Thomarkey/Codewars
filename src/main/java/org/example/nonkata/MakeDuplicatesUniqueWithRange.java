package org.example.nonkata;

import java.util.HashSet;
import java.util.Set;

public class MakeDuplicatesUniqueWithRange {


    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Detect duplicate strings
     * | make duplicate strings unique
     * | by updating first position of the string with a letter
     * | A ==> B ==> C
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | Initial string: "200"
     * Try Original: "200" → Unique? Yes → Done.
     * Conflict: "200" exists → Replace first character with A: "A00" → Unique? Yes → Done.
     * Another Conflict: "A00" exists → Replace with B: "B00" → Unique? Yes → Done.
     * Yet Another Conflict: "B00" exists → Replace with C: "C00" → Unique? Yes → Done.
     * Failure: "C00" exists → Log an error.
     */


    public static void main(String[] args) {
        Set<String> uniqueStrings = new HashSet<>();
        System.out.println(updateIfNeeded(uniqueStrings, "200", 0)); //200
        System.out.println(updateIfNeeded(uniqueStrings, "200", 0)); //A00
        System.out.println(updateIfNeeded(uniqueStrings, "C00", 0)); //C00
        System.out.println(updateIfNeeded(uniqueStrings, "C00", 0)); //B00
        System.out.println(updateIfNeeded(uniqueStrings, "C00", 0)); //null

    }

//    public static String updateIfNeeded(Set<String> uniqueList, String input) {
//        char[] prefixes = {'A', 'B', 'C'};
//
//        int prefixIndex = 0;
//        while (!uniqueList.add(input)) {
//            if (prefixIndex >= prefixes.length) {
//                System.out.println("Unable to make unique string for:" + input);
//                return null;
//            }
//            input = prefixes[prefixIndex] + input.substring(1);
//            prefixIndex++;
//        }
//        return input;
//    }

    private final static char[] chars = {'A', 'B', 'C'};

//    public static String updateIfNeeded(Set<String> uniqueList, String input, int charIndex) {
//        if (!uniqueList.add(input)) {
//            if (charIndex >= chars.length) {
//                System.out.println("Unable to make unique string for:" + input);
//                return null;
//            }
//            input = chars[charIndex] + input.substring(1);
//            return updateIfNeeded(uniqueList, input, charIndex + 1);
//        }
//        return input;
//    }

    public static String updateIfNeeded(Set<String> uniqueList, String input, int charIndex) {
        if (uniqueList.add(input)) {
            return input;
        }
        if (charIndex >= chars.length) {
            System.out.println("Unable to make unique string for:" + input);
            return null;
        }
        input = chars[charIndex] + input.substring(1);
        return updateIfNeeded(uniqueList, input, charIndex + 1);
    }
}


//OTHER CHECKS

//    public static void main(String[] args) throws Exception {
//        System.out.println(setPost("ab")); //0ab
//        System.out.println(setPost("b")); //00b
//        System.out.println(setPost("a0b")); //a0b
//        System.out.println(setPost("12")); //012
//        System.out.println(setPost("123")); //123
//        System.out.println(setPost("1234")); //errorr

//        System.out.println(firstCharsForPost());

//    }


//    public static String setPost(String post) throws Exception {
//        if (post.length() > 3) {
//            throw new Exception("Post can not be larger than 3 chars!");
//        }
//        if (post.matches("\\d+")) {
//            return String.format("%03d", Integer.parseInt(post));
//        }
//        return String.format("%3s", post).replace(' ', '0');
//    }


//    public static char[] firstCharsForPost() {
//        String str = "A,B,C";
//        return str.replaceAll("[,\\s]", "").toCharArray();
//    }


