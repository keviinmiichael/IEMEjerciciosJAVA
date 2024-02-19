package Universidad;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoImpl implements IDepartamento {
    private String nombre;
    private List<IEstudiante> estudiantes;

    public DepartamentoImpl(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void asignarEstudiante(IEstudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Departamento: " + nombre);
        System.out.println("Estudiantes asociados:");
        for (IEstudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
        System.out.println();
    }
}
