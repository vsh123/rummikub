package com.jjugul.rummikub.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TilePocketTest {

    @Test
    void 기본_게임은_색깔_타일이_104개이다() {
        TilePocket tilePocket = TilePocket.generateNormalTilePack();

        assertEquals(104, tilePocket.getTiles().size());
    }

    @Test
    void 확장_게임은_색깔_타일이_156개이다() {
        TilePocket tilePocket = TilePocket.generateExtendTilePack();

        assertEquals(156, tilePocket.getTiles().size());
    }
}