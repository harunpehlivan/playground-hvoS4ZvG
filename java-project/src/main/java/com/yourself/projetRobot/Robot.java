package com.yourself.projetRobot;

public class Robot {
    private Orientation orientation;
    private GridPosition gridPosition;

    public Robot(GridPosition initialGridPosition, Orientation initialOrientation) {
        this.orientation = initialOrientation;
        this.gridPosition = initialGridPosition;


    }

    public Orientation getOrientation() {
        return orientation;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public void turnRight() {

        if (this.orientation == Orientation.NORTH)
        {this.orientation = Orientation.EAST;return;}

        if (this.orientation == Orientation.EAST)
        {this.orientation = Orientation.SOUTH;return;}

        if (this.orientation == Orientation.SOUTH)
        {this.orientation = Orientation.WEST;return;}

        if (this.orientation == Orientation.WEST)
        {this.orientation = Orientation.NORTH;return;}

    }

    public void turnLeft() {
        int num = this.orientation.ordinal();
        num = num - 1 ;
        if (num == -1 ) num = Orientation.values().length-1;
        this.orientation = Orientation.values()[num];

    }

    public void advance() {
        int matDeplacement [][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int posCardinal = this.orientation.ordinal();
        this.gridPosition.x = this.gridPosition.x
                + matDeplacement[posCardinal][0];
        this.gridPosition.y = this.gridPosition.y
                + matDeplacement[posCardinal][1];


    }

    public void simulate(String path) {
        for (char cmde:
                path.toCharArray()) {
            switch (cmde){
                case 'L':
                    this.turnLeft();
                    break;
                case 'R':
                    this.turnRight();
                    break;
                case 'A':
                    this.advance();
                    break;
            }


        }

    }
}