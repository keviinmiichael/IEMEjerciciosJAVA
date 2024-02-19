package Universidad;

public class Main {
    public static void main(String[] args) {
        
        IUniversidad universidad = new UniversidadImpl();

        
        IEstudiante estudiante1 = new EstudianteImpl("Estudiante1", "01/01/2000", "M", "Dirección1");
        IEstudiante estudiante2 = new EstudianteImpl("Estudiante2", "02/02/2001", "F", "Dirección2");

        IProfesor profesor1 = new ProfesorImpl("Profesor1", "10/05/1980", "M", "Dirección3");
        IProfesor profesor2 = new ProfesorImpl("Profesor2", "15/08/1975", "F", "Dirección4");

        ICurso curso1 = new CursoImpl("Curso1");
        ICurso curso2 = new CursoImpl("Curso2");

        IDepartamento departamento1 = new DepartamentoImpl("Departamento1");
        IDepartamento departamento2 = new DepartamentoImpl("Departamento2");

        IAsignatura asignatura1 = new AsignaturaImpl("Asignatura1");
        IAsignatura asignatura2 = new AsignaturaImpl("Asignatura2");

        
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);

        universidad.agregarDepartamento(departamento1);
        universidad.agregarDepartamento(departamento2);

        universidad.agregarAsignatura(asignatura1);
        universidad.agregarAsignatura(asignatura2);

        
        universidad.asignarEstudianteACurso("Estudiante1", "Curso1");
        universidad.asignarEstudianteACurso("Estudiante2", "Curso2");

        universidad.asignarEstudianteADepartamento("Estudiante1", "Departamento1");
        universidad.asignarEstudianteADepartamento("Estudiante2", "Departamento2");

        
        universidad.asignarProfesorAAsignatura("Profesor1", "Asignatura1");
        universidad.asignarProfesorAAsignatura("Profesor2", "Asignatura2");

        
        universidad.mostrarInformacionEstudiantes();
        universidad.mostrarInformacionProfesores();
        universidad.mostrarInformacionCursos();
        universidad.mostrarInformacionDepartamentos();
        universidad.mostrarInformacionAsignaturas();

        
        universidad.mostrarMejoresPromedios();
        universidad.mostrarPeoresCalificaciones();
    }
}