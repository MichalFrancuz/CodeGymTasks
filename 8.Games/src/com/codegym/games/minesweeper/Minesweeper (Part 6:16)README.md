Minesweeper (Part 6/16)



Now let's count the mines in adjacent cells. To do this, we'll add a field to each cell of 
the matrix, which will be responsible for the number of mined neighbors. First, we find all 
the neighbors, and then we count how many of them are mined.

To get the list of neighbors, you now have the getNeighbors() method, which has one 
GameObject (cell) parameter.

Your task is to, in a separate method, count the number of mined neighbors for each cell in 
gameField and assign this value to the appropriate field of the cell.

Although your work is not visible (you started program to see what happens, right?), it is 
very important to future steps.


Requirements:
1. The GameObject class must have a public int countMineNeighbors field.
2. The MinesweeperGame class must have a private void countMineNeighbors() method.
3. The countMineNeighbors() method should, for each non-mined cell in the gameField matrix, 
count the number of adjacent mined cells and assign this value to the countMineNeighbors 
field.
4. The countMineNeighbors() method should use the getNeighbors(GameObject gameObject) method.
5. In the createGame() method, after all the elements of the gameField matrix are created, 
the countMineNeighbors() method must be called.



The task passed testing!  
Your solution to the task was better than 40% other students. 
You solved it in 3 attempts. 
The average number of attempts for this task is 5.2. 
This task has been completed by 1652 students.