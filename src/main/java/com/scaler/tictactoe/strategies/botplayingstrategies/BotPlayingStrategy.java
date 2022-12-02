package com.scaler.tictactoe.strategies.botplayingstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;
import com.scaler.tictactoe.models.Player;

public interface BotPlayingStrategy {

    Move makeMove(Board board, Player player);
}
