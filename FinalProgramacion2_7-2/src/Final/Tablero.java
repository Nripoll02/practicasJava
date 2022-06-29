package Final;

import java.util.Scanner;

public class Tablero {
    private String blancas;
    private String negras;
    Scanner input = new Scanner(System.in);

    public String getBlancas() {
        return blancas;
    }

    public void setBlancas(String blancas) {
        this.blancas = blancas;
    }

    public String getNegras() {
        return negras;
    }

    public void setNegras(String negras) {
        this.negras = negras;
    }

    public void iniciar(){
        int x = 0, y = 0 ;
        boolean sigue = true;
        while(sigue == true) {
            try {
                System.out.print("x: ");
                x = input.nextInt();
                System.out.print("Y: ");
                y = input.nextInt();
                if (x < 0 || x > 8 && y < 0 || y > 8) {
                    throw new FueraRango("Fuera de rango ,intente de nuevo");
                    sigue = true;
                }
                else {
                    Ficha movida = new Ficha(x, y);
                }
            } catch (FueraRango e) {
                System.out.println(e.getMessage());
                sigue = false;
            }
        }
    }
    public void mover(int x,int y,Ficha movida){
         int [][] tabla = new int[8][8];

         for (int a = 0; a < 8; a++) {
             for (int b = 0; b < 8; b++) {
                 tabla[a][b] = tabla[x][y];
             }
         }


    }
}


