package org.example.kata8kyu;

public class KeepHydrated {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * |  Nathan loves cycling.
     *
     * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
     * You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    time = 3 ----> litres = 1
     *      time = 6.7---> litres = 3
     *      time = 11.8--> litres = 5
     */

    public static void main(String[] args) {
        System.out.println(Liters(3));   // Output: 1
        System.out.println(Liters(6.7));  // Output: 3
        System.out.println(Liters(11.8)); // Output: 5
    }

    public static int Liters(double time) {
        return (int) Math.floor(time / 2);
    }
}


