
package tp1.ej1;

import java.util.Scanner;

public class TP1EJ1 {

   
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int opcion;
        float resultado = 0;

        float valorUno = 0;
        float valorDos = 0;
                
        Calculadora miCalculadora = new Calculadora(valorUno, valorDos);
        
        
        System.out.println("BIENVENIDOS A LA CALCULADORA");
        System.out.println("POR FAVOR, INGRESE SU NOMBRE: ");
        String nombre = sc.nextLine();
        
        System.out.println("Bienvenido "+nombre);
        
        System.out.println("Ahora por favor ingrese el primer numero que desee utilizar: ");
        valorUno = sc.nextInt();
        
        System.out.println("Ahora ingrese el segundo: ");
        valorDos = sc.nextInt();
        
        
        System.out.println("Y por último elija la operacion que desea realizar: ");
        System.out.println(" 1)SUMA\n " + "2)RESTA\n " + "3)MULTIPLICACION\n " + "4)DIVISION\n");
        
        opcion = sc.nextInt();
        
        switch (opcion){
            
            case 1: 
               resultado = new Calculadora(valorUno, valorDos).sumar();
                System.out.println("El resultado es: "+resultado);
                System.out.println("Alumno: "+nombre);

                break;
            
            case 2: 
               resultado = new Calculadora(valorUno, valorDos).restar();
                System.out.println("El resultado es: "+resultado);
                System.out.println("Alumno: "+nombre);
                break;
                
            case 3: 
                resultado = new Calculadora(valorUno, valorDos).producto();
                System.out.println("El resultado es: "+resultado); 
                System.out.println("Alumno: "+nombre);
                break;
            
            case 4:
               resultado = new Calculadora(valorUno, valorDos).div();
                System.out.println("El resultado es: "+resultado);
                System.out.println("Alumno: "+nombre);
                break;
                
            default: 
                break;
            
     
        }
        
        
        
        
        
        
        
    }
    
}
