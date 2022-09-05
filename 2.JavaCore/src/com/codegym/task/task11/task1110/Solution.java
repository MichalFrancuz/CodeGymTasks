// Don't forget to encapsulate
//        Look carefully at the methods and add the missing fields.
//
//
//        Requirements:
//        1. The Cat class must have a String field name.
//        2. The Cat class must have an int field age.
//        3. The Cat class must have an int field weight.
//        4. The Cat class must have an int field speed.
//        5. The Cat class must have 4 fields.
//        6. All of the Cat class's fields must be private.

package com.codegym.task.task11.task1110;

/* 
Don't forget to encapsulate

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Cat {

        private final String name;

        private final int age;

        private int weight;

        private int speed;

        public Cat(String name, int age, int weight, int speed) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 26% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.43.
// This task has been completed by 2577 students.