package org.example;

import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnDownTest {

    @Test
    @DisplayName("SpaceCraft should Turn Down from North Direction")
    void spaceCraftShouldTurnDownFromNorthDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.turnDown(); // Turn down
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Down from South Direction")
    void spaceCraftShouldTurnDownFromSouthDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.turnDown(); // Turn down
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Down from East Direction")
    void spaceCraftShouldTurnDownFromEastDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.turnDown(); // Turn down
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Down from West Direction")
    void spaceCraftShouldTurnDownFromWestDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.turnDown(); // Turn down
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Down from Up Direction")
    void spaceCraftShouldTurnDownFromUpDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.turnDown(); // Turn down
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Down from Down Direction")
    void spaceCraftShouldTurnDownFromDownDirection() {
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.turnDown(); // Turn down
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }
}
