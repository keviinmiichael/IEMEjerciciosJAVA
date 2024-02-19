package clasesGenericas;

public class LibroElectronico<T> {
    private String titulo;
    private String autor;
    private T precio;

    public LibroElectronico(String titulo, String autor, T precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public T getPrecio() {
        return precio;
    }

    public void setPrecio(T precio) {
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
        System.out.println();
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        LibroElectronico<Double> libroCienciaFiccion = new LibroElectronico<>("El Fin de la Eternidad", "Isaac Asimov", 19.99);
        libroCienciaFiccion.mostrarDetalles();

        LibroElectronico<Integer> libroHistoria = new LibroElectronico<>("Sapiens", "Yuval Noah Harari", 25);
        libroHistoria.mostrarDetalles();
        
        // También puedes usar otros tipos de precios según tus necesidades
        LibroElectronico<Float> libroEconomia = new LibroElectronico<>("La Riqueza de las Naciones", "Adam Smith", 15.50f);
        libroEconomia.mostrarDetalles();
    }
}

