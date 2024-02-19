package vehiculos;

class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    @Override
    public String obtenerTipo() {
        return "Automóvil";
    }

    public int getPuertas() {
        return puertas;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + obtenerTipo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Número de Puertas: " + getPuertas());
    }
}
