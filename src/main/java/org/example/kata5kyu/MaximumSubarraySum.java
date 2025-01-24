package org.example.kata5kyu;

public class MaximumSubarraySum {
    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
     * <p>
     * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
     * // should be 6: {4, -1, 2, 1}
     * <p>
     * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.
     * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
     * /**
     * <p>
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
     * // should be 6: {4, -1, 2, 1}
     */

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 4 -1 2 1
    }

    public static int sequence(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }


    //O(N) SOLUTION
    //Kadane's Algorithm:
    //
    //The algorithm iterates through the array once, updating the currentSum to either include the current element or start fresh from the current element.
    //maxSum keeps track of the highest sum encountered so far.

//    public static int sequence(int[] arr) {
//        int currentSum  = 0;
//        int maxSum = 0;
//        for(int value : arr) {
//            //sum the sequence unless the sum is less than the current element, if that occurs start summing from the current element
//            currentSum = Math.max(value, currentSum + value);
//            // assign maxSum as the greater of the current sum sequence and previous greatest sequence
//            maxSum = Math.max(maxSum, currentSum);
//        }
//        return maxSum;
//    }
}
