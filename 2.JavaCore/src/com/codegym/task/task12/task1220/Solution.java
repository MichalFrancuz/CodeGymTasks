// Human class and CanRun and CanSwim interfaces
//        Write a public Human class, and public CanRun and CanSwim interfaces.
//        Add one method to each interface.
//        Add these interfaces to the Human class, but do not implement the methods.
//        Declare the Human class as abstract.
//
//
//        Requirements:
//        1. The Solution class must have a CanRun interface with only one method.
//        2. The Solution class must have a CanSwim interface with only one method.
//        3. The Solution class must have a Human class.
//        4. The Human class must implement the CanRun and CanSwim interfaces.
//        5. The Human class must be abstract.
//        6. The Human class should not have any methods.

package com.codegym.task.task12.task1220;

/* 
Human class and CanRun and CanSwim interfaces

*/

public class Solution {
    public static void main(String[] args) {

    }

    // Add public interfaces and a public class here
    public static abstract class Human implements CanRun, CanSwim {
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }
}

// The task passed testing!
// Your solution to the task was better than 26% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.52.
// This task has been completed by 2410 students.