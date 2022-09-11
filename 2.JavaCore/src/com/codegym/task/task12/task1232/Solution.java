// Adding new functionality
//        Make a Pegasus class using the Horse class and the CanFly interface.
//
//
//        Requirements:
//        1. The Solution class must have a CanFly interface with a fly() method.
//        2. The Solution class must have a Horse class with a run() method.
//        3. The Solution class must have a Pegasus class.
//        4. The Pegasus class must inherit the Horse class.
//        5. The Pegasus class must implement the CanFly interface.

package com.codegym.task.task12.task1232;

/* 
Adding new functionality

*/

public class Solution {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public interface CanFly {
        void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 11% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.26.
// This task has been completed by 2216 students.