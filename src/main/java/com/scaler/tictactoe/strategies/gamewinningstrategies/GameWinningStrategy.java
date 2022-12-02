package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.Board;

public interface GameWinningStrategy {

    boolean checkVictory(Board board);
}
