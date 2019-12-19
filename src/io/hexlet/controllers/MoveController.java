package io.hexlet.controllers;


import io.hexlet.exeptions.AlreadyOccupiedExeption;
import io.hexlet.exeptions.InvalidCoordinatesExeptions;
import io.hexlet.model.Field;
import io.hexlet.model.Figure;
import io.hexlet.model.Point;

public class MoveController {

    public void applyFigure(final Field field,
                            final Figure figure,
                            final Point point) throws InvalidCoordinatesExeptions, AlreadyOccupiedExeption {

        if(!coordinatesCheck(field, point)){

            throw new InvalidCoordinatesExeptions();
        }

        if(field.getFigure(point) != null){

            throw new AlreadyOccupiedExeption();
        }

        field.setFigure(point, figure);
    }

    private boolean coordinatesCheck(final Field field, final Point point){

        return point.getX() >= 0 && point.getX() <= field.getFieldSize() && point.getY() >= 0 && point.getY() <= field.getFieldSize();
    }
}
