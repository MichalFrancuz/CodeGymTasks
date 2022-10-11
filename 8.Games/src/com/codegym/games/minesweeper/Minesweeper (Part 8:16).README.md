Minesweeper (Part 8/16)



The rules of the game provide flags to help the player. They are needed to mark cells that 
might be mined. Accordingly, the number of flags (countFlags) must be equal to the number of 
mines (countMinesOnField).

You need to show flags somehow on the playing field. To do this, we'll create a constant to 
hold the symbol that represents them. Each cell in the model must have an isFlag field that 
will tell us whether a cell is flagged.


Requirements:
1. The MinesweeperGame class must have a private static final String FLAG field that is 
initialized when it is declared. For example, you can use the UTF-16 symbol for a flag: 
"\uD83D\uDEA9".
2. The MinesweeperGame class must have a private int countFlags field that stores the number 
of unused flags.
3. The createGame() method must set the countFlags field equal to countMinesOnField.
4. The GameObject class must have a public boolean isFlag field.



The task passed testing!  
Your solution to the task was better than 22% other students. 
You solved it in 1 attempts. 
The average number of attempts for this task is 1.49. 
This task has been completed by 1259 students.