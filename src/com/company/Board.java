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

    public int get_y(){
        return this.y;
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
        if (x != 0 && y != 0 && x != this.x-1 && y != this.y-1) {
            // left
            if (this.board[x][y - 1] == 1) {
                neighbor += 1;
            }
            // top left
            if (this.board[x - 1][y - 1] == 1) {
                neighbor += 1;
            }
            // top
            if (this.board[x - 1][y] == 1) {
                neighbor += 1;
            }
            // top right
            if (this.board[x - 1][y + 1] == 1) {
                neighbor += 1;
            }
            // right
            if (this.board[x][y + 1] == 1) {
                neighbor += 1;
            }
            // bottom right
            if (this.board[x + 1][y + 1] == 1) {
                neighbor += 1;
            }
            // bottom
            if (this.board[x + 1][y] == 1) {
                neighbor += 1;
            }
            // bottom left
            if (this.board[x + 1][y - 1] == 1) {
                neighbor += 1;
            }
        }
        return neighbor;
    }

    public int rules(int current, int neighbor){
        // Any live cell with fewer than two live neighbors dies, as if by loneliness.
        if(current == 0 && neighbor > 2){
            return 0;
        }
        //Any live cell with more than three live neighbors dies, as if by overcrowding.
        else if(current == 1 && neighbor > 3){
            return 0;
        }
        // Any dead cell with exactly three live neighbors comes to life.
        else if(current == 0 && neighbor == 3){
            return 1;
        }
        return current;
    }
}
