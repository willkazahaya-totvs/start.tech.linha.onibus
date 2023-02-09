package br.com.totvs.start.tech.service;

import br.com.totvs.start.tech.entity.Linha;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public interface LinhaService {
    public Linha criar(int id, String origem, String destino, LocalTime horarioInicio, LocalTime horarioFim);
    public Linha atualizar(Linha linha, String origem, String destino, LocalTime horarioInicio, LocalTime horarioFim);
    public Linha alteraOrigemDestino(Linha linha, String origem, String destino);
}
