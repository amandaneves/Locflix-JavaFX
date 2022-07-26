package controller;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import model.Filme;
import model.Usuario;

import java.util.List;

/**
 * Created by Amanda on 14/08/2017.
 */
public class Locflix extends Application {

    public static ObservableList<Filme> filmesEscolhidos = FXCollections.observableArrayList();
    public static ObservableList<FilmeCTR> todosFilmes = FXCollections.observableArrayList();
    public static Usuario usuarioLocflix = new Usuario();

    @Override
    public void start(Stage primaryStage) throws Exception {
        PrincipalCTR frm = new PrincipalCTR();
        frm.setTitle("Locflix - Locadora de filmes");
        frm.setMaximized(true);
        frm.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
