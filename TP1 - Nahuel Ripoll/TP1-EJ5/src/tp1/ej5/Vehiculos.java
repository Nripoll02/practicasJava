
package tp1.ej5;


import java.util.Scanner;

public abstract class Vehiculos {
    protected float maxVelocidad;
    protected float combustible;
    protected float cantidadKm;
    protected Scanner read;


    public Vehiculos(float maxVelocidad, float combustible, float cantidadKm) {
        this.maxVelocidad = maxVelocidad;
        this.combustible = combustible;
        this.cantidadKm = cantidadKm;
        this.read = new Scanner(System.in);
    }

    public void ingresarKm(){
        System.out.println("Por favor, ingrese la cantidad de kilometros: ");
        this.cantidadKm = read.nextInt();
    }

    public abstract void calcularTiempo();


    
}
