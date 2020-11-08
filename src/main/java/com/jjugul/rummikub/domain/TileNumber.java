package com.jjugul.rummikub.domain;

import com.jjugul.rummikub.exception.IllegalTileNumberException;

public class TileNumber {
    static final int MINIMUM_TILE_NUMBER = 1;
    static final int MAXIMUM_TILE_NUMBER = 13;

    private int number;

    public TileNumber(int number) {
        checkValidate(number);
        this.number = number;
    }

    private void checkValidate(int number) {
        if (number < MINIMUM_TILE_NUMBER || number > MAXIMUM_TILE_NUMBER) {
            throw new IllegalTileNumberException("카드 숫자가 유효하지 않습니다.");
        }
    }
}
