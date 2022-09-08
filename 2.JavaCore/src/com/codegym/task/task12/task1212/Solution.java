// "Fix the code", part 1
//        Correct the code so the program will compile.
//
//        Hint:
//        The getChild method must remain abstract.
//
//
//        Requirements:
//        1. The Pet class must be static.
//        2. The Pet class must have two methods.
//        3. The getChild() method must be abstract.
//        4. The Pet class must be declared with a modifier that prevents the creation of objects of this class.

package com.codegym.task.task12.task1212;

/* 
"Fix the code", part 1

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "I'm a kitten";
        }

        public abstract Pet getChild();
    }
}

// The task passed testing!
// Your solution to the task was better than 7% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.12.
// This task has been completed by 2487 students.