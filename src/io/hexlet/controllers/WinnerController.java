package io.hexlet.controllers;

import io.hexlet.model.Field;
import io.hexlet.model.Point;

public class WinnerController {

    public boolean winnerFinder(final Field field){

        if(pilar(field) || line(field) || diag(field) || obrDiag(field)){
            return true;
        }
        return false;
    }

    private boolean pilar(final Field field){
        int count = 0;
        for(int i = 0; i < field.getFieldSize(); i++){
            for(int j = 0; j < field.getFieldSize() - 1; j++){
                if(!(field.getFigure(new Point(i, j)) == field.getFigure(new Point(i,j + 1)))){
                    break;
                }
                count ++;
            }
        }
        if(count == field.getFieldSize()){
            return true;
        }
        return false;
    }

    private boolean line(final Field field){
        int count = 0;
        for(int j = 0; j < field.getFieldSize(); j++){
            for(int i = 0; i < field.getFieldSize() - 1; i++){
                if(!(field.getFigure(new Point(i, j)) == field.getFigure(new Point(i + 1,j)))){
                    break;
                }
                count ++;
            }
        }
        if(count == field.getFieldSize()){
            return true;
        }
        return false;
    }

    private boolean diag(final Field field){
        int count = 0;
        for(int i = 0; i < field.getFieldSize() - 1; i++){
                if(!(field.getFigure(new Point(i,i)) == field.getFigure(new Point(i + 1,i + 1)))){
                    break;
                }
                count ++;
        }
        if(count == field.getFieldSize()){
            return true;
        }
        return false;
    }

    private boolean obrDiag(final Field field){
        int count = 0;
        int j = 0;
        for(int i = field.getFieldSize() - 1; i < 0; i--){
            if(!(field.getFigure(new Point(i,j)) == field.getFigure(new Point(i - 1, j + 1)))){
                break;
            }
            count ++;
            j ++;
        }
        if(count == field.getFieldSize()){
            return true;
        }
        return false;
    }
}
