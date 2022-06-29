package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FueraTablero {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador 1. Elija color");
        System.out.println("(1) blanco");
        System.out.println("(2) negro");
        int opcion = sc.nextInt();
        if (opcion == 1){
            Ficha ficha1 = new Ficha(0,10);
            Ficha ficha2 = new Ficha(0,10);

            Tablero tabla = new Tablero();
            tabla.Iniciar();

            Ficha ficha = new Ficha(0,0);
            ficha.Mover();


        }






    }
}
