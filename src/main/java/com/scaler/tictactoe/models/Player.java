package com.scaler.tictactoe.models;

public abstract class Player {
    private Symbol symbol;
    private String name;
    private PlayerType playerType;

    public Player(Symbol symbol, String name, PlayerType playerType) {
        this.playerType = playerType;
        this.name = name;
        this.symbol = symbol;
    }

    public abstract Move makeMove(Board board);

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
