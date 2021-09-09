
package tp1_ej4;

import java.io.InputStream;
import java.util.Scanner;

public class Persona {

    
    
    private int cuentaBancaria;
      private int dni;
    
    Cuenta miCuenta = new Cuenta();
    Scanner read = new Scanner(System.in);

    public Persona(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public int getDni(){
        return dni;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public double Cuenta1() {

        Cuenta cuenta = new Cuenta();
        int Deuda = 2500;
        int opc;

        System.out.println("CUENTA BBVA FRANCES");
        System.out.println(getCuentaBancaria());
        System.out.println(cuenta.getSaldo_Disponible);
        System.out.println("Por favor, elija la opcion que desee");
        System.out.println("(1) Para consultar sobre deuda");
        System.out.println("(2) Para pagar deuda");
        opc = read.nextInt();

        switch (opc){
            case 1:
                System.out.println("Usted posee deuda");
                System.out.println("Alquieres Reymax = $2500");
                System.out.println("Debe abondarlo con su segunda cuenta");
                break;
            case 2:
                System.out.println("Desea ingresar a su otra cuenta?");
                System.out.println("(1) Si - (2) NO");
                opc = read.nextInt();

                if(opc == 1){
                    Cuenta2();
                }



        if (Deuda > 0) {
            System.out.println("La persona es morosa");
        } else {
            System.out.println("La persona no es morosa");

        }
    }

    
    public double Cuenta2(){
        
    }

  
    }
    
    
    
    
   
    
    
    
}
