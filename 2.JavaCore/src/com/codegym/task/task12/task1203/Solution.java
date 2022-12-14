// Render to Caesar the things that are Caesar's
//        Override the getChild method in the Cat and Dog classes so that cats give birth to cats and dogs to dogs.
//
//
//        Requirements:
//        1. The Cat class must inherit the Pet class.
//        2. The Dog class must inherit the Pet class.
//        3. The Cat class must override the getChild() method so that cats give birth to cats.
//        4. The Dog class must override the getChild() method so that dogs give birth to dogs.
//        5. The main() method must call the getChild() method on a Cat object.
//        6. The main() method must call the getChild() method on a Dog object.

package com.codegym.task.task12.task1203;

/* 
Render to Caesar the things that are Caesar's

*/

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        public Pet getChild() {
            return new Dog();
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 12% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.23.
// This task has been completed by 2522 students.