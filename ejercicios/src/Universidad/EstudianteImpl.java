package Universidad;

import java.util.ArrayList;
import java.util.List;

public class EstudianteImpl implements IEstudiante {
    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String direccion;
    private List<ICurso> cursosMatriculados;
    private List<IDepartamento> departamentosAsociados;

    public EstudianteImpl(String nombre, String fechaNacimiento, String genero, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.cursosMatriculados = new ArrayList<>();
        this.departamentosAsociados = new ArrayList<>();
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
        System.out.println("Estudiante: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
    }

    @Override
    public void matricularEnCurso(ICurso curso) {
        cursosMatriculados.add(curso);
    }

    @Override
    public void asignarADepartamento(IDepartamento departamento) {
        departamentosAsociados.add(departamento);
    }

    @Override
    public void mostrarCursosMatriculados() {
        System.out.println("Cursos matriculados por " + nombre + ":");
        for (ICurso curso : cursosMatriculados) {
            System.out.println("- " + curso.getNombre());
        }
        System.out.println();
    }

    @Override
    public void mostrarDepartamentosAsociados() {
        System.out.println("Departamentos asociados a " + nombre + ":");
        for (IDepartamento departamento : departamentosAsociados) {
            System.out.println("- " + departamento.getNombre());
        }
        System.out.println();
    }
}

