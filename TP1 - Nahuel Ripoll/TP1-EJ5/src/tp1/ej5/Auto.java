
package tp1.ej5;


public class Auto {
    private final float kmsCombustible;
    int velocidadMax;

    public Auto(float maxVelocidad, float combustible, float cantidadKms, float kmsCombustible) {
        super(maxVelocidad, combustible, cantidadKms);
        this.kmsCombustible = kmsCombustible;
    }

    public void calcularTiempo() {
        float tiempo;
        float cantidadKms = 0;
        float maxVelocidad = 0;
        tiempo = (cantidadKms / maxVelocidad) + (cantidadKms / kmsCombustible);
        System.out.println("El tiempo en auto es: "+tiempo);
    }

    
}
    

