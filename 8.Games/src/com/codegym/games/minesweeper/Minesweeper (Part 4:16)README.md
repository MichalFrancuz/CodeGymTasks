Minesweeper (Part 4/16)



We need to store the state of the playing field's cells somewhere. To do this, create a 
matrix (two-dimensional array) with the dimensions of the playing field. Populate the matrix 
with GameObject objects using this formula:

gameField[y][x] = new GameObject(x, y);
Now let's display all the cells on the screen.
The Game class's setCellColor(int, int, Color) method, whose parameters are the cell 
coordinates and color, will help us accomplish this.
Call it for each cell and pass the cell coordinates and any color (for example, 
Color.ORANGE) as arguments.
We suggest putting the logic to draw the matrix into a separate createGame() method, which 
we then call from the initialize method(). Run the program and see what happens.

Hint: use loops to call the setCellColor(int, int, Color) method for each cell of the matrix.


Requirements:
1. The MinesweeperGame class must have a private GameObject[][] gameField matrix (
two-dimensional array) whose dimensions are SIDExSIDE.
2. The MinesweeperGame class must have a private void createGame() method.
3. In the createGame method(), you need to populate each cell of the gameField array with a 
new GameObject object with corresponding x and y coordinates.
4. In the createGame() method, for each cell in the gameField array, you need to call the 
setCellColor(int, int, Color) method with the following arguments: x and y coordinates, as 
well as any color (for example, Color.ORANGE).
5. The createGame() method must be called in the initialize() method.



The task passed testing!  
Your solution to the task was better than 33% other students. 
You solved it in 5 attempts. 
The average number of attempts for this task is 6.05. 
This task has been completed by 2848 students. 