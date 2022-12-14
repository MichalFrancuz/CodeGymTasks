// Useless abstractions
//        You need to place the abstract keyword in the right places so that the program will compile.
//        Add abstract where needed and delete it where it isn't needed.
//
//
//        Requirements:
//        1. The Pegasus class must implement the CanFly interface.
//        2. The Pegasus class must inherit the Horse class.
//        3. The SwimmingPegasus class must inherit the Pegasus class.
//        4. You should be able to create a Horse object.
//        5. You should be able to create a Pegasus object.
//        6. The SwimmingPegasus class's swim() method must not be implemented.

package com.codegym.task.task12.task1231;

/* 
Useless abstractions

*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
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

    public abstract static class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }

}

// The task passed testing!
// Your solution to the task was better than 24% other students.
// You solved it in 2 attempts.
// The average number of attempts for this task is 2.53.
// This task has been completed by 2212 students.