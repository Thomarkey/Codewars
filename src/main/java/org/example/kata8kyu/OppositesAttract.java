package org.example.kata8kyu;

public class OppositesAttract {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
     * | If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
     *
     * | Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.                                             |
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    isLove(1,4)   true
     * |    isLove(2,2)   false
     * |    isLove(1,1)   false
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(isLove(1, 4));   // Output: true
        System.out.println(isLove(2, 2));   // Output: false
        System.out.println(isLove(1, 1));   // Output: false

    }


//    public static boolean isLove(final int flower1, final int flower2) {
//
//        if (flower1 % 2 == 0 && flower2 % 2 != 0) {
//            return true;
//        }
//
//        return flower1 % 2 != 0 && flower2 % 2 == 0;
//
//    }
//
//    public static boolean isLove(final int flower1, final int flower2) {
//        return (flower1 % 2 == 0) != (flower2 % 2 == 0);
//    }


    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }

}
