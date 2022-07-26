package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import javafx.stage.WindowEvent;
import model.Filme;
import model.FilmeTBV;
import util.jstage;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * Created by Amanda on 31/08/2017.
 */
public class ListaFilmesCTR extends jstage{

    @FXML
    private Button btnContinuar_escolhendo;

    @FXML
    private Button btnFinalizar_aluguel;

    @FXML
    private Button btnLimpar_lista;

    @FXML
    private TableView<FilmeTBV> tbvFilmes;

    @FXML
    private TableColumn<FilmeTBV, String> clnNome;

    @FXML
    private TableColumn<FilmeTBV, String> clnValor;

    @FXML
    private Label lblTotal;

    private Button btnLista_filmes;
    private ObservableList<FilmeTBV> filmes;
    private DecimalFormat decFormato = new DecimalFormat("'R$' #,###,##0.00");

    public ListaFilmesCTR(Button btnLista_filmes) {
        try {
            this.OnCreate("/view/ListaFilmesFRM.fxml");
            this.btnLista_filmes = btnLista_filmes;

            clnNome.setCellValueFactory(new PropertyValueFactory<FilmeTBV, String>("nomeFilme"));
            clnValor.setCellValueFactory(new PropertyValueFactory<FilmeTBV, String>("valorAluguel"));

            filmes = FXCollections.observableArrayList();
            BigDecimal valorTotalFilmes = new BigDecimal("0");
            for(Filme filme : Locflix.filmesEscolhidos){
                FilmeTBV filmeTableView = new FilmeTBV();
                filmes.add(filmeTableView.adicionaFilme(filme));
                valorTotalFilmes = valorTotalFilmes.add(filme.getValorAluguel());
            }

            tbvFilmes.setItems(filmes);
            lblTotal.setText(decFormato.format(valorTotalFilmes));
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

    @FXML
    void btnContinuar_escolhendo_Click(ActionEvent event) {
        this.close();
    }

    @FXML
    void btnFinalizar_aluguel_Click(ActionEvent event) {
        if(validaFilmes() && validaUsuario()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informação");
            alert.setHeaderText(null);
            alert.setContentText("Aluguel realizado com sucesso.");
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.showAndWait();
        }
    }

    @FXML
    void btnLimpar_lista_Click(ActionEvent event) {
        Locflix.filmesEscolhidos.clear();
        filmes.clear();
        lblTotal.setText("R$ 0,00");
        btnLista_filmes.setText("Minha lista de filmes (0)");
        for(FilmeCTR filme : Locflix.todosFilmes){
            filme.setTextBtnAdicionar("Adicionar");
        }
    }

    private boolean validaFilmes(){
        if(filmes.size() == 0){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Atenção");
            alert.setHeaderText(null);
            alert.setContentText("Não foi possível finalizar o aluguel, pois nenhum filme foi adicionado à sua lista.");
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.showAndWait();
            return false;
        } else{
            return true;
        }
    }

    private boolean validaUsuario(){
        if(Locflix.usuarioLocflix.getNomeCompleto().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Atenção");
            alert.setHeaderText("Não foi possível finalizar o aluguel.");
            alert.setContentText("Para finalizar o aluguel, é necessário se cadastrar no sistema.");
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.showAndWait();
            return false;
        } else {
            return true;
        }
    }


}
