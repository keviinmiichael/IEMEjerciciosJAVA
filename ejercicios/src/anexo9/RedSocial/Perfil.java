package anexo9.RedSocial;
import java.time.LocalDateTime;
    
       



public class Perfil {
    private String nombre;
    private String nombreReal;
    private LocalDateTime fecha;

    public Perfil(String nombre, String nombreReal) {
        this.nombre = nombre;
        this.nombreReal = nombreReal;
        this.fecha = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }
    public String getNombreReal() {
        return nombreReal;
    }

    public LocalDateTime getFechaCreacion() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Perfil: " + nombre + ", Nombre Real: " + nombreReal + ", Fecha Creación: " + fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

}
