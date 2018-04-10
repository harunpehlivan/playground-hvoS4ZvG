package com.yourself.projetRobot;


public class GridPosition {
    int x;
    int y;
    public GridPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object other){
        GridPosition oth =
                (GridPosition)other;
        return ((oth.x == this.x)&&
                (this.y == oth.y));
    }
}
