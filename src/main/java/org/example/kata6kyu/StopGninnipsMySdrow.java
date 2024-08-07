package org.example.kata6kyu;

public class StopGninnipsMySdrow {
    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Write a function that takes in a string of one or more words, and returns the same string,
     * but with all words that have five or more letters reversed (Just like the name of this Kata).
     * Strings passed in will consist of only letters and spaces.
     * Spaces will be included only when more than one word is present.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    "Hey fellow warriors"  --> "Hey wollef sroirraw"
     *      "This is a test        --> "This is a test"
     *      "This is another test" --> "This is rehtona test"
     */

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors")); //"Hey wollef sroirraw"
        System.out.println(spinWords("This is a test")); //"This is a test
        System.out.println(spinWords("This is another test")); //"This is rehtona test"
    }

    public static String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] string = sentence.split(" ");

        for (String s : string) {
            StringBuilder newSb = new StringBuilder(s);
            if (s.length() >= 5) {
                sb.append(newSb.reverse());
            } else {
                sb.append(newSb);
            }
            sb.append(" ");
        }
        return sb.substring(0,sb.length()-1);
    }

}
