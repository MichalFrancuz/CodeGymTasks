//Executing a snippet of code
//        Practice executing a snippet of code while a program is running:
//
//        Put a break point on the call to the println method and run the program in debug mode.
//        After execution stops, press Alt+F8 (Option+F8 for macOS) and execute the following code: loop.replaceAll("\\W", "").split("fahrenheit")[1]
//        Assign the result of executing this code to the result field (change the source code).
//        This means there should be only one change in the Solution class: the result field should be initialized when it is declared.
//
//
//        Requirements:
//        1. Don't change the main method.
//        2. The result field must be assigned the correct value.

package en.codegym.task.pro.task05.task0521;

/* 
Executing a snippet of code
*/

public class Solution {

    public static int result = 45967;

    public static void main(String[] args) {
        String loop = "    for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {\n";
        System.out.println(loop);
    }
}

// Your solution to the task was better than 20% other students.
// You solved it in 1 attempts.
// The average number of attempts for this task is 1.37.
// This task has been completed by 663 students.

