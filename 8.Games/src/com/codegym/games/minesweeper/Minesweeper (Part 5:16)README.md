Minesweeper (Part 5/16)



Minesweeper is aptly named. The player has to deal with mines, though maybe it would be best
 for the player to stay far away from them :)

Let's add these mines to the game. To do this, we'll adapt the GameObject class to account
 for the fact that a cell can be a mine (by adding the isMine flag).

Don't create a new constructor: editing the existing constructor will suffice.

Additionally, when creating the cells, add code that generates mines with a probability of 
10%. The easiest way is to use the Game class's getRandomNumber(int n) method, which returns 
a random number from 0 to n-1 inclusive. Therefore, the probability of generating a certain 
number is 1/n.

And don't forget to count the number of generated mines in the MinesweeperGame class.

Once you've done all that, run the program and check that nothing is broken :)


Requirements:
1. The GameObject class must have a public boolean isMine field.
2. The GameObject class must have one constructor with (int, int, boolean) parameters that 
are used to initialize the x, y, and isMine fields, in that order.
3. There must be a private int countMinesOnField variable in the MinesweeperGame class.
4. When cells are created in the createGame() method, you should randomly determine whether 
each cell will have a mine. Use the Game class's getRandomNumber(int) method with the 
argument 10.
5. After the createGame() method is executed, the countMinesOnField variable should be 
assigned the value of the number of mines in the field.



The task passed testing!  
Your solution to the task was better than 63% other students. 
You solved it in 1 attempts. 
The average number of attempts for this task is 3.94. 
This task has been completed by 2421 students.