package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.WindowEvent;
import model.Filme;
import util.jstage;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Created by Amanda on 03/09/2017.
 */
public class InformacoesFilmeCTR extends jstage{

    @FXML
    private ImageView imgCapa;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblSinopse;

    @FXML
    private Label lblData_lancamento;

    @FXML
    private Label lblDuracao;

    @FXML
    private ImageView imgClassificacao;

    @FXML
    private Label lblValor_aluguel;

    private DecimalFormat decFormato = new DecimalFormat("'R$' #,###,##0.00");

    public InformacoesFilmeCTR(Filme filme) {
        try {
            this.OnCreate("/view/InformacoesFilmeFRM.fxml");

            this.imgCapa.setImage(filme.getCapaOriginal());
            this.lblNome.setText(filme.getNome());
            this.lblSinopse.setText(filme.getSinopse());
            this.lblData_lancamento.setText(filme.getDataLancamento());
            this.lblDuracao.setText(filme.getDuracao());
            this.imgClassificacao.setImage(filme.getClassificacao());
            this.lblValor_aluguel.setText(decFormato.format(filme.getValorAluguel()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void OnCreate(String fxml) throws IOException {
        super.OnCreate(fxml);
    }

    @Override
    public void OnShow(WindowEvent e) {
        super.OnShow(e);
    }
}
