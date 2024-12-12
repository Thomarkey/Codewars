package org.example.kata5kyu;

public class Rot13 {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet.
     * ROT13 is an example of the Caesar cipher.
     *
     * Create a function that takes a string and returns the string ciphered with Rot13.
     * If there are numbers or special characters included in the string, they should be returned as they are.
     * Only letters from the latin/english alphabet should be shifted,
     * like in the original Rot13 "implementation".
     *
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    "test" --> grfg
     * "Test" --> Grfg
     */

    public static void main(String[] args) {
        System.out.println(rot13("test")); //grfg
        System.out.println(rot13("Test")); //Grfg
    }



//    public static String rot13(String str) {
//        char[] chars = str.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if (c >= 'a' && c <= 'z') {
//                chars[i] = (char) ((c - 'a' + 13) % 26 + 'a');
//            } else if (c >= 'A' && c <= 'Z') {
//                chars[i] = (char) ((c - 'A' + 13) % 26 + 'A');
//            }
//        }
//        return new String(chars);
//    }

    public static String rot13(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (((c - base + 13) % 26) + base));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    //The % 26 and - 'a' or - 'A' operations are used to implement the ROT13 cipher correctly. Here's a brief explanation:

    //- 'a' or - 'A': This operation normalizes the character to a zero-based index within the alphabet.
    // For example, 'a' becomes 0, 'b' becomes 1, and so on. Similarly, 'A' becomes 0, 'B' becomes 1, etc.

    //+ 13: This shifts the character by 13 positions in the alphabet, which is the core of the ROT13 cipher.

    //% 26: This ensures that the shift wraps around if it goes past the end of the alphabet.
    // For example, shifting 'z' by 13 positions should wrap around to 'm'.

    //+ 'a' or + 'A': This converts the zero-based index back to the corresponding character in the alphabet.

}
