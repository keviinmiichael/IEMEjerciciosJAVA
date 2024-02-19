package Universidad;

import java.util.ArrayList;
import java.util.List;

public class AsignaturaImpl implements IAsignatura {
    private String nombre;
    private List<IProfesor> profesores;

    public AsignaturaImpl(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void asignarProfesor(IProfesor profesor) {
        profesores.add(profesor);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Asignatura: " + nombre);
        System.out.println("Profesores:");
        for (IProfesor profesor : profesores) {
            System.out.println("- " + profesor.getNombre());
        }
        System.out.println();
    }
}
