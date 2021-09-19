package com.company;

public class Board {
    public int x;
    public int y;
    public int neighbor;
    public int[][] board;

    public Board(int x,int y){
        this.x = x;
        this.y = y;
        this.board = new int[x][y];
    }

    public int[][] get_board(){
        return this.board;
    }

    public int get_x(){
        return this.x;
    }

    public void fill(int x, int y){
        this.board[x][y] = 1;
    }

    public void remove(int x, int y){
        this.board[x][y] = 0;
    }

    public void print_board(){
        for (int i = 0; i < this.x; i++) {
            for(int j = 0; j < this.y; j++) {
                System.out.print(this.board[i][j]);
            }
            System.out.println();
        }
    }

    public int count_neighbor(int x, int y){
        neighbor = 0;

        return neighbor;
    }
}
