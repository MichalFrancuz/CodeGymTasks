Minesweeper (Part 7/16)



At this stage, we'll deal with the logic to reveal cells. Let's create a corresponding 
method and a variable that will store the cell state (revealed or hidden).

When revealing a cell, the method will:

- draw a mine in the cell if it contains a mine;
- display the number of mined neighbors if the cell does not contain a mine;
- mark the cell as revealed in the model;
- change the cell color.
For convenience, we suggest adding the mine symbol to a separate constant. When the a cell 
be revealed? Correct! When you click on it with the left mouse button. To handle this click 
event, the engine has a special method: onMouseLeftClick(int, int).
Let's override it in our class. It will call the method that reveals a cell.

And, of course, run the program and enjoy the results of your work.


Requirements:
1. The MinesweeperGame class must have a private static final String MINE field that is 
initialized when it is declared. For example, you can use the UTF-16 symbol for a bomb: 
"\uD83D\uDCA3".
2. The MinesweeperGame class must have a private void openTile(int x, int y) method.
3. The openTile(int, int) method must draw MINE if the gameObject at the passed coordinates 
is a mine. Use the setCellValue(int, int, String) method.
4. The openTile(int, int) method must draw the number of adjacent mines if the gameObject at
 the passed coordinates is not a mine. Use the setCellNumber(int, int, int) method.
5. The GameObject class must have a public boolean isOpen field.
6. The openTile(int, int) method should set the isOpen field on the gameField element equal 
to true and use the setCellColor(int, int, Color) method to draw the cell background. For 
example, using Color.GREEN.
7. The MinesweeperGame class must override the Game parent class's onMouseLeftClick(int, 
int) method.
8. The onMouseLeftClick(int, int) method must call the openTile(int, int) method.



Your solution to the task was better than 39% other students. 
You solved it in 2 attempts. 
The average number of attempts for this task is 3.42. 
This task has been completed by 1330 students. 