// Whales and cows
//        Override the getName method in the Whale class, so that the program displays:
//
//        I'm not a cow. I'm a whale.
//
//
//        Requirements:
//        1. The program should display text on the screen.
//        2. The Whale class must inherit the Cow class.
//        3. The Whale class must override the getName() method.
//        4. The main() method must call the Cow object's getName() method.
//        5. Override the getName method in the Whale class so that the program displays: "I'm not a cow. I'm a whale."
//        6. The main() method should display the result of calling the getName() method.

package com.codegym.task.task12.task1201;

/* 
Whales and cows

*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm a cow";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "I'm not a cow. I'm a whale.";
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 28% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.48.
// This task has been completed by 2539 students.