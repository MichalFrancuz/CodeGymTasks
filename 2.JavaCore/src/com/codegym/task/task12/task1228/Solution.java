// Interfaces for the Human class
// Add as many interfaces to the Human class as possible, but be sure that it doesn't become an abstract class.
//        You can't add methods to the Human class.
//
//
//        Requirements:
//        1. The Solution class must have an Employee interface with a void workLazily() method.
//        2. The Solution class must have a Businessman interface with a void workHard() method.
//        3. The Solution class must have a Secretary interface with a void workLazily() method.
//        4. The Solution class must have a Miner interface with a void workVeryHard() method.
//        5. The Solution class must have a Human class with the methods: void workHard() and void workLazily().
//        6. The Human class must implement three interfaces.

package com.codegym.task.task12.task1228;

/* 
Interfaces for the Human class

*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public interface Employee {
        void workLazily();
    }

    public interface Businessman {
        void workHard();
    }

    public interface Secretary {
        void workLazily();
    }

    public interface Miner {
        void workVeryHard();
    }

    public static class Human implements Employee, Businessman, Secretary {

        public void workHard() {
        }

        public void workLazily() {
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 40% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.67.
// This task has been completed by 2267 students.