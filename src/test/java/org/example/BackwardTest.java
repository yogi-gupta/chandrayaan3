package org.example;

import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackwardTest {
    @Test
    @DisplayName("SpaceCraft should move Backward in North Direction")
    void spaceCraftShouldMoveBackwardInNorthDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.backward(); // move backward
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(-1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in South Direction")
    void spaceCraftShouldMoveBackwardInSouthDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.backward(); // move backward
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in East Direction")
    void spaceCraftShouldMoveBackwardInEastDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.backward(); // move Backward
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(-1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in West Direction")
    void spaceCraftShouldMoveBackwardInWestDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.backward(); // move backward
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in Up Direction")
    void spaceCraftShouldMoveBackwardInUpDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.backward(); // move backward
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(-1, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in Down Direction")
    void spaceCraftShouldMoveBackwardInDownDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.backward(); // move backward
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(1, yaan.getZ());
    }

}
