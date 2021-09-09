
package tp1.ej5;


public class Moto {
    private final float kmCombustible;
    int velocidadMax;

    public Moto(float maxVelocidad, float combustible, float cantidadKms, float kmCombustible) {
        super(maxVelocidad, combustible, cantidadKms);
        this.kmCombustible = kmCombustible;
    }

    public void calcularTiempo() {
        float tiempo;
        float cantidadKms = 0;
        float maxVelocidad = 0;
        tiempo = (cantidadKms / maxVelocidad);
        System.out.println("El tiempo que se tarda en moto es: "+tiempo);
    }

  
}
   
