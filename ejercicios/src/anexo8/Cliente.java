package anexo8;

class Cliente {
    private String nombre;
    private int puntosFidelidad;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.puntosFidelidad = 0;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void acumularPuntosFidelidad(int puntos) {
        this.puntosFidelidad += puntos;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Puntos de Fidelidad: " + puntosFidelidad;
    }
}