
package tp1.ej5;


public class TP1EJ5 {

    
    public static void main(String[] args) {
        Auto miAuto = new Auto(0,0,0,600);
        Moto miMoto = new Moto(0,0,0,700);
        Tren miTren = new Tren(0,0,0,0);

        miAuto.velocidadMax = 220;
        miMoto.velocidadMax = 110;
        miTren.velocidadMax = 80;
        miAuto.ingresarKm();
        miAuto.calcularTiempo();
        miMoto.ingresarKm();
        miMoto.calcularTiempo();
        miTren.ingresarKm();
        miTren.calcularTiempo();

        
    }
    
}
