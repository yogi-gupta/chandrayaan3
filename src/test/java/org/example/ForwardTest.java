package org.example;

import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForwardTest {

    @Test
    @DisplayName("SpaceCraft should move forward in North Direction")
    void spaceCraftShouldMoveForwardInNorthDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.forward(); // move forward
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in South Direction")
    void spaceCraftShouldMoveForwardInSouthDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.forward(); // move forward
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(-1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in East Direction")
    void spaceCraftShouldMoveForwardInEastDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.forward(); // move forward
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }


    @Test
    @DisplayName("SpaceCraft should move forward in West Direction")
    void spaceCraftShouldMoveForwardInWestDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.forward(); // move forward
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(-1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in Up Direction")
    void spaceCraftShouldMoveForwardInUpDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.forward(); // move forward
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(1, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in Down Direction")
    void spaceCraftShouldMoveForwardInDownDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.forward(); // move forward
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(-1, yaan.getZ());
    }
}
