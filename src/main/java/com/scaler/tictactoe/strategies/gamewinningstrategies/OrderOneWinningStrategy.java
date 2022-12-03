package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;
import com.scaler.tictactoe.models.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneWinningStrategy implements GameWinningStrategy {
    private List<Map<Symbol, Integer>> rowMap;
    private List<Map<Symbol, Integer>> colMap;
    private Map<Symbol, Integer> leftDiagMap;
    private Map<Symbol, Integer> rightDiagMap;

    public OrderOneWinningStrategy(int dimension) {
        rowMap = new ArrayList<>();
        colMap = new ArrayList<>();

        for (int i = 0; i < dimension; ++i) {
            rowMap.add(new HashMap<>());
            colMap.add(new HashMap<>());
        }

        leftDiagMap = new HashMap<>();
        rightDiagMap = new HashMap<>();
    }
    @Override
    public boolean checkVictory(Board board, Move move) {
        int i = move.getRow();
        int j = move.getCol();
        Symbol symbol = move.getCell().getPlayer().getSymbol();

        rowMap.get(i).put(symbol,
                1 + rowMap.get(i).getOrDefault(symbol, 0)
        );

        colMap.get(j).put(symbol,
                1 + colMap.get(j).getOrDefault(symbol, 0)
        );

        if (i == j) {
            leftDiagMap.put(symbol, 1 + leftDiagMap.getOrDefault(symbol, 0));
        }

        if (i + j == board.getDimension() - 1) {
            rightDiagMap.put(symbol, 1 + rightDiagMap.getOrDefault(symbol, 0));
        }

        if (rowMap.get(i).get(symbol) == board.getDimension()) return true;

        if (colMap.get(j).get(symbol) == board.getDimension()) return true;

        if (i == j && leftDiagMap.get(symbol) == board.getDimension()) return true;

        if (i + j == board.getDimension() - 1 && rightDiagMap.get(symbol) == board.getDimension()) return true;

        return false;
    }
}
