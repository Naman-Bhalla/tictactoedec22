package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;

public interface GameWinningStrategy {

    boolean checkVictory(Board board, Move move);
}
