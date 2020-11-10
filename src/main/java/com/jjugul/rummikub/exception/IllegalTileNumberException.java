package com.jjugul.rummikub.exception;

public class IllegalTileNumberException extends RuntimeException {
    public IllegalTileNumberException() {
        super();
    }

    public IllegalTileNumberException(String message) {
        super(message);
    }
}
