package FinalProgramacionDos.src;

import java.util.Stack;
import java.util.Scanner;

public class Administracion {

    Scanner in = new Scanner(System.in);

    Stack<Inscripto> ListaInscriptos = new Stack<Inscripto>();
    Inscripto Stu = new Inscripto();

    public void AgregarInscripto() {

        long numStack;
        String nameStack;

        System.out.println("Ingrese el número de DNI del inscripto.");
        numStack = in.nextLong();
        System.out.println("Ingrese el apellido del inscripto.");
        nameStack = in.next();

        ListaInscriptos.add(new Inscripto(numStack, nameStack));

    }

    public void MostrarInscriptos() throws VaciaException {
        if (ListaInscriptos.empty() == true) {
            throw new VaciaException("La lista está vacía.");
        } else {
            ListaInscriptos.size();
            System.out.println(
                    "DNI: " + (ListaInscriptos.get(0).getDni()) + " Apellido: " + ListaInscriptos.get(0).getApellido());

        }
    }

    public void limpiarLista() {
        ListaInscriptos.clear();
    }

    public void desapilarInscripto() {
        ListaInscriptos.pop();
    }

    public void ListarInscripto() {
        System.out.println("Ingresar un DNI hasta cual listar");
        int x = in.nextInt();

        if (x < ListaInscriptos.get(0).getDni()) {
            System.out.println(
                    "DNI: " + (ListaInscriptos.get(0).getDni()) + " Apellido: " + ListaInscriptos.get(0).getApellido());
        }

    }

}
