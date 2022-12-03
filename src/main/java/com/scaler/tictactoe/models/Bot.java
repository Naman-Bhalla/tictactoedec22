package com.scaler.tictactoe.models;

import com.scaler.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import com.scaler.tictactoe.strategies.botplayingstrategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Symbol symbol, String name, BotDifficultyLevel difficultyLevel) {
        super(symbol, name, PlayerType.BOT);
        this.botDifficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getStrategyForDifficultyLevel(
                difficultyLevel
        );
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Bot is executing the move");
        return botPlayingStrategy.makeMove(board, this);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
