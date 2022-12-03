package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.GameWinningStrategies;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy getStrategyForEnum(GameWinningStrategies gameWinningStrategies, int dimension) {
        if (gameWinningStrategies.equals(GameWinningStrategies.CORNER)) {
            return new CornerWinningStrategy();
        } else {
            return new OrderOneWinningStrategy(dimension);
        }
    }
}
