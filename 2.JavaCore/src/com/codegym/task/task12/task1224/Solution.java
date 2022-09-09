// Unknown animal
//        Write a method that will determine the type of object passed to it.
//        The program should display one of the following:
//        "Cat", "Tiger", "Lion", "Bull", or "Animal".
//
//
//        Requirements:
//        1. The Solution class must have Cat, Tiger, Lion, Bull, and Pig classes.
//        2. The Solution class must have a String getObjectType(Object o) method.
//        3. The getObjectType() method must return "Cat" if a Cat object is passed.
//        4. The getObjectType() method must return "Tiger" if a Tiger object is passed.
//        5. The getObjectType() method must return "Lion" if a Lion object is passed.
//        6. The getObjectType() method must return "Bull" if a Bull object is passed.
//        7. The getObjectType() method must return "Animal" if any other object is passed.
//        8. The program should display the result of calling the getObjectType() method.

package com.codegym.task.task12.task1224;

/* 
Unknown animal

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //write your code here

        String string;
        if (o instanceof Cat) string = "Cat";
        else if (o instanceof Tiger) string = "Tiger";
        else if (o instanceof Lion) string = "Lion";
        else if (o instanceof Bull) string = "Bull";
        else if (o instanceof Pig) string = "Pig";
        else string = "Animal";
        return string;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}

// The task passed testing!
// Your solution to the task was better than 28% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.54.
// This task has been completed by 2324 students.