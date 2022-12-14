// Fluffy no more
//        Override the Cat class's setName method so that the following message is displayed:
//
//        "I'm a cat".
//
//
//        Requirements:
//        1. The Solution class must have a Pet class.
//        2. The Solution class must have a Cat class.
//        3. The Cat class must inherit the Pet class.
//        4. The Pet class must have only two methods called getName() and setName().
//        5. The Cat class must override the setName() method.
//        6. The program must display the result of calling the getName() method on pet.

package com.codegym.task.task12.task1222;

/* 
Fluffy no more

*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("I'm Fluffy");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        public void setName(String name) {
            this.name = "I'm a cat";
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 37% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.77.
// This task has been completed by 2356 students.