package br.com.totvs.start.tech.service;

import br.com.totvs.start.tech.entity.Linha;
import br.com.totvs.start.tech.entity.Onibus;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class OnibusServiceImpl implements OnibusService{

    @Override
    public Onibus criar(int id, String codigo, String tipoOnibus, int anoCompra, Linha linha) {
        Onibus novoOnibus = new Onibus();
        novoOnibus.setId(id);
        novoOnibus.setCodigo(codigo);
        novoOnibus.setTipoOnibus(tipoOnibus);
        novoOnibus.setAnoCompra(anoCompra);
        novoOnibus.setLinha(linha);

        return novoOnibus;
    }

    @Override
    public Onibus atualizar(Onibus onibus, String codigo, String tipoOnibus, int anoCompra) {
        onibus.setCodigo(codigo);
        onibus.setTipoOnibus(tipoOnibus);
        onibus.setAnoCompra(anoCompra);

        return onibus;
    }

    @Override
    public Onibus setDataManutencao(Onibus onibus) {
        onibus.setDataUltimaManutencao(LocalDate.now());
        return onibus;
    }

    @Override
    public List<Onibus> buscarOnibusPeloId(List<Onibus> listOnibus, int id) {
        return listOnibus.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
    }

}
