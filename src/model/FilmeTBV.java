package model;

import javafx.beans.property.SimpleStringProperty;

import java.text.DecimalFormat;

/**
 * Created by Amanda on 17/09/2017.
 */
public class FilmeTBV {

    private SimpleStringProperty nomeFilme = new SimpleStringProperty();
    private SimpleStringProperty valorAluguel = new SimpleStringProperty();
    private DecimalFormat decFormato = new DecimalFormat("'R$' #,###,##0.00");

    public FilmeTBV adicionaFilme(Filme filme){
        FilmeTBV filmeTableView = new FilmeTBV();
        filmeTableView.setNomeFilme(filme.getNome());
        filmeTableView.setValorAluguel(decFormato.format(filme.getValorAluguel()));
        return filmeTableView;
    }

    public String getNomeFilme() {
        return nomeFilme.get();
    }

    public SimpleStringProperty nomeFilmeProperty() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme.set(nomeFilme);
    }

    public String getValorAluguel() {
        return valorAluguel.get();
    }

    public SimpleStringProperty valorAluguelProperty() {
        return valorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel.set(valorAluguel);
    }
}
