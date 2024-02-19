package laboratorio;

public class Main {
    public static void main(String[] args) {
        ProyectoInvestigacion proyecto = new ProyectoInvestigacion();

        ExperimentoBiologico expBio = new ExperimentoBiologico("Estudio de Microorganismos", "Observación a nivel microscópico", "Cultivo Celular");
        ExperimentoFisico expFisico = new ExperimentoFisico("Medición de Resistencia", "Determinar resistencia eléctrica", "Conductores Metálicos");
        proyecto.agregarExperimento(expBio);
        proyecto.agregarExperimento(expFisico);

        proyecto.realizarExperimentos();
        proyecto.analizarResultados();
    }
}

