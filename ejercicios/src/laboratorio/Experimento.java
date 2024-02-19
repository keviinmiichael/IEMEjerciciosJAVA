package laboratorio;

abstract class Experimento {
    private String nombre;
    private String descripcion;

    public Experimento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract void realizarExperimento();

    public abstract void analizarResultados();

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

