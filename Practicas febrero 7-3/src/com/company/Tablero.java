package com.company;

import java.util.Scanner;

public class Tablero {
    Ficha ficha;
    public int x = 0, y =0;


    public void Iniciar() {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<2; i++){

            System.out.println("Turno jugador"+ (i+1));
            System.out.println("Ingrese coordenada X a la que quiera moverse");
            x = scanner.nextInt();

            System.out.println("Ingrese coordenada Y a la que quiera moverse");
            y = scanner.nextInt();

        }




    }


}

