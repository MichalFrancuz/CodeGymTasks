// Cats should not be abstract!
//        Make the Cat and Dog classes inherit Pet.
//        Implement the missing methods.
//        The Cat and Dog classes should not be abstract.
//
//
//        Requirements:
//        1. The Pet class must be abstract.
//        2. The Dog class must not be abstract.
//        3. The Cat class must not be abstract.
//        4. The Dog class must implement the Pet class's abstract methods.
//        5. The Cat class must implement the Pet class's abstract methods.

package com.codegym.task.task12.task1215;

/* 
Cats should not be abstract!

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        Pet pet = new Cat();

        public String getName() {
            return "";
        }

        public Pet getChild() {
            return pet;
        }
    }

    public static class Dog extends Pet {
        Pet pet = new Cat();

        public String getName() {
            return "";
        }

        public Pet getChild() {
            return pet;
        }
    }

}

// The task passed testing!
// Your solution to the task was better than 21% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.71.
// This task has been completed by 2440 students.