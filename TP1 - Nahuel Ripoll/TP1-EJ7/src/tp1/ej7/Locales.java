
package tp1.ej7;


public abstract class Locales extends Inmueble{
    private final int cantidadVentanas;

    public Locales(String direccion, int metros_Cuadrados, String estado, int anios,int cantidadVentanas, int valorBase) {
        super(direccion, metros_Cuadrados, estado, anios, valorBase);
        this.cantidadVentanas = cantidadVentanas;
    }


   
    @Override
    public double calcPrecioInmueble() {
        double costoFinal;
        costoFinal = valorBase;
        if (anios < 15) {
            costoFinal -= (costoFinal * 0.01);
        } else {
            costoFinal -= (costoFinal * 0.02);
        }

        if (metros_Cuadrados > 50) {
            costoFinal += (costoFinal * 0.01);
        }

        if (cantidadVentanas <= 1) {
            costoFinal -= (costoFinal * 0.02);
        } else if(cantidadVentanas > 4) {
            costoFinal += (costoFinal * 0.02);
        }
        return costoFinal;
    }

    @Override
    public void getDatos() {
        System.out.println("Caracteristicas del local");
        System.out.println(direccion+ "\nMts^2: " + metros_Cuadrados + "\nEstado: " +
                estado + "\nAntigüedad: " + anios + "\nCantidad de ventanas:" + cantidadVentanas + "\nValor base:" +
               valorBase);
    }
}
