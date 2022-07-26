package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.FileChooser;
import javafx.stage.WindowEvent;
import util.Mascaras;
import util.jstage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by Amanda on 23/08/2017.
 */
public class UsuarioCTR extends jstage{

    @FXML
    private AnchorPane acpFundo;

    @FXML
    private TextField txfNome_completo;

    @FXML
    private DatePicker dtpNascimento;

    @FXML
    private TextField txfFone_fixo;

    @FXML
    private TextField txfFone_celular;

    @FXML
    private TextField txfEndereco;

    @FXML
    private TextField txfNumero;

    @FXML
    private ImageView ivwFoto;

    @FXML
    private Button btnAdicionar_foto;

    @FXML
    private TextField txfBairro;

    @FXML
    private TextField txfCidade;

    @FXML
    private ComboBox<String> cbxUf;

    @FXML
    private TextField txfCep;

    @FXML
    private TextField txfEmail;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSalvar;

    @FXML
    private AnchorPane acpRodape;

    private ImageView fotoDoUsuarioPrincipal;
    private Button btnUsuario;
    private Image fotoPadrao = new Image("view/icons/icnFoto.png");
    private Image fotoUsuario = fotoPadrao;
    private ObservableList<String> ufs = FXCollections.observableArrayList("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");

    public UsuarioCTR(Button btnUsuario, ImageView fotoDoUsuarioPrincipal) {
        try {
            this.OnCreate("/view/UsuarioFRM.fxml");

            this.fotoDoUsuarioPrincipal = fotoDoUsuarioPrincipal;
            this.btnUsuario = btnUsuario;
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

        Mascaras.setQuantidadeMaximaCaracteres(txfNome_completo, 100);
        Mascaras.setQuantidadeMaximaCaracteres(txfEndereco, 100);
        Mascaras.setQuantidadeMaximaCaracteres(txfNumero, 15);
        Mascaras.setQuantidadeMaximaCaracteres(txfBairro,80);
        Mascaras.setQuantidadeMaximaCaracteres(txfCidade, 80);
        Mascaras.setQuantidadeMaximaCaracteres(txfEmail, 80);
        Mascaras.setMascaraTelefone(txfFone_fixo);
        Mascaras.setMascaraTelefone(txfFone_celular);
        Mascaras.setMascaraCep(txfCep);
        cbxUf.setItems(ufs);
        cbxUf.setVisibleRowCount(4);

        if(Locflix.usuarioLocflix.getNomeCompleto().isEmpty()) {
            cbxUf.getSelectionModel().select(12);
            ivwFoto.setImage(fotoPadrao);
            // Setando a data mínima para o cadastro
            dtpNascimento.setValue(LocalDate.now().minusYears(16));
        } else {
            txfNome_completo.setText(Locflix.usuarioLocflix.getNomeCompleto());
            dtpNascimento.setValue(Locflix.usuarioLocflix.getDtNascimento());
            txfFone_fixo.setText(Locflix.usuarioLocflix.getTelefoneFixo());
            txfFone_celular.setText(Locflix.usuarioLocflix.getCelular());
            txfEndereco.setText(Locflix.usuarioLocflix.getEndereco());
            txfNumero.setText(Locflix.usuarioLocflix.getNumero());
            txfBairro.setText(Locflix.usuarioLocflix.getBairro());
            txfCidade.setText(Locflix.usuarioLocflix.getCidade());
            cbxUf.getSelectionModel().select(Locflix.usuarioLocflix.getUf());
            txfCep.setText(Locflix.usuarioLocflix.getCep());
            txfEmail.setText(Locflix.usuarioLocflix.getEmail());

            fotoUsuario = Locflix.usuarioLocflix.getFoto();
            ivwFoto.setImage(Locflix.usuarioLocflix.getFoto());

            if(!fotoUsuario.getPixelReader().getPixelFormat().equals(fotoPadrao.getPixelReader().getPixelFormat())){
                btnAdicionar_foto.setText("Remover Foto");
            }
        }
    }

    @FXML
    void btnAdicionar_foto_Click(ActionEvent event) {
        if(fotoUsuario.getPixelReader().getPixelFormat().equals(fotoPadrao.getPixelReader().getPixelFormat())){
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Selecione sua Foto");
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Imagens e Fotos", "*.png", "*.jpg", "*.jpeg"));
            File arquivoSelecionado = fileChooser.showOpenDialog(this);

            if(arquivoSelecionado != null){
                fotoUsuario = new Image(arquivoSelecionado.toURI().toString());
                ivwFoto.setImage(fotoUsuario);
                btnAdicionar_foto.setText("Remover Foto");
            }

        } else {
            ivwFoto.setImage(fotoPadrao);
            fotoUsuario = fotoPadrao;
            btnAdicionar_foto.setText("Adicionar Foto");
        }
    }

    @FXML
    void btnLimpar_Click(ActionEvent event) {
        txfNome_completo.clear();
        dtpNascimento.setValue(LocalDate.now().minusYears(16));
        txfFone_fixo.clear();
        txfFone_celular.clear();
        txfEndereco.clear();
        txfNumero.clear();
        txfBairro.clear();
        txfCidade.clear();
        cbxUf.getSelectionModel().select(12);
        txfCep.clear();
        txfEmail.clear();
        ivwFoto.setImage(fotoPadrao);
        fotoUsuario = fotoPadrao;
        btnAdicionar_foto.setText("Adicionar Foto");
    }

    @FXML
    void btnSalvar_Click(ActionEvent event) {
        if (!validarDadosDoUsuario() || !validarIdadeDoUsuario()){
            return;
        }

        Locflix.usuarioLocflix.setNomeCompleto(txfNome_completo.getText());
        Locflix.usuarioLocflix.setDtNascimento(dtpNascimento.getValue());
        Locflix.usuarioLocflix.setTelefoneFixo(txfFone_fixo.getText());
        Locflix.usuarioLocflix.setCelular(txfFone_celular.getText());
        Locflix.usuarioLocflix.setEndereco(txfEndereco.getText());
        Locflix.usuarioLocflix.setNumero(txfNumero.getText());
        Locflix.usuarioLocflix.setBairro(txfBairro.getText());
        Locflix.usuarioLocflix.setCidade(txfCidade.getText());
        Locflix.usuarioLocflix.setUf(cbxUf.getSelectionModel().getSelectedItem());
        Locflix.usuarioLocflix.setCep(txfCep.getText());
        Locflix.usuarioLocflix.setEmail(txfEmail.getText());
        Locflix.usuarioLocflix.setFoto(fotoUsuario);

        if(txfNome_completo.getText().contains(" ")){
            btnUsuario.setText(txfNome_completo.getText().substring(0, txfNome_completo.getText().indexOf(" ")));
        } else {
            btnUsuario.setText(txfNome_completo.getText());
        }

        if(fotoUsuario.equals(fotoPadrao)){
            fotoDoUsuarioPrincipal.setImage(new Image("view/icons/icnUsuario.png"));
        } else {
            fotoDoUsuarioPrincipal.setImage(fotoUsuario);
        }

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText("Cadastro realizado com sucesso.");
        alert.showAndWait();
    }

    private boolean validarDadosDoUsuario(){
        String campos = "";
        boolean podeAdicionar = true;

        if(txfNome_completo.getText().trim().isEmpty()){
            campos = "Nome completo";
            podeAdicionar = false;
        }
        if(dtpNascimento.getValue() == null){
            campos += campos.length() >= 1 ? ", " : "";
            campos += "Data de nascimento";
            podeAdicionar = false;
        }
        if(txfFone_celular.getText().trim().isEmpty() && txfFone_fixo.getText().trim().isEmpty()){
            campos += campos.length() >= 1 ? ", " : "";
            campos += "Telefone(s) (celular e/ou fixo)";
            podeAdicionar = false;
        }
        if(txfEndereco.getText().trim().isEmpty()){
            campos += campos.length() >= 1 ? ", " : "";
            campos += "Endereço";
            podeAdicionar = false;
        }
        if(txfNumero.getText().trim().isEmpty()){
            campos += campos.length() >= 1 ? ", " : "";
            campos += "Número";
            podeAdicionar = false;
        }
        if(txfBairro.getText().trim().isEmpty()){
            campos += campos.length() >= 1 ? ", " : "";
            campos += "Bairro";
            podeAdicionar = false;
        }
        if(txfCidade.getText().trim().isEmpty()){
            campos += campos.length() >= 1 ? ", " : "";
            campos += "Cidade";
            podeAdicionar = false;
        }

        if(!podeAdicionar){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Não foi possível concluir o cadastro.");
            alert.setContentText("É preciso informar o(s) seguinte(s) campo(s): " + campos + ".");
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.showAndWait();
        }

        return podeAdicionar;
    }

    private boolean validarIdadeDoUsuario(){
        boolean temMaisDe16 = true;
        if(dtpNascimento.getValue().compareTo(LocalDate.now().minusYears(16)) > 0){
            temMaisDe16 = false;
        }

        if(!temMaisDe16){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Não foi possível concluir o cadastro.");
            alert.setContentText("O usuário deve ter mais de 16 anos para alugar filmes.");
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.showAndWait();
        }

        return temMaisDe16;
    }

}
