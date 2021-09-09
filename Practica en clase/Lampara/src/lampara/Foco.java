/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampara;

/**
 *
 * @author Pablo
 */
import java.util.Scanner;//importar el paquete scanner

public class Foco {
    //atributos o variables de instancia
    private int potencia;
    private String tipo;

    public Foco(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public Foco(String tipo) {
        this.tipo = tipo;
    }

    public Foco() {
    }
    
    public void Mostrar(){
        
        System.out.println("La potencia es "+this.potencia);
        System.out.println("El tipo de foco es "+this.tipo);
        
    }
    public void Leer(){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Ingrese un valor de la potencia");
        this.potencia=in.nextInt();
        in.next();
        
        System.out.println("Ingrese el tipo de lampara");
        this.tipo=in.nextLine();
        
        
    }
    
    
    
}
