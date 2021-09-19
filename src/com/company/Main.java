package com.company;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board(5,5);
        int game_board[][]  = board.get_board();

        System.out.println("1st Generation");
        board.fill(1,1);
        board.fill(0,1);
        board.fill(0,2);
        board.fill(0,3);
        board.fill(1,3);
        board.fill(2,3);
        board.fill(2,2);
        board.print_board();

        System.out.println("Count Neighbor");
        for (int i = 0; i < board.get_x(); i++){
            for (int j = 0; j < board.get_y(); j++) {
                System.out.print(board.count_neighbor(i,j));
            }
            System.out.println();
        }
    }
}
