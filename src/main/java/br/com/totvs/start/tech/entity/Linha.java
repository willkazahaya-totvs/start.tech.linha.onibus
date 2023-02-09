package br.com.totvs.start.tech.entity;

import java.time.LocalTime;

public class Linha {
    private int id;
    private String origem;
    private String destino;
    private LocalTime horarioInicioFuncionamento;
    private LocalTime horarioFimFuncionamento;

    public Linha(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getHorarioInicioFuncionamento() {
        return horarioInicioFuncionamento;
    }

    public void setHorarioInicioFuncionamento(LocalTime horarioInicioFuncionamento) {
        this.horarioInicioFuncionamento = horarioInicioFuncionamento;
    }

    public LocalTime getHorarioFimFuncionamento() {
        return horarioFimFuncionamento;
    }

    public void setHorarioFimFuncionamento(LocalTime horarioFimFuncionamento) {
        this.horarioFimFuncionamento = horarioFimFuncionamento;
    }
}
