// We all have a little cat in us…
//        Override the Cat class's getName method so that the following message gets displayed on the screen: "I'm a cat".
//
//
//        Requirements:
//        1. The Solution class must have a Pet class.
//        2. The Solution class must have a Cat class.
//        3. The Cat class must inherit the Pet class.
//        4. The Pet class must have only one method called getName().
//        5. The Cat class must override the getName() method.
//        6. The program must display the result of calling the getName() method on pet.

package com.codegym.task.task12.task1221;

/* 
We all have a little cat in us…

*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "I'm Fluffy";
        }
    }

    public static class Cat extends Pet {
        public String getName() {
            return "I'm a cat";
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 8% other students.
// You solved it in 2 attempts.
// The average number of attempts for this task is 1.38.
// This task has been completed by 2376 students.