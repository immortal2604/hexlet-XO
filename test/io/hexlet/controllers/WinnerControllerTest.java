package io.hexlet.controllers;

import io.hexlet.exeptions.AlreadyOccupiedExeption;
import io.hexlet.exeptions.InvalidCoordinatesExeptions;
import io.hexlet.model.Field;
import io.hexlet.model.Figure;
import io.hexlet.model.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class WinnerControllerTest {

    @Test
    public void vinnerFinderLine0() {

        final Field field = new Field();
        final MoveController moveController = new MoveController();
        for(int i = 0; i < field.getFieldSize(); i++){
            try {
                moveController.applyFigure(field, Figure.X, new Point(i,0));
            } catch (InvalidCoordinatesExeptions invalidCoordinatesExeptions) {
                invalidCoordinatesExeptions.printStackTrace();
            } catch (AlreadyOccupiedExeption alreadyOccupiedExeption) {
                alreadyOccupiedExeption.printStackTrace();
            }
        }

        WinnerController winnerController = new WinnerController();
        assertEquals(true, winnerController.winnerFinder(field));
    }
}