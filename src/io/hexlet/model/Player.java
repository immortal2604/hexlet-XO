package io.hexlet.model;

public class Player {

    private final String name;

    private final Figure figure;

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }

    public Player(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }
}
