package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Game;
import com.scaler.tictactoe.models.GameWinningStrategies;
import com.scaler.tictactoe.models.Move;

public class ColumnWinningStrategy implements GameWinningStrategy {

    @Override
    public boolean checkVictory(Board board, Move move) {
        return false;
    }
}
