import model.Tarefa;
import tarefaservico.TarefaServico;

import java.util.Scanner;

    public class Main{

        public static void main (String[] args){

            Scanner scanner = new Scanner(System.in);
            TarefaServico servico = new TarefaServico();

            int opcao;

            do {
                System.out.println("\n MENU DE TAREFAS ");
                System.out.println("1 - Adicionar Tarefa");
                System.out.println("2 - Remover Tarefa");
                System.out.println("3 - Concluír Tarefa");
                System.out.println("4 - Listar Tarefas");
                System.out.println("0 - Sair");
                System.out.print("\nEscolha: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.println("Digite a descrição: ");
                        String descricao = scanner.nextLine();
                        Tarefa novaTarefa = new Tarefa(descricao);
                        servico.adicionarTarefa(novaTarefa);
                        System.out.println("Tarefa adicionada com sucesso!");
                        break;

                    case 2:
                        System.out.println("Digite o ID da tarefa para remover: ");
                        int IdRemover = scanner.nextInt();
                        servico.removerTarefa(IdRemover);
                        System.out.println("Tarefa Removida com sucesso!");
                        break;

                    case 3:
                        System.out.println("Digite o ID da tarefa para concluír: ");
                        int IdConcluir = scanner.nextInt();
                        servico.concluirTarefa(IdConcluir);
                        System.out.println("Tarefa Concluída com sucesso!");
                        break;

                    case 4:
                        servico.listarTarefas();
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção Inválida!");

                }

            } while (opcao != 0);

            scanner.close();
        }
    }