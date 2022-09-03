//Changing shoes on the move
//        Practice declaring and changing the values of variables while a program is running:
//
//        Put a break point on the call to the println method and run the program in debug mode.
//        After execution stops, press F8 exactly 9 times.
//        Look at the current value for the correction variable and set the fahrenheit variable to the same value (in the debug window).
//        Press F8 6 more times.
//        Look at the current value of the correction variable and assign this value to the result field (change the source code).
//        This means there should be only one change in the Solution class: the result field should be initialized when it is declared.
//
//
//        Requirements:
//        1. Don't change the main method.
//        2. The result field must be assigned the correct value.

package en.codegym.task.pro.task05.task0520;

/* 
Changing shoes on the move
*/

public class Solution {

    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}

//    The task passed testing!
//    Your solution to the task was better than 50% other students.
//    You solved it in 1 attempts.
//    The average number of attempts for this task is 2.2.
//    This task has been completed by 701 students.