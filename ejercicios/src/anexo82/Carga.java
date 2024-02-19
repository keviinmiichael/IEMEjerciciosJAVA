package anexo82;

class Carga {
    private String tipo;
    private double peso;

    public Carga(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Carga: " + tipo + ", Peso: " + peso + " kg";
    }
}
