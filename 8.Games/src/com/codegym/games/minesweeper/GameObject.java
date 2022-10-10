package com.codegym.games.minesweeper;

public class GameObject {

    public int countMineNeighbors;
    public int x, y;
    public boolean isMine;

    public GameObject(int i, int j, boolean k) {
        this.x = i;
        this.y = j;
        this.isMine = k;
    }
}
