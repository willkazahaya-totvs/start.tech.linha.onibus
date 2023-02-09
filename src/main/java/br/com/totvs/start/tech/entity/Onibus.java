package br.com.totvs.start.tech.entity;
import java.time.LocalDate;

public class Onibus {
    private int       id;
    private String    codigo;
    private String    tipoOnibus;
    private int       anoCompra;
    private LocalDate dataUltimaManutencao;
    private Linha     linha;

    public Onibus(){
        this.id = id;
        this.codigo = codigo;
        this.tipoOnibus = tipoOnibus;
        this.anoCompra = anoCompra;
        this.linha = linha;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoOnibus() {
        return tipoOnibus;
    }

    public void setTipoOnibus(String tipoOnibus) {
        this.tipoOnibus = tipoOnibus;
    }

    public int getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }

    public LocalDate getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(LocalDate dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }
}
