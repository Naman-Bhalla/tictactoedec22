package com.scaler.tictactoe.models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(Symbol symbol, String name) {
        super(symbol, name, PlayerType.HUMAN);
        scanner = new Scanner(System.in);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Please tell row number (Starting from 0)");
        int row = scanner.nextInt();

        System.out.printf("Please tell column number (Starting from 0)");
        int col = scanner.nextInt();

        Move move = new Move();
        move.setCol(col);
        move.setRow(row);

        return move;
    }
}
