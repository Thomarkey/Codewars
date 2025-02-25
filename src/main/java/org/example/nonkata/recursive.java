package org.example.nonkata;

import java.util.ArrayList;
import java.util.List;

public class recursive {

    public static void main(String[] args) {
        System.out.println(returnNthFibonacciNumber(5)); //5
        System.out.println(returnNthFibonacciNumberRecursive(5)); //5
        countDown(10);
        countDownRecursive(10);
        System.out.println(sumDown(3)); // 3+2+1=6
    }


    /**
     * Calculate the nth Fibonacci number using recursion.
     * The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
     * Where each number is the sum of the two preceding ones.
     *
     * @param n the position in the Fibonacci sequence (0-based)
     * @return the Fibonacci number at position n
     * @throws IllegalArgumentException if n is negative
     */

    //iteratief
    public static long returnNthFibonacciNumber(int n) {
        List<Integer> fiboList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i > 1) {
                sum = fiboList.get(i - 1) + fiboList.get(i - 2);
                fiboList.add(sum);
            } else {
                fiboList.add(i);
            }
        }
        return fiboList.get(n);
    }

    //recursive
    public static long returnNthFibonacciNumberRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return returnNthFibonacciNumberRecursive(n - 1) + returnNthFibonacciNumberRecursive(n - 2);
    }

    //countdown
    public static void countDown(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void countDownRecursive(int number) {
        System.out.println(number);
        if (number > 1) {
            countDownRecursive(number - 1);
        }
    }


    public static int sumDown(int number) {
        if (number == 0) return 0;
        return number + sumDown(number - 1);
    }


}
