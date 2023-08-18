package org.example;


import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateRightTest {

    @Test
    @DisplayName("SpaceCraft should Rotate Right in West Direction")
    void spaceCraftShouldRotateRightInWestDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.rotateRight(); // RotateRight
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate Right in East Direction")
    void spaceCraftShouldRotateRightInEastDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.rotateRight(); // RotateRight
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate Right in North Direction")
    void spaceCraftShouldRotateRightInNorthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.rotateRight(); // RotateRight
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate Right in South Direction")
    void spaceCraftShouldRotateRightInSouthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.rotateRight(); // RotateRight
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate Right in Up Direction")
    void spaceCraftShouldRotateRightInUpDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.rotateRight(); // RotateRight
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Rotate Right in Down Direction")
    void spaceCraftShouldRotateRightInDownDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.rotateRight(); // RotateRight
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

}
