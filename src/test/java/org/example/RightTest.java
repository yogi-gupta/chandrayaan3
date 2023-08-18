package org.example;

import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightTest {

    @Test
    @DisplayName("SpaceCraft should move right in North Direction")
    void spaceCraftShouldMoveRightInNorthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.right(); // move right
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move right in South Direction")
    void spaceCraftShouldMoveRightInSouthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.right(); // move right
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(-1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move right in West Direction")
    void spaceCraftShouldMoveRightInWestDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.right(); // move right
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move right in East Direction")
    void spaceCraftShouldMoveRightInEastDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.right(); // move right
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(-1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

}
