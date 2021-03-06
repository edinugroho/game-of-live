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

    @Test
    void remove() {
        Board board = new Board(5,5);
        board.remove(0,0);
        assertEquals(0, board.get_board()[0][0]);
    }

    @Test
    void count_neighbor() {
        Board board = new Board(5,5);
        assertEquals(0,board.count_neighbor(2,2));
    }

    @Test
    void get_x() {
        Board board = new Board(5,5);
        assertEquals(5, board.get_x());
    }

    @Test
    void get_y() {
        Board board = new Board(5,5);
        assertEquals(5, board.get_y());
    }

    @Test
    void count_neighbor_left() {
        Board board = new Board(5,5);
        board.fill(1,1);
        assertEquals(1,board.count_neighbor(1,2));
    }

    @Test
    void count_neighbor_top_left() {
        Board board = new Board(5,5);
        board.fill(1,1);
        board.fill(0,1);
        assertEquals(2,board.count_neighbor(1,2));
    }

    @Test
    void count_neighbor_top() {
        Board board = new Board(5,5);
        board.fill(0,2);
        assertEquals(1,board.count_neighbor(1,2));
    }

    @Test
    void count_neighbor_top_right() {
        Board board = new Board(5,5);
        board.fill(0,3);
        assertEquals(1,board.count_neighbor(1,2));
    }

    @Test
    void count_neighbor_right() {
        Board board = new Board(5,5);
        board.fill(1,3);
        assertEquals(1,board.count_neighbor(1,2));
    }

    @Test
    void count_neighbor_bottom_right() {
        Board board = new Board(5,5);
        board.fill(2,3);
        assertEquals(1,board.count_neighbor(1,2));
    }

    @Test
    void count_neighbor_bottom() {
        Board board = new Board(5,5);
        board.fill(2,2);
        assertEquals(1,board.count_neighbor(1,2));
    }

    @Test
    void count_neighbor_bottom_left() {
        Board board = new Board(5,5);
        board.fill(2,1);
        assertEquals(1,board.count_neighbor(1,2));
    }
}