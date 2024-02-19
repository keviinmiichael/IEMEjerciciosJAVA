package Universidad;

import java.util.ArrayList;
import java.util.List;

public class ProfesorImpl implements IProfesor {
    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String direccion;
    private List<IAsignatura> asignaturas;

    public ProfesorImpl(String nombre, String fechaNacimiento, String genero, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.asignaturas = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void mostrarInformacionPersonal() {
        System.out.println("Profesor: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
    }

    @Override
    public void asignarAsignatura(IAsignatura asignatura) {
        asignaturas.add(asignatura);
    }

    @Override
    public void mostrarAsignaturas() {
        System.out.println("Asignaturas asignadas a " + nombre + ":");
        for (IAsignatura asignatura : asignaturas) {
            System.out.println("- " + asignatura.getNombre());
        }
        System.out.println();
    }
}