
package tp1.ej2;
import java.util.Scanner;

public class Auto {
    private int x;
    private int z;
    private int Kms;
    private int consumoPrimerAuto;
    private int consumoSegundoAuto;
    
    Scanner sc = new Scanner(System.in);

    
    public Auto(int x, int z, int Km, int consumoAuto1, int consumoAuto2) {
        this.x = x;
        this.z = z;
        this.Kms = Kms;
        this.consumoPrimerAuto = consumoAuto1;
        this.consumoSegundoAuto = consumoAuto2;
    }

    Auto() {
        
    }
    
    
    public void Combustible(){
        
        System.out.println("Coloque en litros");
        
        System.out.println("Cuanto consume el primer vehiculo por km?");
        x = sc.nextInt();
        
        System.out.println("Cuanto consume el segundo vehiculo por km?");
        z = sc.nextInt(); 
    }
    
    //consumo dependiendo los km
    public void Kilometros(){
        
        System.out.println("Kilometros");
        
        System.out.println("Ingrese cuantos kilometros ha recorrido o desea recorrer");
        Kms = sc.nextInt();
        
        consumoPrimerAuto = Kms * x / 1;
        consumoSegundoAuto = Kms * z / 1;        
    }
    
   
    public void Result( int kmTotal1, int kmTotal2){
        
        int kmsRecorridos1 = 95000;
        int kmsRecorridos2 = 80000;
        
        kmTotal1 = (int) (kmsRecorridos1 + Kms);
        kmTotal2 = (int) (kmsRecorridos2 + Kms);
        
        System.out.println("Resultado");
        
        System.out.println("");
        
        System.out.println("Primer auto");
        System.out.println("Cada Km el auto Consume: " + x + " Litros");
        System.out.println("En " + Kms + " Km, el auto consume: " + consumoPrimerAuto + " Litros");
        System.out.println("Kilometraje: " + kmsRecorridos1 + " Km");
        System.out.println("Kilometraje acumulado: " + kmTotal1 + " Km"); 
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Segundo auto");
        System.out.println("Cada Km el auto Consume: " + z + " Litros");
        System.out.println("En " + Kms + " Km, el auto consume: " + consumoSegundoAuto + " Litros");
        System.out.println("Kilometraje: " + kmsRecorridos2 + " Km");
        System.out.println("Kilometraje acumulado: " + kmTotal2 + " Km");       
    }
    
    public void Comp(){
        
        System.out.println("Comparacion");
        System.out.println("");
        
        if (consumoPrimerAuto < consumoSegundoAuto) 
        {
            System.out.println("");
            System.out.println("En cuanto al consumo, es mejor el auto 1");
        } 
        else 
        {
            System.out.println("");
            System.out.println("En cuanto al consumo, es mejor el auto 2");
        }
    }
}