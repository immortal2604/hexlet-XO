package io.hexlet.model.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void getName() {
        final String inputValue = "Frenk";
        final String expectedValue = inputValue;
        final Player player = new Player("Frenk", Figure.X);
        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void getFigure() {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;
        final Player player = new Player("Frenk", Figure.X);
        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }
}