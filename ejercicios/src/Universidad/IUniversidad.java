package Universidad;

public interface IUniversidad {
    void agregarEstudiante(IEstudiante estudiante);
    void agregarProfesor(IProfesor profesor);
    void agregarCurso(ICurso curso);
    void agregarDepartamento(IDepartamento departamento);
    void agregarAsignatura(IAsignatura asignatura);
    void mostrarInformacionEstudiantes();
    void mostrarInformacionProfesores();
    void mostrarInformacionCursos();
    void mostrarInformacionDepartamentos();
    void mostrarInformacionAsignaturas();
    void asignarEstudianteACurso(String estudianteNombre, String cursoNombre);
    void asignarEstudianteADepartamento(String estudianteNombre, String departamentoNombre);
    void asignarProfesorAAsignatura(String profesorNombre, String asignaturaNombre);
    void mostrarMejoresPromedios();
    void mostrarPeoresCalificaciones();
}

