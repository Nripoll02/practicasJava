package supermercado;

import java.util.Scanner;

public class Bebidas extends Producto {

    private float litros;
    private Scanner read = new Scanner(System.in);

    public Bebidas(float litros, long codigo, int precio, boolean salida) {
        super(codigo, precio, salida);
        this.litros = litros;
    }   

    @Override
    public void producto() {
        int contador = 1500;
        int salir;
        do{
            
            System.out.println("Cantidad de bebidas: "+contador);
            System.out.println("Ingrese codigo");
            codigo = read.nextLong();
            
            
            if(codigo == 113207){
                System.out.println("Coca-Cola");
                contador--;
                System.out.flush();
            }
            if(codigo == 113410){ 
                System.out.println("Pepsi");
                contador--;
                System.out.flush();
            }
            if(codigo == 113215){
                System.out.println("Agua");
                contador--;
                System.out.flush();
            }
            if (codigo != 113215 && codigo != 113410 && codigo != 113207){
                System.out.println("se equivoco de codigo");
            }
            System.out.println("Terminar[1] o Continuar [2]");
            salir = read.nextInt();
            if (salir == 1){
                salida = true;
            }
            

            
        }while(contador != 0 || salida != true);
        
        
    }
}