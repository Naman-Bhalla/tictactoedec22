package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;

public class RowWinningStrategy implements GameWinningStrategy {

    @Override
    public boolean checkVictory(Board board, Move move) {
        return false;
    }
}
