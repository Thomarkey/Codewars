package org.example.kata6kyu;

import java.util.Arrays;
import java.util.List;


public class SortTheOdd {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | You will be given an array of numbers.
     * You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | [7, 1]  =>  [1, 7]
     * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
     * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
     */

    public static void main(String[] args) {
        System.out.println(sortArray(new int[]{1, 7})); //1 7
        System.out.println(sortArray(new int[]{5, 8, 6, 3, 4})); //3 8 6 5 4
        System.out.println(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})); //1 8 3 6 5 4 7 2 9 0
    }

//    public static int[] sortArray(int[] array) {
//        ArrayList<Integer> oddNumbers = new ArrayList<>();
//        for (int number : array) {
//            if (number % 2 != 0) {
//                oddNumbers.add(number);
//            }
//        }
//        oddNumbers.sort(Integer::compareTo);
//        int oddIndex = 0;
//        for (int i = 0; i < array.length; i++) {
//            int currentInt = array[i];
//            if (currentInt % 2 != 0) {
//                array[i] = oddNumbers.get(oddIndex);
//                oddIndex++;
//            }
//        }
//        return array;
//    }

    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .sorted()
                .boxed()
                .toList();
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(oddIndex++);
            }
        }
        return array;
    }

}
