
package practicafinal.pkg7.pkg3;


public class Inscripto {
    
    public long dni;
    public String apellido;

    public Inscripto(long dni, String apellido) {
        this.dni = dni;
        this.apellido = apellido;
    }
    
    public Inscripto(){
        
    }

    public long getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }
    
    
}
