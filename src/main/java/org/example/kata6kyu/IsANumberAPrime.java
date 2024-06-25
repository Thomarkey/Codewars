package org.example.kata6kyu;

public class IsANumberAPrime {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Define a function that takes an integer argument and returns a logical value true or false depending on if the integer is a prime.
     * | Per Wikipedia, a prime number ( or a prime ) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     * |
     * | Requirements
     * | You can assume you will be given an integer input.
     * | You can not assume that the integer will be only positive. You may be given negative numbers as well ( or 0 ).
     * | NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out.
     * | Numbers go up to 2^31 ( or similar, depending on language ). Looping all the way up to n, or n/2, will be too slow.                                               |
     * |
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    is_prime(1)   false
     * |    is_prime(2)   true
     * |    is_prime(-1)   false
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(isPrime(0));   // Output: false
        System.out.println(isPrime(1));   // Output: false
        System.out.println(isPrime(4));   // Output: false
        System.out.println(isPrime(73));   // Output: true
        System.out.println(isPrime(41));   // Output: true
        System.out.println(isPrime(5099));   // Output: true
        System.out.println(isPrime(-41));   // Output: false

    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
