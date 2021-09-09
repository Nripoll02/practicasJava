
package tp1_ej4;


public class Cuenta {
    private int numCuenta;
    private double Saldo_Disponible;
    
    public Cuenta(){
        
    }
    
    public Cuenta(int dni, double Saldo_Disponible){
        this.dni = dni;
        this.Saldo_Disponible = Saldo_Disponible;
        
    }
    
    public  void setSaldo_Disponible(double Saldo_Disponible){
        this.Saldo_Disponible = Saldo_Disponible;
                
    }
    
    public int getNumCuenta(){
        return numCuenta;
    }
    
   public void setNumCuenta(int numCuenta);
   this.int = numCuenta;
   
    
    
    
    
}
