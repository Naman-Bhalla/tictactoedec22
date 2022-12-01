package com.scaler.tictactoe.models;

import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
