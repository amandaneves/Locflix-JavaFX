package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import model.Filme;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Created by Amanda on 16/08/2017.
 */
public class FilmeCTR extends AnchorPane {

    @FXML
    private ImageView imgCapa_menor;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblSinopse_resumo;

    @FXML
    private Label lblValor_aluguel;

    @FXML
    private Button btnAdicionar;

    @FXML
    private Button btnMais_info;

    private Filme filme;
    private Button btnLista_filmes;
    private DecimalFormat decFormato = new DecimalFormat("'R$' #,###,##0.00");

    public FilmeCTR(Filme filme, Button btnLista_filmes) {
        super();
        this.btnLista_filmes = btnLista_filmes;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FilmeFRM.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();

            this.filme = filme;
            this.imgCapa_menor.setImage(filme.getCapaMenor());
            this.lblNome.setText(filme.getNome());
            this.lblSinopse_resumo.setText(filme.getSinopse());
            this.lblValor_aluguel.setText(decFormato.format(filme.getValorAluguel()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAdicionar_Click(ActionEvent event) {
        if(btnAdicionar.getText().equals("Adicionar")){
            Locflix.filmesEscolhidos.add(this.filme);
            btnLista_filmes.setText("Minha lista de filmes ("+Locflix.filmesEscolhidos.size() + ")");
            btnAdicionar.setText("Cancelar");
        } else {
            Locflix.filmesEscolhidos.remove(this.filme);
            btnLista_filmes.setText("Minha lista de filmes ("+Locflix.filmesEscolhidos.size() + ")");
            btnAdicionar.setText("Adicionar");
        }
    }

    @FXML
    void btnMais_info_Click(ActionEvent event) {
        InformacoesFilmeCTR infoFilmeCTR = new InformacoesFilmeCTR(filme);
        infoFilmeCTR.setTitle("Informações do Filme");
        infoFilmeCTR.setResizable(false);
        infoFilmeCTR.initModality(Modality.APPLICATION_MODAL);
        infoFilmeCTR.showAndWait();
    }

    public void setTextBtnAdicionar(String text) {
        this.btnAdicionar.setText(text);
    }
}
