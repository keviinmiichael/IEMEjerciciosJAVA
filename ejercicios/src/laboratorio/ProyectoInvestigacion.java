package laboratorio;

import java.util.ArrayList;
import java.util.List;

class ProyectoInvestigacion {
    private List<Experimento> experimentos;

    public ProyectoInvestigacion() {
        this.experimentos = new ArrayList<>();
    }

    public void agregarExperimento(Experimento experimento) {
        experimentos.add(experimento);
    }

    public void realizarExperimentos() {
        System.out.println("Realizando todos los Experimentos del Proyecto de Investigación:");
        for (Experimento experimento : experimentos) {
            experimento.realizarExperimento();
            System.out.println();
        }
    }

    public void analizarResultados() {
        System.out.println("\nAnalizando Resultados de todos los Experimentos del Proyecto de Investigación:");
        for (Experimento experimento : experimentos) {
            experimento.analizarResultados();
            System.out.println();
        }
    }
}

