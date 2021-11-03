package supermercado;

import java.util.Scanner;

public class Alimento extends Producto{
    
    private String tipo; 
    private Scanner read = new Scanner(System.in);

    public Alimento(String tipo, long codigo, int precio, boolean salida) {
        super(codigo, precio, salida);
        this.tipo = tipo;
    }

    

    

   
 
    @Override
    public void producto() {
        int contador = 500;
        int salir;
        do{
            
            System.out.println("Ingrese codigo");
            codigo = (int) read.nextLong();
            
            if(codigo == 8827){
                tipo = "Salado";
                System.out.println("Fideos"+tipo);
                contador--;
            }
            if(codigo == 8845){ 
                tipo = "Salado";
                System.out.println("Milanesa"+tipo);
                contador--;
            }
            if(codigo == 8863){
                tipo = "Dulce";
                System.out.println("Helado"+tipo);
                contador--;
            }
            System.out.println("Terminar[1] o Continuar [2]");
            salir = read.nextInt();
            if (salir == 1){
                salida = true;
            }
            
            
        }while(contador != 0 || salida != true);
        
        System.out.flush();
    }  
    
    
}