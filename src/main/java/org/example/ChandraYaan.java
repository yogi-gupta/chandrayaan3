package org.example;

import org.example.models.Direction;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChandraYaan {
    private int x;
    private int y;
    private int z;
    private
    Direction direction;

    ChandraYaan() {

    }

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
            case Up -> z--;
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
        Set<Direction> allowedDirection = new HashSet<>(
                Set.of(
                        Direction.North, Direction.South, Direction.East, Direction.West, Direction.Down
                )
        );
        if (allowedDirection.contains(direction)) {
            direction = Direction.Up;
        }
    }

    public void turnDown() {
        Set<Direction> allowedDirection = new HashSet<>(
                Set.of(
                        Direction.North, Direction.South, Direction.East, Direction.West, Direction.Up
                )
        );
        if (allowedDirection.contains(direction)) {
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

    private Direction parseDirection() {
        Scanner scanner = new Scanner(System.in);
        Direction selectedDirection = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a direction: ");

            String inputDirection = scanner.nextLine();

            switch (inputDirection.toLowerCase()) {
                case "north" -> {
                    selectedDirection = Direction.North;
                    validInput = true;
                }
                case "south" -> {
                    selectedDirection = Direction.South;
                    validInput = true;
                }
                case "east" -> {
                    selectedDirection = Direction.East;
                    validInput = true;
                }
                case "west" -> {
                    selectedDirection = Direction.West;
                    validInput = true;
                }
                case "up" -> {
                    selectedDirection = Direction.Up;
                    validInput = true;
                }
                case "down" -> {
                    selectedDirection = Direction.Down;
                    validInput = true;
                }
                default -> System.out.println("Invalid direction entered. Please try again.");
            }

        }
        return selectedDirection;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Directions: North, South, East, West, Up, Down");
        ChandraYaan obj = new ChandraYaan();
        Direction selectedDirection = obj.parseDirection();

        System.out.println("Selected direction: " + selectedDirection);

        System.out.println("Enter the value of x: ");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the value of y: ");
        int y = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the value of z: ");
        int z = Integer.parseInt(scanner.nextLine());

        ChandraYaan chandrayaan = new ChandraYaan(x, y, z, selectedDirection);

        System.out.println("Enter commands (f-Forward, b-Backward, l-RotateLeft, r-RotateRight, u-TurnUP, r-TurnDown, e - Exit)");

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter character (e to exit):");
            String input = scanner.nextLine();
            char cmd = input.charAt(0);
            switch (cmd) {
                case 'f' -> chandrayaan.forward();
                case 'b' -> chandrayaan.backward();
                case 'r' -> chandrayaan.rotateRight();
                case 'l' -> chandrayaan.rotateLeft();
                case 'u' -> chandrayaan.turnUp();
                case 'd' -> chandrayaan.turnDown();
                case 'e' -> exit = true;
            }
            System.out.println(
                    "State: ( " + chandrayaan.getX() + ", " + chandrayaan.getY() + ", " + chandrayaan.getZ() +
                            ") & Direction = " + chandrayaan.getDirection());

        }
    }
}
