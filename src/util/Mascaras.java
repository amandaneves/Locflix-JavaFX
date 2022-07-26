package util;

import javafx.scene.control.TextField;

/**
 * Created by Amanda on 17/09/2017.
 */
public class Mascaras {

    public static void setMascaraTelefone(TextField txf){
        setQuantidadeMaximaCaracteres(txf, 16);
        txf.lengthProperty().addListener((observable, oldValue, newValue) -> {
            String fone = txf.getText();
            fone = fone.replaceAll("[^0-9]", "");
            fone = fone.replaceFirst("(\\d)", "($1");
            fone = fone.replaceFirst("(\\d{2})(\\d)", "$1) $2");
            fone = fone.replaceFirst("(\\d{4})(\\d)", "$1-$2");
            if (fone.length() >= 15) {
                fone = fone.replaceAll("[^0-9]", "");
                fone = fone.replaceFirst("([0-9]{2})([0-9]{1})([0-9]{4})([0-9]{4})", "($1) $2.$3-$4");
            }
            txf.setText(fone);
        });
    }

    public static void setMascaraCep(TextField txf){
        setQuantidadeMaximaCaracteres(txf, 10);

        txf.lengthProperty().addListener( ( observable, oldValue, newValue ) -> {
            String cep = txf.getText();
            cep = cep.replaceAll( "[^0-9]", "" );
            cep = cep.replaceFirst( "(\\d{2})(\\d)", "$1.$2" );
            cep = cep.replaceFirst( "(\\d{3})(\\d)", "$1-$2" );
            txf.setText(cep);
        });
    }

    public static void setQuantidadeMaximaCaracteres(TextField txf, int quantidade) {
        txf.textProperty().addListener( ( observable, oldValue, newValue ) -> {
            if (newValue.length() > quantidade) {
                txf.setText(oldValue);
            }
        });
    }

}
