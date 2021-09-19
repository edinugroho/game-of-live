package com.company;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board(5,5);
        int game_board[][]  = board.get_board();

        board.print_board();
    }
}
