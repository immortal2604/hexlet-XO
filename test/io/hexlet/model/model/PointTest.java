package io.hexlet.model.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void getX() {
        final int inputCoordX = 1;
        final int inputCoordY = 1;
        final int expectedCoordX = inputCoordX;
        final int expectedCoordY = inputCoordY;

        final Point point = new Point(inputCoordX,inputCoordY);

        assertEquals(expectedCoordX, point.getX());
    }

    @Test
    public void getY() {
        final int inputCoordX = 1;
        final int inputCoordY = 1;
        final int expectedCoordX = inputCoordX;
        final int expectedCoordY = inputCoordY;

        final Point point = new Point(inputCoordX,inputCoordY);

        assertEquals(expectedCoordY, point.getY());
    }
}