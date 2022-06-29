
package practicas.febrero.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PracticasFebreroExcepciones {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Lectura de un archivo (.txt)
        
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Nahuel Ripoll\\Documents\\Practica Java\\prueba.txt"));
        String texto;
        while((texto=bf.readLine())!=null){
            System.out.println(texto);
        }
    }
    
}
