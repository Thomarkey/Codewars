package org.example.kata7kyu;

public class DisemvowelTrolls {

        /**
        * ------------------------------------------------------------
        * |                      DESCRIPTION                         |
        * ------------------------------------------------------------
        * | Trolls are attacking your comment section!
        * | A common way to deal with this situation is to remove all of the vowels from the trolls' comments,
        * | neutralizing the threat.
        * | Your task is to write a function that takes a string and return a new string with all vowels removed.
        * | For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
        */

        /**
        * ------------------------------------------------------------
        * |                       EXAMPLES                            |
        * ------------------------------------------------------------
        * |
        */

        public static void main(String[] args) {
            // Test your methods here
            System.out.println(disemvowel("This website is for losers LOL!"));   // Output: "Ths wbst s fr lsrs LL!"
        }

        public static String disemvowel(String str) {
            return str.replaceAll("[aeiouAEIOU]", "");
        }
}
