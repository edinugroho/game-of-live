package com.company;

public class Board {
    public int x;
    public int y;
    public int[][] board;

    public Board(int x,int y){
        this.x = x;
        this.y = y;
        this.board = new int[x][y];
    }

    public int[][] get_board(){
        return this.board;
    }

    public void fill(int x, int y){
        this.board[x][y] = 1;
    }

    public void remove(int x, int y){
        this.board[x][y] = 0;
    }
}
