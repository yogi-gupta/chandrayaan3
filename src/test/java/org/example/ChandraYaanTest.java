package org.example;

import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChandraYaanTest {

    @Test
    @DisplayName("Getter X")
    void itShouldReturnGetX() {
        ChandraYaan yaan = new ChandraYaan(1, 2, 3, Direction.Down);
        assertEquals(1, yaan.getX());
    }

    @Test
    @DisplayName("Getter Y")
    void itShouldReturnGetY() {
        ChandraYaan yaan = new ChandraYaan(1, 2, 3, Direction.Down);
        assertEquals(2, yaan.getY());
    }

    @Test
    @DisplayName("Getter Z")
    void itShouldReturnGetZ() {
        ChandraYaan yaan = new ChandraYaan(1, 2, 3, Direction.Down);
        assertEquals(3, yaan.getZ());
    }

    @Test
    @DisplayName("Getter Direction")
    void itShouldReturnGetDirection() {
        ChandraYaan yaan = new ChandraYaan(1, 2, 3, Direction.Down);
        assertEquals(Direction.Down, yaan.getDirection());
    }

}
