// Private encapsulated cat
//        Make all the Cat class's internal variables private.
//
//
//        Requirements:
//        1. The Cat class's variable name must be private.
//        2. The Cat class's variable age must be private.
//        3. The Cat class's variable weight must be private.
//        4. There must be three variables in the Cat class.
//        5. All the variables in the Cat class must be private.

package com.codegym.task.task11.task1106;

/* 
Private encapsulated cat

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 4% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.06.
// This task has been completed by 2604 students.