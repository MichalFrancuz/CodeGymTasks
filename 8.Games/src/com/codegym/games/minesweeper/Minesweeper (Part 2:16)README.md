Minesweeper (Part 2/16)



Our playing field is kind of small, don't you think? It should be 9x9 cells:

1) There is a setScreenSize(int, int) method to set the size of the field
2) This method takes width and height arguments (the number of cells wide and high)
3) the dimensions of the field will be used frequently, so it's convenient to put them in a constant named SIDE
4) the result should be a call like this: initialize method()
6) this means that the initialize() method must be declared in the MinesweeperGame class

Check the results of your work — run the program.


Requirements:
1. The SIDE variable must be declared in the MinesweeperGame class.
2. The SIDE variable must be private, static, and final, and must be an int.
3. The SIDE variable must be initialized to 9 when it is declared.
4. There should be a public void initialize() method in the MinesweeperGame class.
5. The Game class's setScreenSize(int, int) method must be called with arguments (SIDE, 
SIDE) in the initialize() method.



The task passed testing!  
Your solution to the task was better than 31% other students. 
You solved it in 2 attempts. 
The average number of attempts for this task is 3.2. 
This task has been completed by 4257 students.