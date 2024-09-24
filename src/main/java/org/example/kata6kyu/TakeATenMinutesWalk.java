package org.example.kata6kyu;

public class TakeATenMinutesWalk {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * You live in the city of Cartesia where all roads are laid out in a perfect grid.
     * You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
     * The city provides its citizens with a Walk Generating App on their phones --
     * everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
     * You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block,
     * so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will,
     * of course, return you to your starting point. Return false otherwise.
     *
     * Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only).
     * It will never give you an empty array (that's not a walk, that's standing still!).
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * {'n','s','n','s','n','s','n','s','n','s'} true
     * {'w','e','w','e','w','e','w','e','w','e','w','e'} false
     * {'w'} false
     * {'n','n','n','s','n','s','n','s','n','s'} false
     */

    public static void main(String[] args) {
        //Test your methods here
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'})); // Output: true
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'})); // Output: false
        System.out.println(isValid(new char[]{'w'})); // Output: false
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'})); // Output: false
    }

//    public static boolean isValid(char[] walk) {
//        boolean isTen = walk.length == 10;
//        if (!isTen)
//            return false;
//        else {
//            int ns = 0;
//            int ew = 0;
//
//            for (char currentChar : walk) {
//                if (currentChar == 'n' || currentChar == 's') {
//                    if (currentChar == 'n') {
//                        ns++;
//                    } else {
//                        ns--;
//                    }
//                }
//                if (currentChar == 'e' || currentChar == 'w') {
//                    if (currentChar == 'e') {
//                        ew++;
//                    } else {
//                        ew--;
//                    }
//                }
//            }
//            return ns == 0 && ew == 0;
//        }
//    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0, y = 0;
        for (char c: walk) {
            switch (c) {
                case 'n': y++; break;
                case 's': y--; break;
                case 'w': x++; break;
                case 'e': x--; break;
            }
        }

        return x == 0 && y == 0;
    }

}
