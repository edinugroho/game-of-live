package com.company;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board(10,10);
        int game_board[][]  = board.get_board();

        System.out.println("1st Generation");
        board.fill(2,1);
        board.fill(2,2);
        board.fill(2,3);
        board.print_board();

        System.out.println("Count Neighbor");
        int next_board[][]  = board.get_board();
        for (int i = 0; i < board.get_x(); i++){
            for (int j = 0; j < board.get_y(); j++) {
                next_board[i][j] = board.rules(game_board[i][j], board.count_neighbor(i,j));
            }
            System.out.println();
        }

        board.print_board();

    }
}
