
package practicafinal.pkg7.pkg3;

import java.util.Scanner;
import java.util.Stack;


public class Pila {
    Scanner sc = new Scanner(System.in);
    public Stack<Inscripto> Datos = new Stack<>();
    Inscripto inscripto = new Inscripto();
    public String nameStack;
    public long dniStack;


    
    
    
    public void IngresarDatos(){
        
    
        for(int i=0; i<3; i++){
           System.out.println("Ingrese apellido");
           nameStack = sc.nextLine();
           
           System.out.println("Ingrese dni");
           dniStack = sc.nextInt();
           
           Datos.add(new Inscripto(dniStack, nameStack));
           

      }
    
    }   
    
    public void Mostrar() throws Vacio{
        if(Datos.empty()== true){
            throw new Vacio("La lista esta vacia");
        }else{
            Datos.size();
            System.out.println(
                    "Dni: " +(Datos.get(0).getDni())+ "Apellido: " + Datos.get(0).getApellido());
        }
    }
    
}
