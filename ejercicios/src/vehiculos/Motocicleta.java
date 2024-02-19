package vehiculos;

class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String obtenerTipo() {
        return "Motocicleta";
    }

    public boolean tieneSidecar() {
        return tieneSidecar;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + obtenerTipo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("¿Tiene Sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }
}

