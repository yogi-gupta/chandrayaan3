package org.example;


import org.example.models.Direction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftTest {

    @Test
    @DisplayName("SpaceCraft should move left in North Direction")
    void spaceCraftShouldMoveleftInNorthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.left(); // move left
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(-1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move left in South Direction")
    void spaceCraftShouldMoveleftInSouthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.left(); // move left
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move left in East Direction")
    void spaceCraftShouldMoveleftInEastDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.left(); // move left
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move left in West Direction")
    void spaceCraftShouldMoveleftInWestDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.left(); // move left
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(-1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

}
