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
    }

    @Override
    public void analizarResultados() {
        System.out.println("Analizando Resultados del Experimento Biológico: " + getNombre());
    }
}

