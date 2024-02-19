package anexo9.RedSocial;

import java.time.LocalDateTime;


public class Publicacion {
    
    private Perfil perfil;
    private String contenido;
    private LocalDateTime fecha;

    public Publicacion(Perfil perfil, String contenido) {
        this.perfil = perfil;
        this.contenido = contenido;
        this.fecha = LocalDateTime.now();
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Publicación: " + perfil + ", Contenido: " + contenido + ", Fecha: " + fecha;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
