package tarefaservico;

import java.util.ArrayList;
import java.util.List;
import model.Tarefa;

public class TarefaServico {

    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa (Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(int idProcurado) {
        tarefas.removeIf(tarefa -> tarefa.getId() == idProcurado);
    }

    public void concluirTarefa(int idProcurado) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idProcurado){
                tarefa.marcarComoConcluida();
            }
        }
    }

    public void listarTarefas() {

        if (tarefas.isEmpty()) {
            System.out.println("Lista vazia. Aproveite seu dia!");
            return;
        }

        for (Tarefa tarefa : tarefas)  {
            System.out.println("Lista de Tarefas Completa: \n");
            System.out.println(tarefa);
        }
    }




}
