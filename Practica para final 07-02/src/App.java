package FinalProgramacionDos.src;

import java.util.Scanner;

public class App {

    

    public static void main(String[] args) throws Exception {
        Administracion univAcon = new Administracion();
        try (Scanner in = new Scanner(System.in)) {
            // Menu
            int opcMenu;

            do {
                System.out.println("######");
                System.out.println("MENU inscriptos UNIV. ACONCAGUA.");
                System.out.println(
                        "1- AGREGAR INSCRIPTO. 2- BORRAR ULTIMO. 3- BORRAR LISTA. 4- MOSTRAR INSCRIPTOS. 5- PARA SALIR.");
                System.out.println("Ingrese una opción.");

                opcMenu = in.nextInt();
                switch (opcMenu) {

                    case 1:
                        univAcon.AgregarInscripto(); // agregará un inscripto con la pila
                        break;

                    case 2:
                        univAcon.desapilarInscripto(); // borrará al que esté mas arriba en la pila.
                        break;

                    case 3:
                        univAcon.limpiarLista(); // limpiará la lista.
                        break;

                    case 4:
                        try {
                            univAcon.MostrarInscriptos(); // muestra solamente el primer inscripto por errores que no
                                                          // pude lograr corregir.
                        } catch (VaciaException e) {
                            System.out.println(e.getMessage()); // esto imprimirá el mensaje de error al estar vacía la
                                                                // lista.
                        }
                        break;
                }
            } while (opcMenu != 5);
        }
        System.out.println("Gracias por usar la terminal de inscriptos de la UDA.");
    }
}
