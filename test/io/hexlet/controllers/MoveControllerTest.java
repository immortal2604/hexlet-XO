package io.hexlet.controllers;

import io.hexlet.exeptions.AlreadyOccupiedExeption;
import io.hexlet.exeptions.InvalidCoordinatesExeptions;
import io.hexlet.model.Field;
import io.hexlet.model.Figure;
import io.hexlet.model.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveControllerTest {

    @Test
    public void applyFigurePerfectSituation() {
        final Field field = new Field();
        final Figure figure = Figure.X;
        final Point point = new Point(0,2);
        final MoveController moveController = new MoveController();
        try {
            moveController.applyFigure(field, figure, point);
        } catch (InvalidCoordinatesExeptions e) {
            e.printStackTrace();
        } catch (AlreadyOccupiedExeption e) {
            e.printStackTrace();
        }
    }

    @Test
    public void applyFigureOccupedField() {
        final Field field = new Field();
        final Figure figure = Figure.X;
        final Point point = new Point(0,2);
        field.setFigure(point,figure);

        final MoveController moveController = new MoveController();
        try {
            moveController.applyFigure(field, figure, point);
        } catch (InvalidCoordinatesExeptions e) {
            e.printStackTrace();
        } catch (AlreadyOccupiedExeption e) {
            e.printStackTrace();
        }
    }

    @Test
    public void applyFigureInvalidXcoordinate() {
        final Field field = new Field();
        final Figure figure = Figure.X;
        final Point point = new Point(3,2);

        final MoveController moveController = new MoveController();
        try {
            moveController.applyFigure(field, figure, point);
        } catch (InvalidCoordinatesExeptions e) {
            e.printStackTrace();
        }
    }

    @Test
    public void applyFigureInvalidYcoordinate() {
        final Field field = new Field();
        final Figure figure = Figure.X;
        final Point point = new Point(2,3);

        final MoveController moveController = new MoveController();
        try {
            moveController.applyFigure(field, figure, point);
        } catch (InvalidCoordinatesExeptions e) {
            e.printStackTrace();
        }
    }
}