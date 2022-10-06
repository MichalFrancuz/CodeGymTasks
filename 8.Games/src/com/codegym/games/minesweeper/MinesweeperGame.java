package com.codegym.games.minesweeper;

import com.codegym.engine.cell.*;


public class MinesweeperGame extends Game {
    private int countMinesOnField = 0;
    private static final int SIDE = 9;
    private final GameObject[][] gameField = new GameObject[SIDE][SIDE];

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        int countMine = 0;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                int n = getRandomNumber(10);
                boolean isMineMG = false;
                if (n == 9) {
                    isMineMG = true;
                    countMine++;
                }
                gameField[i][j] = new GameObject(j, i, isMineMG);
                setCellColor(j, i, Color.ORANGE);
            }
        }
        countMinesOnField = countMine;
    }
}