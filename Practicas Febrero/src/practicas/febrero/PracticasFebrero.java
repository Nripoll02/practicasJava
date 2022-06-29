
package practicas.febrero;

import java.util.Scanner;


public class PracticasFebrero {


public class App {

    /*
     * ATENCIÓN: AL COMPILAR, VISUAL SUELE TIRAR ERROR, DEBE INTENTAR UNA SEGUNDA
     * VEZ Y COMPILARÁ CORRECTAMENTE.
     * TEORÍA ESTÁ ABAJO DEL MAIN.
     * COMPILA PRESIONANDO F5.
     * 
     */

    public static void main(String[] args) throws Exception {
        Administracion univAcon = new Administracion();
        try (Scanner in = new Scanner(System.in)) {
            // Menu
            int opcMenu;

            do {
                System.out.println("######");
                System.out.println("MENU inscriptos UNIV. ACONCAGUA.");
                System.out.println(
                        "1- AGREGAR INSCRIPTO. 2- BORRAR LISTA. 3- BORRAR ÚLTIMO. 4- MOSTRAR INSCRIPTOS. 5- PARA SALIR.");
                System.out.println("Ingrese una opción.");

                opcMenu = in.nextInt();
                switch (opcMenu) {

                    case 1 -> univAcon.AgregarInscripto(); // agregará un inscripto con la pila

                    case 2 -> univAcon.desapilarInscripto();// borrará al que esté mas arriba en la pila.

                    case 3 -> univAcon.limpiarLista(); // limpiará la lista.

                    case 4 -> {
                        try {
                            univAcon.MostrarInscriptos(); // muestra solamente el primer inscripto por errores que no
                            // pude lograr corregir.
                        } catch (VaciaException e) {
                            System.out.println(e.getMessage()); // esto imprimirá el mensaje de error al estar vacía la
                            // lista.
                        }
                    }
                }
            } while (opcMenu != 5);
        }
        System.out.println("Gracias por usar la terminal de inscriptos de la UDA.");
    }
}
/*
 * Teoria
 * 
 * 3- El archivo .class es el archivo de java en binario para poder ser
 * compilado.
 * 
 * 6- Que se puede portar a otros lenguajes de programación.
 * 
 * 7- El static se utiliza para poder usar un atributo o método que no está en
 * el main, dentro del main, sin la necesidad de crear
 * objetos.
 * 
 * 8- El this se utiliza para especificar que se está editando o modificando un
 * atributo de la clase en particular. Se utiliza
 * para que no hayan errores de ambiguedad.
 * Super: Se utiliza al momento de heredar una clase para heredar dichos
 * atributos, es para
 * saber qué elementos se heredan de la clase madre. En C# se conoce como
 * "base :".
 * 
 * 9- Cuando utiliza clases y objetos para programar, es decir que tiene clases
 * heredables y es posible crear objetos.
 * 
 * 
 */
    
}
    
