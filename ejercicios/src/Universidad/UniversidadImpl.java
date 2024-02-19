package Universidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UniversidadImpl implements IUniversidad {
    private List<IEstudiante> estudiantes;
    private List<IProfesor> profesores;
    private List<ICurso> cursos;
    private List<IDepartamento> departamentos;
    private List<IAsignatura> asignaturas;

    public UniversidadImpl() {
        this.estudiantes = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    @Override
    public void agregarEstudiante(IEstudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public void agregarProfesor(IProfesor profesor) {
        profesores.add(profesor);
    }

    @Override
    public void agregarCurso(ICurso curso) {
        cursos.add(curso);
    }

    @Override
    public void agregarDepartamento(IDepartamento departamento) {
        departamentos.add(departamento);
    }

    @Override
    public void agregarAsignatura(IAsignatura asignatura) {
        asignaturas.add(asignatura);
    }

    @Override
    public void mostrarInformacionEstudiantes() {
        System.out.println("Información de Estudiantes:");
        for (IEstudiante estudiante : estudiantes) {
            estudiante.mostrarInformacionPersonal();
            estudiante.mostrarCursosMatriculados();
            estudiante.mostrarDepartamentosAsociados();
        }
    }

    @Override
    public void mostrarInformacionProfesores() {
        System.out.println("Información de Profesores:");
        for (IProfesor profesor : profesores) {
            profesor.mostrarInformacionPersonal();
            profesor.mostrarAsignaturas();
        }
    }

    @Override
    public void mostrarInformacionCursos() {
        System.out.println("Información de Cursos:");
        for (ICurso curso : cursos) {
            curso.mostrarInformacion();
        }
    }

    @Override
    public void mostrarInformacionDepartamentos() {
        System.out.println("Información de Departamentos:");
        for (IDepartamento departamento : departamentos) {
            departamento.mostrarInformacion();
        }
    }

    @Override
    public void mostrarInformacionAsignaturas() {
        System.out.println("Información de Asignaturas:");
        for (IAsignatura asignatura : asignaturas) {
            asignatura.mostrarInformacion();
        }
    }

    @Override
    public void asignarEstudianteACurso(String estudianteNombre, String cursoNombre) {
        IEstudiante estudiante = buscarEstudiante(estudianteNombre);
        ICurso curso = buscarCurso(cursoNombre);

        if (estudiante != null && curso != null) {
            curso.matricularEstudiante(estudiante);
        } else {
            System.out.println("Estudiante o Curso no encontrado.");
        }
    }

    @Override
    public void asignarEstudianteADepartamento(String estudianteNombre, String departamentoNombre) {
        IEstudiante estudiante = buscarEstudiante(estudianteNombre);
        IDepartamento departamento = buscarDepartamento(departamentoNombre);

        if (estudiante != null && departamento != null) {
            departamento.asignarEstudiante(estudiante);
        } else {
            System.out.println("Estudiante o Departamento no encontrado.");
        }
    }

    @Override
    public void asignarProfesorAAsignatura(String profesorNombre, String asignaturaNombre) {
        IProfesor profesor = buscarProfesor(profesorNombre);
        IAsignatura asignatura = buscarAsignatura(asignaturaNombre);

        if (profesor != null && asignatura != null) {
            asignatura.asignarProfesor(profesor);
        } else {
            System.out.println("Profesor o Asignatura no encontrado.");
        }
    }

    @Override
    public void mostrarMejoresPromedios() {
        System.out.println("Lista de Estudiantes con Mejores Promedios:");
        List<IEstudiante> estudiantesOrdenados = new ArrayList<>(estudiantes);
        Collections.sort(estudiantesOrdenados, Comparator.comparingDouble(this::calcularPromedioEstudiante).reversed());

        for (IEstudiante estudiante : estudiantesOrdenados) {
            System.out.println("- " + estudiante.getNombre() + " - Promedio: " + calcularPromedioEstudiante(estudiante));
        }
    }

    @Override
    public void mostrarPeoresCalificaciones() {
        System.out.println("Lista de Estudiantes con Peores Calificaciones:");
        List<IEstudiante> estudiantesOrdenados = new ArrayList<>(estudiantes);
        Collections.sort(estudiantesOrdenados, Comparator.comparingDouble(this::calcularPromedioEstudiante));

        for (IEstudiante estudiante : estudiantesOrdenados) {
            System.out.println("- " + estudiante.getNombre() + " - Promedio: " + calcularPromedioEstudiante(estudiante));
        }
    }

    private IEstudiante buscarEstudiante(String nombre) {
        for (IEstudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                return estudiante;
            }
        }
        return null;
    }

    private IProfesor buscarProfesor(String nombre) {
        for (IProfesor profesor : profesores) {
            if (profesor.getNombre().equals(nombre)) {
                return profesor;
            }
        }
        return null;
    }

    private ICurso buscarCurso(String nombre) {
        for (ICurso curso : cursos) {
            if (curso.getNombre().equals(nombre)) {
                return curso;
            }
        }
        return null;
    }

    private IDepartamento buscarDepartamento(String nombre) {
        for (IDepartamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombre)) {
                return departamento;
            }
        }
        return null;
    }

    private IAsignatura buscarAsignatura(String nombre) {
        for (IAsignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombre)) {
                return asignatura;
            }
        }
        return null;
    }

    private double calcularPromedioEstudiante(IEstudiante estudiante) {
        // Lógica para calcular el promedio de calificaciones de un estudiante (puede implementarse según tus necesidades)
        return 0.0;
    }
}

