package org.example.kata7kyu;

public class VowelCount {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Return the number (count) of vowels in the given string.
     * | We will consider a, e, i, o, u as vowels for this Kata (but not y).
     * | The input string will only consist of lower case letters and/or spaces.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(getCount("abracadabra"));   // Output: 5
        System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));   // Output: 13
    }


    public static int getCount(String str) {
        int counter = 0;
        for(char c : str.toCharArray()){
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                counter++;
            }
        }
        return counter;
    }
}
