package org.example.kata8kyu;

public class CalculateBMI {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Write function bmi that calculates body mass index (bmi = weight / height2).
     * | if bmi <= 18.5 return "Underweight"
     * | if bmi <= 25.0 return "Normal"
     * | if bmi <= 30.0 return "Overweight"
     * | if bmi > 30 return "Obese"
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(bmi(80, 1.80));   // Output: "Normal"
    }


    public static String bmi(double weight, double height) {
        double bmi = weight / (Math.pow(height, 2));

        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        }
        return "Obese";
    }
}

