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
public class Lampara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Foco mifoco=new Foco(25,"Bajo Consumo");
        Foco delauto=new Foco(50,"Vehicular");
        Foco led=new Foco();
        Foco cocina=new Foco("Halogeno");
        
        mifoco.Mostrar();
        led.Leer();
        
        led.Mostrar();
        
        
        
        
        
    }
    
}
