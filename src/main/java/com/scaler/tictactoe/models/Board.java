package com.scaler.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new ArrayList<>();

        for (int i = 0; i < dimension; ++i) {
            this.board.add(new ArrayList<>());
            for (int j = 0; j < dimension; ++j) {
                this.board.get(i).add(new Cell());
            }
        }
    }
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

    public void printBoard() {
        for (int i = 0; i < dimension; ++i) {
            for (int j = 0; j < dimension; ++j) {
                Player playerAtCell = board.get(i).get(j).getPlayer();

                if (playerAtCell == null) {
                    System.out.printf(" | - | ");
                } else {
                    System.out.printf(" | " + board.get(i).get(j).getPlayer().getSymbol().getCharacter() + " | ");
                }
            }
            System.out.printf("\n");
        }
    }
}
