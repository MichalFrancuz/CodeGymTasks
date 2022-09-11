// The isomorphs are coming
//        Write a method that returns the minimum of an array and its position (index).
//
//
//        Requirements:
//        1. The Solution class must have a Pair class.
//        2. The Solution class must have two methods.
//        3. The Solution class must have a getMinimumAndIndex() method.
//        4. The getMinimumAndIndex() method must return the minimum of the array and its position (index).

package com.codegym.task.task12.task1233;

/* 
The isomorphs are coming

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<>(null, null);
        }
        //write your code here
        int minValue = 0, minIndex = 0, counter = 0;
        for (int i = 0, j = i + 1; i < array.length - 1; i++) {
            if (array[i] <= array[j] && counter == 0) {
                minValue = array[i];
                minIndex = i;
                counter++;
            } else if (array[i] <= minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return new Pair<>(minValue, minIndex);
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
// Your solution to the task was better than 31% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.86.
// This task has been completed by 2134 students.