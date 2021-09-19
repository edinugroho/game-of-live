package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void get_board() {
        Board board = new Board(5,5);
        assertEquals(5, board.get_board().length);
    }

    @Test
    void fill() {
        Board board = new Board(5,5);
        board.fill(0,0);
        assertEquals(1, board.get_board()[0][0]);
    }
}