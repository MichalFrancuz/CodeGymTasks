// Eat, fly, and move
//        The public CanFly, CanMove, and CanEat interfaces have already been written.
//        Add these interfaces to the Dog, Car, Duck, and Airplane classes.
//
//
//        Requirements:
//        1. The Solution class must have a CanFly interface with only one method called fly().
//        2. The Solution class must have a CanMove interface with only one method called move().
//        3. The Solution class must have an CanEat interface with only one method called eat().
//        4. A dog must be able to move around and eat.
//        5. A car must be able to move.
//        6. A plane must be able to move and fly.
//        7. A duck should be able to move, fly, and eat.

package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public static class Dog implements CanMove, CanEat {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public static class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public static class Car implements CanMove {
        @Override
        public void move() {

        }
    }

    public static class Airplane implements CanMove, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}

// The task passed testing!
// Your solution to the task was better than 46% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 2.05.
// This task has been completed by 2427 students.