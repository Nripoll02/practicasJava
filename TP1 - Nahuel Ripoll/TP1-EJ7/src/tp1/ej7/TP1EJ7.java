
package tp1.ej7;
import java.util.ArrayList;
import java.util.Scanner;


public class TP1EJ7 {

    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Inmueble> listaInmuebles = new ArrayList<>();
        int opc;

       
        System.out.println("Bienvenido");
        

        do {
            System.out.println("\nPor favor, Ingrese (1) para cargar Pisos\nIngrese (2) para cargar Locales\nIngrese (3) para Salir");
            opc = in.nextInt();
            if (opc == 1 || opc == 2) {
                agregarInmueble(opc, listaInmuebles);
            } else if (opc != 3){
                System.out.println("Ha ingresado una opcion errónea, por favor, intente de nuevo");
            }
        } while (opc != 3);

        for (Inmueble i: listaInmuebles) {
            i.getDatos();
            System.out.println("\nEl precio final del inmueble es: "+ i.calcPrecioInmueble() + "\n\n");
        }
    }




    


    public static void agregarInmueble(int opcion, ArrayList <Inmueble> listaInmuebles) {
        Scanner in = new Scanner(System.in);

        String direccion;
        int metros_Cuadrados;
        String estado;
        int anios;
        int numPiso;
        int valorBase;
        int cantidadVentanas;

        System.out.print("A continuacion, ingrese la dirección: ");
        direccion = in.nextLine();
        System.out.print("Ahora los metros cuadrados: ");
        metros_Cuadrados = in.nextInt();
        System.out.print("¿Es nuevo o de segunda mano?: ");
        in.nextLine();
        estado = in.nextLine();
        System.out.print("Ingrese los años: ");
        anios = in.nextInt();
        if (opcion == 1) {
            System.out.print("Número del Piso: ");
            numPiso = in.nextInt();
            System.out.print("Precio base: ");
            valorBase = in.nextInt();
            listaInmuebles.add(new Pisos(direccion, metros_Cuadrados, estado, anios, numPiso, valorBase) {
                @Override
                public double calcPrecioInmueble() {
                    throw new UnsupportedOperationException("Not supported yet."); 
                }
            });
        } else if (opcion == 2) {
            System.out.print("Cantidad de Ventanas: ");
            cantidadVentanas = in.nextInt();
            System.out.print("Precio base: ");
            valorBase = in.nextInt();
            listaInmuebles.add(new Locales(direccion, metros_Cuadrados, estado, anios, cantidadVentanas, valorBase) {});
        }
    }

    
}