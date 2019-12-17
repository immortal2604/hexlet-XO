package io.hexlet.model.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void getFieldSize() {

    }

    @Test
    public void getField() {

    }

    @Test
    public void getFigure() {
        final Point point = new Point(0,0);
        final Field field = new Field();
        final Figure inputFigure = Figure.X;
        final Figure expectedFigure = inputFigure;
        field.setFigure(point,inputFigure);
        final Figure actualFigure = field.getFigure(point);

        assertEquals(expectedFigure, actualFigure);
    }

    @Test
    public void setFigure() {
        final Point point = new Point(2,0);
        final Field field = new Field();
        final Figure inputFigure = Figure.X;
        final Figure expectedFigure = inputFigure;
        field.setFigure(point,inputFigure);
        final Figure actualFigure = field.getFigure(point);

        assertEquals(expectedFigure, actualFigure);
    }
}