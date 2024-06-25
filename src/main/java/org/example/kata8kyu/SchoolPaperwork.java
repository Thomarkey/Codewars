package org.example.kata8kyu;

public class SchoolPaperwork {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Your classmates asked you to copy some paperwork for them.
     * | You know that there are 'n' classmates and the paperwork has 'm' pages.
     * |
     * | Your task is to calculate how many blank pages do you need.
     * | If n < 0 or m < 0 return 0.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    n= 5, m=5: 25
     * |    n=-5, m=5:  0
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(paperWork(5, 5));   // Output: 25
        System.out.println(paperWork(5, -5));   // Output: 0
        System.out.println(paperWork(-5, -5));   // Output: 0
        System.out.println(paperWork(-5, 5));   // Output: 0
        System.out.println(paperWork(5, 0));   // Output: 0
    }


    public static int paperWork(int n, int m) {
        return n > 0 && m > 0 ? n * m : 0;
    }
}
