package org.example;

import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnUpTest {
    @Test
    @DisplayName("SpaceCraft should Turn Up from North Direction")
    void spaceCraftShouldTurnUpFromNorthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.turnUp(); // Turn up
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Up from South Direction")
    void spaceCraftShouldTurnUpFromSouthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.turnUp(); // Turn up
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Up from East Direction")
    void spaceCraftShouldTurnUpFromEastDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.turnUp(); // Turn up
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Up from West Direction")
    void spaceCraftShouldTurnUpFromWestDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.turnUp(); // Turn up
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Up from Down Direction")
    void spaceCraftShouldTurnUpFromDownDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.turnUp(); // Turn up
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should Turn Up from up Direction")
    void spaceCraftShouldTurnUpFromUpDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.turnUp(); // Turn up
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

}
