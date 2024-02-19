package laboratorio;

class ExperimentoFisico extends Experimento {
    private String tipoMaterial;

    public ExperimentoFisico(String nombre, String descripcion, String tipoMaterial) {
        super(nombre, descripcion);
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public void realizarExperimento() {
        System.out.println("Realizando Experimento Físico: " + getNombre());
    }

    @Override
    public void analizarResultados() {
        System.out.println("Analizando Resultados del Experimento Físico: " + getNombre());
    }
}

