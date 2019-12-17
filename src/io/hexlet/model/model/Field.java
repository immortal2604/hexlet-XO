package io.hexlet.model.model;

public class Field {

    private static int FIELD_SIZE = 3;

    private static Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getFieldSize() {

        return FIELD_SIZE;
    }

    public Figure[][] getField() {

        return field;
    }

    public Figure getFigure(Point point){

        return field[point.getX()][point.getY()];
    }

    public void setFigure(Point point, Figure figure){

        field[point.getX()][point.getY()] = figure;
    }
}

