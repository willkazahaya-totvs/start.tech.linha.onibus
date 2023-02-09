package br.com.totvs.start.tech.service;

import br.com.totvs.start.tech.entity.Linha;
import br.com.totvs.start.tech.entity.Onibus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OnibusService {
    public Onibus criar(int id, String codigo, String tipoOnibus, int anoCompra, Linha linha);
    public Onibus atualizar(Onibus onibus, String codigo, String tipoOnibus, int anoCompra);
    public Onibus setDataManutencao(Onibus onibus);
    public List<Onibus> buscarOnibusPeloId(List<Onibus> listOnibus, int id);
}
