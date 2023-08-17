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

    @Test
    @DisplayName("SpaceCraft should move forward in North Direction")
    void spaceCraftShouldMoveForwardInNorthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.forward(); // move forward
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in South Direction")
    void spaceCraftShouldMoveForwardInSouthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.forward(); // move forward
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(-1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in East Direction")
    void spaceCraftShouldMoveForwardInEastDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.forward(); // move forward
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }


    @Test
    @DisplayName("SpaceCraft should move forward in West Direction")
    void spaceCraftShouldMoveForwardInWestDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.forward(); // move forward
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(-1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in Up Direction")
    void spaceCraftShouldMoveForwardInUpDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.forward(); // move forward
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(1, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move forward in Down Direction")
    void spaceCraftShouldMoveForwardInDownDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.forward(); // move forward
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(-1, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in North Direction")
    void spaceCraftShouldMoveBackwardInNorthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.North);
        yaan.backward(); // move backward
        assertEquals(Direction.North, yaan.getDirection());
        assertEquals(-1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in South Direction")
    void spaceCraftShouldMoveBackwardInSouthDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.South);
        yaan.backward(); // move backward
        assertEquals(Direction.South, yaan.getDirection());
        assertEquals(1, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in East Direction")
    void spaceCraftShouldMoveBackwardInEastDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.East);
        yaan.backward(); // move Backward
        assertEquals(Direction.East, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(-1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in West Direction")
    void spaceCraftShouldMoveBackwardInWestDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.West);
        yaan.backward(); // move backward
        assertEquals(Direction.West, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(1, yaan.getX());
        assertEquals(0, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in Up Direction")
    void spaceCraftShouldMoveBackwardInUpDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Up);
        yaan.backward(); // move backward
        assertEquals(Direction.Up, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(-1, yaan.getZ());
    }

    @Test
    @DisplayName("SpaceCraft should move Backward in Down Direction")
    void spaceCraftShouldMoveBackwardInDownDirection(){
        ChandraYaan yaan = new ChandraYaan(0, 0, 0, Direction.Down);
        yaan.backward(); // move backward
        assertEquals(Direction.Down, yaan.getDirection());
        assertEquals(0, yaan.getY());
        assertEquals(0, yaan.getX());
        assertEquals(1, yaan.getZ());
    }

}
