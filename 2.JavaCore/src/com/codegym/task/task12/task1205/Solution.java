//Animal identification
//        Write a method that will determine the class of an object passed to it, and returns one of the following values: "Cow", "Whale",
//        "Dog", or "Unknown Animal".
//
//
//        Requirements:
//        1. The program must display text on the screen.
//        2. Don't change the Cow class.
//        3. Don't change the Dog class.
//        4. Don't change the Whale class.
//        5. Don't change the Pig class.
//        6. The getObjectType() method must return one of the following values: "Cow", "Whale", "Dog", or "Unknown Animal",
//        depending on the object passed to it. For instance, it should return "Cow" for Solution.Cow objects.

package com.codegym.task.task12.task1205;

/* 
Animal identification

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //write your code here
        if (o instanceof Cow) return "Cow";
        else if (o instanceof Whale) return "Whale";
        else if (o instanceof Dog) return "Dog";
        else return "Unknown Animal";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}

// The task passed testing!
// Your solution to the task was better than 55% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 2.13.
// This task has been completed by 2488 students.