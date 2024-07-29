package org.example.kata8kyu;

public class ReduceButGrow {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Given a non-empty array of integers, return the result of multiplying the values together in order.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(grow(new int[]{1,2,3, 4}));   //24
    }

    public static int grow(int[] x){
        int value=1;
        for(int i : x){
            value*= i;
        }
        return value;

    }
}
