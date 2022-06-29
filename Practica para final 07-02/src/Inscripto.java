package FinalProgramacionDos.src;

public class Inscripto {
    public long dni;
    public String apellido;

    public Inscripto(long dni, String apellido) {

        this.dni = dni;
        this.apellido = apellido;

    }

    public Inscripto() {

    }

    public Long getDni() {
        return this.dni;
    }

    public String getApellido() {
        return this.apellido;
    }

}
