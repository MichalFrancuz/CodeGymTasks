package com.codegym.games.minesweeper;

public class GameObject {
    public int countMineNeighbors, x, y;
    public boolean isMine, isOpen;

    public GameObject(int i, int j, boolean k) {
        this.x = i;
        this.y = j;
        this.isMine = k;
    }
}