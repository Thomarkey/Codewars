package org.example.kata6kyu;

public class WriteNumberInExpandedForm {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | You will be given a number and you will need to return it as a string in Expanded Form.
     * NOTE: All numbers will be whole numbers greater than 0.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | Kata.expandedForm(12); # Should return "10 + 2"
     *  Kata.expandedForm(42); # Should return "40 + 2"
     *  Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
     */

    public static void main(String[] args) {
        System.out.println(expandedForm(12)); // "10 + 2"
        System.out.println(expandedForm(42)); // "40 + 2"
        System.out.println(expandedForm(70304)); // "7000 + 300 + 4"
    }

    public static String expandedForm(int num)
    {
        String numString = String.valueOf(num);
        int numLength = numString.length();
        StringBuilder solution = new StringBuilder();

        for (int i = 0; i < numLength; i++) {
            char x = numString.charAt(i);
            if (!(x == '0')) {
                if(!solution.toString().equals("")){
                    solution.append(" + ");
                }
                solution.append(x);
                if (!(numLength - i == 1)) {
                    for (int j = 1; j < numLength - i; j++) {
                        solution.append("0");
                    }
                }
            }
        }
        return solution.toString();
    }

}
