package com.company;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board(10,10);
        int game_board[][]  = board.get_board();

        Board board1 = new Board(10,10);
        int neighbor_board[][]  = board1.get_board();

        Board board2 = new Board(10,10);
        int next_board[][]  = board2.get_board();


        System.out.println("1st Generation");
        board.fill(2,1);
        board.fill(2,2);
        board.fill(2,3);
        board.print_board();

        System.out.println("Count Neighbor");
        for (int i = 0; i < board.get_x(); i++){
            for (int j = 0; j < board.get_y(); j++) {
                neighbor_board[i][j] = board.count_neighbor(i,j);
            }
        }
        board1.print_board();

        System.out.println("Next Generation");
        for (int i = 0; i < board.get_x(); i++) {
            for(int j = 0; j < board.get_y(); j++) {
                next_board[i][j] = board2.rules(game_board[i][j],neighbor_board[i][j]);
            }
        }
        board2.print_board();
    }
}
