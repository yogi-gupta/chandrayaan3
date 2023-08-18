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
        switch (direction) {
            case East -> y++;
            case West -> y--;
            case North -> x--;
            case South -> x++;
        }
    }

    public void right() {
        switch (direction) {
            case East -> y--;
            case West -> y++;
            case North -> x++;
            case South -> x--;
        }
    }

    public void rotateLeft() {
        switch (direction) {
            case East, Up -> direction = Direction.North;
            case West, Down -> direction = Direction.South;
            case North -> direction = Direction.West;
            case South -> direction = Direction.East;
        }
    }

    public void rotateRight() {
        switch (direction) {
            case East, Up -> direction = Direction.South;
            case West, Down -> direction = Direction.North;
            case North -> direction = Direction.East;
            case South -> direction = Direction.West;

        }
    }

    public void turnUp() {
        if (direction == Direction.North || direction == Direction.South || direction == Direction.East || direction == Direction.West || direction == Direction.Down) {
            direction = Direction.Up;
        }
    }

    public void turnDown() {
        if (direction == Direction.North || direction == Direction.South  || direction == Direction.East || direction == Direction.West || direction == Direction.Up) {
            direction = Direction.Down;
        }
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
