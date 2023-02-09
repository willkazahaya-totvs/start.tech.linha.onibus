package br.com.totvs.start.tech.service;

import br.com.totvs.start.tech.entity.Linha;

import java.time.LocalDate;
import java.time.LocalTime;

public class LinhaServiceImpl implements  LinhaService{
    @Override
    public Linha criar(int id, String origem, String destino, LocalTime horarioInicio, LocalTime horarioFim) {
        Linha novaLinha = new Linha();

        novaLinha.setId(id);
        novaLinha.setOrigem(origem);
        novaLinha.setDestino(destino);
        novaLinha.setHorarioInicioFuncionamento(horarioInicio);
        novaLinha.setHorarioFimFuncionamento(horarioFim);

        return novaLinha;
    }

    @Override
    public Linha atualizar(Linha linha, String origem, String destino, LocalTime horarioInicio, LocalTime horarioFim) {
        linha.setOrigem(origem);
        linha.setDestino(destino);
        linha.setHorarioInicioFuncionamento(horarioInicio);
        linha.setHorarioFimFuncionamento(horarioFim);
        return linha;
    }

    @Override
    public Linha alteraOrigemDestino(Linha linha, String origem, String destino) {
        linha.setOrigem(origem);
        linha.setDestino(destino);
        return linha;
    }
}
