// CanFly, CanRun, and CanSwim for the Duck, Penguin, and Toad classes
//        The CanFly, CanSwim, and CanRun interfaces have already been written for you.
//        Add these interfaces to the Duck, Penguin, and Toad classes.
//
//
//        Requirements:
//        1. The Solution class must have a CanFly interface with a void fly() method.
//        2. The Solution class must have a CanSwim interface with a void swim() method.
//        3. The Solution class must have a CanRun interface with a void run() method.
//        4. The Solution class must have Duck, Penguin, and Toad classes.
//        5. A Duck object must be able to fly (support the CanFly interface), run (support the CanRun interface), and swim (support the CanSwim interface).
//        6. A Penguin object must be able to run (support the CanRun interface) and swim (support the CanSwim interface).
//        7. A Toad object must only be able to swim (support the CanSwim interface).

package com.codegym.task.task12.task1227;

/* 
CanFly, CanRun, and CanSwim for the Duck, Penguin, and Toad classes

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract static class Duck implements CanFly, CanRun, CanSwim {

    }

    public abstract static class Penguin implements CanRun, CanSwim {

    }

    public abstract static class Toad implements CanSwim {

    }
}

// The task passed testing!
// Your solution to the task was better than 20% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.29.
// This task has been completed by 2267 students.