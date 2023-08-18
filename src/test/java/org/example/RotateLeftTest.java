package org.example;

import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateLeftTest {

    @Test
    @DisplayName("SpaceCraft should Rotate left in North Direction")
    void spaceCraftShouldRotateLeftInNorthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.rotateLeft(); // RotateLeft
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate left in South Direction")
    void spaceCraftShouldRotateLeftInSouthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.rotateLeft(); // RotateLeft
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate left in East Direction")
    void spaceCraftShouldRotateLeftInEastDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.rotateLeft(); // RotateLeft
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate left in West Direction")
    void spaceCraftShouldRotateLeftInWestDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.rotateLeft(); // RotateLeft
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate left in Up Direction")
    void spaceCraftShouldRotateLeftInUpDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.rotateLeft(); // RotateLeft
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate left in Down Direction")
    void spaceCraftShouldRotateLeftInDownDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.rotateLeft(); // RotateLeft
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }
}
