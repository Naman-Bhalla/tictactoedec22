package com.scaler.tictactoe.exceptions;

public class InvalidGameConstructionParametersException extends Exception{

    public InvalidGameConstructionParametersException() {
        super("Game being created by invalid parameters");
    }
}
