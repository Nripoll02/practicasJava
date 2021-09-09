
package tp1.ej7;


public abstract class Pisos extends Inmueble {
    private final int numeroPiso;

    public Pisos(String direccion, int metros_Cuadrados, String estado, int anios, int numeroPiso,int valorBase ) {
        super(direccion, metros_Cuadrados, estado, anios, valorBase);
        this.numeroPiso = numeroPiso;
    }

    public double calcularPrecioInmueble() {
        double costoFinal;
       costoFinal = valorBase;
        if (anios < 15) {
            costoFinal -= (costoFinal * 0.01);
        } else {
            costoFinal -= (costoFinal * 0.02);
        }

        if (numeroPiso >= 3) {
            costoFinal += (costoFinal * 0.03);
        }
        return costoFinal;
    }

    @Override
    public void getDatos() {
        System.out.println("Caracteristicas del piso");
        System.out.println(direccion+ "\nMts^2: " + metros_Cuadrados + "\nEstado: " +
                estado + "\nAntigüedad: " + anios + "\nEn el piso numero:" + numeroPiso + "\nValor base:" +
                valorBase);
    }

}
