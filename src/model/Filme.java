package model;

import javafx.scene.image.Image;

import java.math.BigDecimal;

/**
 * Created by Amanda on 16/08/2017.
 */
public class Filme {

    private int filmeId;
    private String nome;
    private String sinopse;
    private String dataLancamento;
    private String duracao;
    private Image classificacao;
    private BigDecimal valorAluguel;
    private Image capaMenor;
    private Image capaOriginal;

    public int getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(int filmeId) {
        this.filmeId = filmeId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Image getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Image classificacao) {
        this.classificacao = classificacao;
    }

    public BigDecimal getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(BigDecimal valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Image getCapaMenor() {
        return capaMenor;
    }

    public void setCapaMenor(Image capaMenor) {
        this.capaMenor = capaMenor;
    }

    public Image getCapaOriginal() {
        return capaOriginal;
    }

    public void setCapaOriginal(Image capaOriginal) {
        this.capaOriginal = capaOriginal;
    }
}
