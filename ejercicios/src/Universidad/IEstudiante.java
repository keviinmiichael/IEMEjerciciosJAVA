package Universidad;

public interface IEstudiante extends IPersona {
    void matricularEnCurso(ICurso curso);
    void asignarADepartamento(IDepartamento departamento);
    void mostrarCursosMatriculados();
    void mostrarDepartamentosAsociados();
}
