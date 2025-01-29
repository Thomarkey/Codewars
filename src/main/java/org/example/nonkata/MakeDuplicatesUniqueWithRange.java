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
        System.out.println(updateIfNeeded(uniqueStrings, "200")); //200
        System.out.println(updateIfNeeded(uniqueStrings, "200")); //A00
        System.out.println(updateIfNeeded(uniqueStrings, "C00")); //C00
        System.out.println(updateIfNeeded(uniqueStrings, "C00")); //B00
        System.out.println(updateIfNeeded(uniqueStrings, "C00")); //null

    }


    public static String updateIfNeeded(Set<String> uniqueList, String input) {
        char[] prefixes = {'A', 'B', 'C'};

        int prefixIndex = 0;
        while (!uniqueList.add(input)) {
            if (prefixIndex >= prefixes.length) {
                System.out.println("Unable to make unique string for:" + input);
                return null;
            }
            input = prefixes[prefixIndex] + input.substring(1);
            prefixIndex++;
        }
        return input;
    }

}
