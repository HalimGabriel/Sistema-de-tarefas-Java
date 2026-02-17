package model;

import java.time.LocalDate;

public class Tarefa {

    private static int contador = 1;

    private int id;
    private String descricao;
    private Status status;
    private LocalDate dataCriacao;

    public Tarefa(String descricao) {

        this.id = contador++;
        this.descricao = descricao;
        this.status = Status.PENDENTE;
        this.dataCriacao = LocalDate.now();
    }

    public void marcarComoConcluida() {
        this.status = Status.CONCLUIDA;
    }

    @Override
    public String toString(){
        return "ID: " + id +
                " | " + descricao +
                " | " + status +
                " | " + dataCriacao;

    }

    public int getId() {
        return id;
    }


}
