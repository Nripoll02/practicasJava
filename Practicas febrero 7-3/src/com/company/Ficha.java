package com.company;

public class Ficha {
    public int coordX, coordY;
    Tablero tablero = new Tablero();



    public Ficha(int coordX, int coordY) {
        this.coordX = tablero.x;
        this.coordY = tablero.y;

    }

    public void Mover()throws FueraTablero{


        if ( tablero.x < 0 || tablero.x > 10 || tablero.y < 0 || tablero.y > 10){
            throw new FueraTablero("Error, las coordenadas están fuera del tablero");
        }
        else {
            System.out.println("La ficha se movio a la coordenada en X "+ coordX);
            System.out.println( "Y a la coordenada en Y "+ coordY);
        }


    }


}

