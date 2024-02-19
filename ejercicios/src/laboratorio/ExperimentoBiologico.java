package laboratorio;

class ExperimentoBiologico extends Experimento {
    private String tipoMuestra;

    public ExperimentoBiologico(String nombre, String descripcion, String tipoMuestra) {
        super(nombre, descripcion);
        this.tipoMuestra = tipoMuestra;
    }

    @Override
    public void realizarExperimento() {
        System.out.println("Realizando Experimento Biológico: " + getNombre());
        // Lógica específica para experimentos biológicos
    }

    @Override
    public void analizarResultados() {
        System.out.println("Analizando Resultados del Experimento Biológico: " + getNombre());
        // Lógica específica para analizar resultados de experimentos biológicos
    }
}

