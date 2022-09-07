// Minimum and Maximum
//        Write a method which returns the minimum and maximum numbers of an array.
//
//
//        Requirements:
//        1. The program must not read data from the keyboard.
//        2. Don't change the Pair class.
//        3. Don't change the main method.
//        4. Finish writing the getMinimumAndMaximum method. It must return a pair containing the minimum and maximum.
//        5. The program must return the correct result.
//        6. The getMinimumAndMaximum() method should not modify the inputArray array.

package com.codegym.task.task11.task1123;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<>(null, null);
        }
        // write your code
        int min = 0, max = 0, k = 0, l = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) { // checking every value (all iteration for j) for first value (first iteration of i)
                if (k == 0) {
                    if (array[i] <= array[j]) { // finding first minimum number
                        min = array[i]; // set first minimum number
                        k++;
                    }
                } else if (array[i] <= min) min = array[i]; // now I can update my minimum number by comparing another values from array
                if (l == 0) {
                    if (array[i] >= array[j]) { // finding first maximum number
                        max = array[i]; // set first maximum number
                        l++;
                    }
                } else if (array[i] >= max) max = array[i]; // now I can update my maximum number by comparing another values from array
            }
        }

        return new Pair<>(min, max);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 25% other students.
// You solved it in 2 attempts.
// The average number of attempts for this task is 2.31.
// This task has been completed by 2335 students.