package com.jjugul.rummikub.domain;

import com.jjugul.rummikub.exception.IllegalTileNumberException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class TileNumberTest {

    @Test
    void 카드_숫자가_1보다_작으면_에러() {
        assertThrows(IllegalTileNumberException.class, () -> new TileNumber(-1));
    }

    @Test
    void 카드_숫자가_13보다_크면_에러() {
        assertThrows(IllegalTileNumberException.class, () -> new TileNumber(14));
    }
}