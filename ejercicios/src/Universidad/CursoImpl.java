package Universidad;

import java.util.ArrayList;
import java.util.List;

public class CursoImpl implements ICurso {
    private String nombre;
    private List<IEstudiante> estudiantes;

    public CursoImpl(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void matricularEstudiante(IEstudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Curso: " + nombre);
        System.out.println("Estudiantes matriculados:");
        for (IEstudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
        System.out.println();
    }
}