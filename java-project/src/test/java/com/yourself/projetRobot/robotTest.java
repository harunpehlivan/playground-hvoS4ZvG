package com.yourself.projetRobot;

import com.yourself.exoPart1.exo1_5;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class robotTest {

    @Test
    public void testMonde() throws FileNotFoundException {
        try {
            Orientation initialOrientation = Orientation.NORTH;
            Orientation expectedOrientation = Orientation.NORTH;

            GridPosition initialGridPosition = new GridPosition(0, 0);
            GridPosition  expectedGridPosition = new GridPosition(0, 0);
            Robot robot = new Robot(initialGridPosition, initialOrientation);

            Assert.assertEquals( initialOrientation,robot.getOrientation());
            Assert.assertEquals( initialGridPosition,robot.getGridPosition());





           {
                initialGridPosition = new GridPosition(-1, -1);
                initialOrientation = Orientation.SOUTH;
                robot = new Robot(initialGridPosition, initialOrientation);

                Assert.assertEquals(robot.getOrientation(), initialOrientation);
                Assert.assertEquals(robot.getGridPosition(), initialGridPosition);
            }


            {
                initialGridPosition = new GridPosition(0, 0);
                robot = new Robot(initialGridPosition, Orientation.NORTH);

                robot.turnRight();

                Assert.assertEquals(robot.getGridPosition(), initialGridPosition);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

                robot.turnRight();

                expectedOrientation = Orientation.EAST;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.EAST);

                robot.turnRight();

                expectedOrientation = Orientation.SOUTH;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.SOUTH);

                robot.turnRight();

                expectedOrientation = Orientation.WEST;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.WEST);

                robot.turnRight();

                expectedOrientation = Orientation.NORTH;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                initialGridPosition = new GridPosition(0, 0);
                robot = new Robot(initialGridPosition, Orientation.NORTH);

                robot.turnLeft();

                Assert.assertEquals(robot.getGridPosition(), initialGridPosition);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

                robot.turnLeft();

                expectedOrientation = Orientation.WEST;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.WEST);

                robot.turnLeft();

                expectedOrientation = Orientation.SOUTH;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.SOUTH);

                robot.turnLeft();

                expectedOrientation = Orientation.EAST;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.EAST);

                robot.turnLeft();

                expectedOrientation = Orientation.NORTH;

                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                initialOrientation = Orientation.NORTH;
                robot = new Robot(new GridPosition(0, 0), initialOrientation);

                robot.advance();

                Assert.assertEquals(robot.getOrientation(), initialOrientation);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

                robot.advance();

                expectedGridPosition = new GridPosition(0, 1);

                Assert.assertEquals(robot.getGridPosition(), expectedGridPosition);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.SOUTH);

                robot.advance();

                expectedGridPosition = new GridPosition(0, -1);

                Assert.assertEquals(robot.getGridPosition(), expectedGridPosition);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.EAST);

                robot.advance();

                expectedGridPosition = new GridPosition(1, 0);

                Assert.assertEquals(robot.getGridPosition(), expectedGridPosition);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.WEST);

                robot.advance();

                expectedGridPosition = new GridPosition(-1, 0);

                Assert.assertEquals(robot.getGridPosition(), expectedGridPosition);
            }


            {
                robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

                robot.simulate("LAAARALA");

                expectedGridPosition = new GridPosition(-4, 1);
                expectedOrientation = Orientation.WEST;

                Assert.assertEquals(robot.getGridPosition(), expectedGridPosition);
                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(2, -7), Orientation.EAST);

                robot.simulate("RRAAAAALA");

                expectedGridPosition = new GridPosition(-3, -8);
                expectedOrientation = Orientation.SOUTH;

                Assert.assertEquals(robot.getGridPosition(), expectedGridPosition);
                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }


            {
                robot = new Robot(new GridPosition(8, 4), Orientation.SOUTH);

                robot.simulate("LAAARRRALLLL");

                expectedGridPosition = new GridPosition(11, 5);
                expectedOrientation = Orientation.NORTH;

                Assert.assertEquals(robot.getGridPosition(), expectedGridPosition);
                Assert.assertEquals(robot.getOrientation(), expectedOrientation);
            }






        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
           // msg("Hint 💡", " 🤔");
        }
    }

    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

    // check if a string exists in a text file
    private static boolean existsInFile(String str, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        try {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(str))
                    return true;
            }
            return false;
        } finally {
            scanner.close();
        }
    }
}
