package org.example;

import org.example.models.Direction;

public class ChandraYaan {
    private int x;
    private int y;
    private int z;
    private
    Direction direction;

    ChandraYaan(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void forward() {
        switch (direction) {
            case East -> x++;
            case West -> x--;
            case North -> y++;
            case South -> y--;
            case Up -> z++;
            case Down -> z--;
        }
    }

    public void backward() {
        switch (direction) {
            case East -> x--;
            case West -> x++;
            case North -> y--;
            case South -> y++;
            case Up ->  z--;
            case Down -> z++;
        }
    }

    public void left() {

    }

    public void right() {

    }

    public void rotateLeft() {

    }

    public void rotateRight() {

    }

    public void turnUp() {

    }

    public void turnDown() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Direction getDirection() {
        return direction;
    }

    public static void main(String[] args) {
        ChandraYaan chandrayaan = new ChandraYaan(0, 0, 0, Direction.North);
        chandrayaan.forward();
        chandrayaan.backward();
        chandrayaan.left();
        chandrayaan.right();
        chandrayaan.rotateLeft();
        chandrayaan.rotateRight();
        chandrayaan.turnUp();
        chandrayaan.turnDown();
        System.out.println(chandrayaan.getX());
        System.out.println((chandrayaan.getY()));
        System.out.println((chandrayaan.getZ()));
    }
}
