package com.jjugul.rummikub.domain;

public class Tile {
    private TileColor color;
    private TileNumber tileNumber;

    public Tile(TileColor color, int number) {
        this.color = color;
        this.tileNumber = new TileNumber(number);
    }
}
