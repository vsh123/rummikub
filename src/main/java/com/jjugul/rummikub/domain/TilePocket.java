package com.jjugul.rummikub.domain;

import static com.jjugul.rummikub.domain.TileNumber.MAXIMUM_TILE_NUMBER;
import static com.jjugul.rummikub.domain.TileNumber.MINIMUM_TILE_NUMBER;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class TilePocket {
    private static final int NORMAL_TILE_SET = 2;
    private static final int EXTEND_TILE_SET = 3;
    private List<Tile> tiles;

    public TilePocket(List<Tile> tiles) {
        this.tiles = tiles;
    }

    public static TilePocket generateNormalTilePack() {
        return new TilePocket(generateTileSet(NORMAL_TILE_SET));
    }

    public static TilePocket generateExtendTilePack() {
        return new TilePocket(generateTileSet(EXTEND_TILE_SET));
    }

    private static List<Tile> generateTileSet(int numberOfTileSet) {
        return IntStream.range(0, numberOfTileSet)
            .mapToObj(i -> Arrays.stream(TileColor.values())
                .map(TilePocket::generateColorTiles)
                .collect(toList()))
            .flatMap(Collection::stream)
            .flatMap(Collection::stream)
            .collect(toList());
    }

    private static List<Tile> generateColorTiles(TileColor color) {
        return IntStream.rangeClosed(MINIMUM_TILE_NUMBER, MAXIMUM_TILE_NUMBER)
            .mapToObj(number -> new Tile(color, number))
            .collect(toList());
    }

    public List<Tile> getTiles() {
        return tiles;
    }
}
