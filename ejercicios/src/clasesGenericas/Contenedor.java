package clasesGenericas;

import java.util.ArrayList;
import java.util.List;

public class Contenedor<T> {
    private List<T> elementos;

    public Contenedor() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public T obtenerElemento(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    public boolean buscarElemento(T elemento) {
        return elementos.contains(elemento);
    }

    public void eliminarElemento(T elemento) {
        elementos.remove(elemento);
    }

    public void actualizarElemento(int indice, T nuevoElemento) {
        if (indice >= 0 && indice < elementos.size()) {
            elementos.set(indice, nuevoElemento);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    public int cantidadElementos() {
        return elementos.size();
    }

    public void imprimirElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Contenedor<String> contenedorString = new Contenedor<>();
        contenedorString.agregarElemento("Hola");
        contenedorString.agregarElemento("Mundo");
        contenedorString.imprimirElementos();

        Contenedor<Integer> contenedorInteger = new Contenedor<>();
        contenedorInteger.agregarElemento(42);
        contenedorInteger.agregarElemento(7);
        contenedorInteger.imprimirElementos();
    }
}

