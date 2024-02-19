package laboratorio;

public class Main {
    public static void main(String[] args) {
        ProyectoInvestigacion proyecto = new ProyectoInvestigacion();

        // Instanciar experimentos
        ExperimentoBiologico expBio = new ExperimentoBiologico("Estudio de Microorganismos", "Observación a nivel microscópico", "Cultivo Celular");
        ExperimentoFisico expFisico = new ExperimentoFisico("Medición de Resistencia", "Determinar resistencia eléctrica", "Conductores Metálicos");
        // Agregar experimentos al proyecto
        proyecto.agregarExperimento(expBio);
        proyecto.agregarExperimento(expFisico);

        // Realizar y analizar experimentos del proyecto
        proyecto.realizarExperimentos();
        proyecto.analizarResultados();
    }
}

