package org.example.kata6kyu;

import java.util.HashMap;
import java.util.Map;


public class FindTheUniqueNumber {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | There is an array with some numbers. All numbers are equal except for one.
     * | Try to find it!
     * |
     * | It’s guaranteed that array contains at least 3 numbers.
     * | The tests contain some very huge arrays, so think about performance.
     * |
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | findUniq([ 1, 1, 1, 2, 1, 1 ]) === 2
     * | findUniq([ 0, 0, 0.55, 0, 0 ]) == 0.55
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1})); // Output: 2
        System.out.println(Kata.findUniq(new double[]{0, 0, 0.55, 0, 0})); // Output: 0.55
    }

//    public class Kata {
//        public static double findUniq(double arr[]) {
//            Map<Double, Integer> map = new HashMap<>();
//            for (int i = 0; i < arr.length; i++) {
//                int freq = map.getOrDefault(arr[i], 0);
//                map.put(arr[i], freq + 1);
//            }
//            for (int i = 0; i < arr.length; i++) {
//                if (map.get(arr[i]) == 1) {
//                    return arr[i];
//                }
//            }
//            return -1;
//        }
//    }

    public class Kata {
        public static double findUniq(double arr[]) {
            Map<Double, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                int freq = map.getOrDefault(arr[i], 0);
                map.put(arr[i], freq + 1);
            }
            for (double v : arr) {
                if (map.get(v) == 1) {
                    return v;
                }
            }
            return -1;
        }
    }


}
