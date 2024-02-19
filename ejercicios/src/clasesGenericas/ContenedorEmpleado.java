package clasesGenericas;

import java.util.ArrayList;
import java.util.List;



public class ContenedorEmpleado<T extends Empleado> {
    private List<T> empleados;

    public ContenedorEmpleado() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(T empleado) {
        empleados.add(empleado);
    }

    public T obtenerEmpleado(int indice) {
        if (indice >= 0 && indice < empleados.size()) {
            return empleados.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    public boolean buscarEmpleado(T empleado) {
        return empleados.contains(empleado);
    }

    public void eliminarEmpleado(T empleado) {
        empleados.remove(empleado);
    }

    public void imprimirEmpleados() {
        for (T empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }

    public static void main(String[] args) {
        
        
        ContenedorEmpleado<Empleado> contenedor = new ContenedorEmpleado<>();

        Empleado empleado1 = new Empleado("Juan", 1000);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Ana", 15, 40);

        contenedor.agregarEmpleado(empleado1);
        contenedor.agregarEmpleado(empleado2);

        contenedor.imprimirEmpleados();
    }
}



class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    
    

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Salario: " + salario;
    }
}



class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, double salarioPorHora, int horasTrabajadas) {
        super(nombre, salarioPorHora);
        this.horasTrabajadas = horasTrabajadas;
    }

    
    

    @Override
    public String toString() {
        return "Empleado por hora: " + super.toString() + ", Horas trabajadas: " + horasTrabajadas;
    }
}
