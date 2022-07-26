package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import model.Dados;
import util.jstage;

import java.io.IOException;

/**
 * Created by Amanda on 14/08/2017.
 */
public class PrincipalCTR extends jstage {

    @FXML
    private Button btnLista_filmes;

    @FXML
    private Button btnCadastro;

    @FXML
    private ImageView ivwFoto_usuario;

    @FXML
    private HBox hbxLancamentos;

    @FXML
    private HBox hbxMais_alugados;

    @FXML
    private HBox hbxAcao;

    @FXML
    private HBox hbxComedias;

    @FXML
    private HBox hbxDocumentarios;

    @FXML
    private HBox hbxDrama;

    @FXML
    private HBox hbxFiccao_cientifica;

    @FXML
    private HBox hbxRomance;

    @FXML
    private HBox hbxTerror;

    public PrincipalCTR() {
        try {
            this.OnCreate("/view/PrincipalFRM.fxml");

            new Dados().preencheDados(btnLista_filmes);
            hbxLancamentos.getChildren().addAll(Locflix.todosFilmes.subList(0,10));
            hbxAcao.getChildren().addAll(Locflix.todosFilmes.subList(10,20));
            hbxComedias.getChildren().addAll(Locflix.todosFilmes.subList(20,30));
            hbxDocumentarios.getChildren().addAll(Locflix.todosFilmes.subList(30,40));
            hbxDrama.getChildren().addAll(Locflix.todosFilmes.subList(40,50));
            hbxFiccao_cientifica.getChildren().addAll(Locflix.todosFilmes.subList(50,60));
            hbxRomance.getChildren().addAll(Locflix.todosFilmes.subList(60,70));
            hbxTerror.getChildren().addAll(Locflix.todosFilmes.subList(70,80));
            hbxMais_alugados.getChildren().addAll(Locflix.todosFilmes.subList(80,90));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnCadastro_Click(ActionEvent event) {
        UsuarioCTR ctr = new UsuarioCTR(btnCadastro, ivwFoto_usuario);
        ctr.setTitle("Configuração de usuário");
        ctr.setResizable(false);
        ctr.initModality(Modality.APPLICATION_MODAL);
        ctr.show();
    }

    @FXML
    void btnLista_filmes_Click(ActionEvent event) {
        ListaFilmesCTR ctr = new ListaFilmesCTR(btnLista_filmes);
        ctr.setTitle("Minha lista de filmes");
        ctr.setResizable(false);
        ctr.initModality(Modality.APPLICATION_MODAL);
        ctr.show();
    }

    @FXML
    void acpPrincipal_Pressed(KeyEvent event) {
        if(event.getCode().equals(KeyCode.F4)){
            btnLista_filmes.fire();
        }
        if(event.isControlDown() && event.getCode().equals(KeyCode.U)){
            btnCadastro.fire();
        }
    }

}
