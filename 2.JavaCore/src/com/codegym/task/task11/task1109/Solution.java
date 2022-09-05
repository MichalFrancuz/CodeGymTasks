// Like cats and dogs
//        Make all the internal variables of the Cat and Dog classes private.
//        Also, make all the methods private, except those that allow these two classes to interact with each other.
//
//
//        Requirements:
//        1. The Cat class's variables must be private.
//        2. The Dog class's variables must be private.
//        3. The Cat class's methods must be private.
//        4. The Dog class's methods must be private.
//        5. Methods that let the Cat and Dog classes interact with each other must be public.

package com.codegym.task.task11.task1109;

/* 
Like cats and dogs

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Oscar", 5);
        Dog dog = new Dog("Rover", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private final String name;
    private final int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private final String name;
    private final int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}

// The task passed testing!
// Your solution to the task was better than 56% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 2.04.
// This task has been completed by 2579 students.