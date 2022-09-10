// Parent of the CTO class
// Add a parent class to the CTO class so that the class isn't abstract.
//        You can't add or implement any methods in the CTO class.
//
//
//        Requirements:
//        1. The Solution class must have a Businessman interface with a void workHard() method.
//        2. The Solution class must have a non-abstract CTO class.
//        3. The CTO class must implement the Businessman interface.
//        4. The CTO class must not have any methods.
//        5. The Solution class must have one additional class.
//        6. The CTO class must inherit the additional class.
//        7. The additional class must have one method.

package com.codegym.task.task12.task1229;

/* 
Parent of the CTO class

*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public interface Businessman {
        void workHard();
    }

    public static class CTO extends Additional implements Businessman {
    }

    public static class Additional {
        public void workHard() {
        }
    }
}

// The task passed testing!
// Your solution to the task was better than 17% other students.
// You solved it in 3 attempts.
// The average number of attempts for this task is 2.56.
// This task has been completed by 2210 students.