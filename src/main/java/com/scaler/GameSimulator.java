package com.scaler;

import com.scaler.tictactoe.exceptions.InvalidGameConstructionParametersException;
import com.scaler.tictactoe.exceptions.InvalidMoveException;
import com.scaler.tictactoe.exceptions.NoMoveToUndoException;
import com.scaler.tictactoe.models.*;

import java.util.List;
import java.util.Scanner;

public class GameSimulator {
    public static void main(String[] args) throws InvalidGameConstructionParametersException, NoMoveToUndoException, InvalidMoveException {
        Scanner scanner = new Scanner(System.in);

        Game game = Game.getBuilder()
                .setDimension(3)
                .setPlayers(
                        List.of(
                                new HumanPlayer(new Symbol('X'), "Naman"),
                                new HumanPlayer(new Symbol('O'), "Manish")
                        )
                )
                .setGameWinningStrategiesList(
                        List.of(GameWinningStrategies.ORDER_1)
                )
                .build();

        while (game.getGameStatus().equals(GameStatus.IN_PROGRESS)) {
            Player nextPlayer =  game.getPlayers().get(game.getNextTurnPlayerIndex());
            System.out.println("Next Move is of Player " + nextPlayer.getName());

            if (nextPlayer.getPlayerType().equals(PlayerType.HUMAN)) {
                System.out.println("Do you want to undo? Y/N");
            }

            String undoAnswer = scanner.next();

            if (undoAnswer.equals("Y")) {
                game.undo();
                continue;
            }

            game.makeMove();

            game.printBoard();
        }

        if (game.getGameStatus().equals(GameStatus.DRAW)) {
            System.out.println("Game DRAW. No Winner.");
        }

        if (game.getGameStatus().equals(GameStatus.ENDED)) {
            System.out.println("Game has ended. Winner is: " + game.getWinner().getName());
        }

    }
}