
package tp1.ej7;


public abstract class Inmueble {
    protected String direccion;
    protected int metros_Cuadrados;
    protected String estado;
    protected int anios;
    protected int valorBase;

    public Inmueble(String direccion, int metros_Cuadrados, String estado, int anios, int valorBase) {
        this.direccion = direccion;
        this.metros_Cuadrados = metros_Cuadrados;
        this.estado = estado;
        this.anios = anios;
        this.valorBase = valorBase;
    }

    public abstract double calcPrecioInmueble();

    public abstract void getDatos();
}