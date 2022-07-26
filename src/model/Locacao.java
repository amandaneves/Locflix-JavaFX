package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Amanda on 16/08/2017.
 */
public class Locacao {

    private Filme filme = new Filme();
    private Date dtInicial;
    private Date dtFinal;
    private BigDecimal vlFinal;

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Date getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(Date dtInicial) {
        this.dtInicial = dtInicial;
    }

    public Date getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(Date dtFinal) {
        this.dtFinal = dtFinal;
    }

    public BigDecimal getVlFinal() {
        return vlFinal;
    }

    public void setVlFinal(BigDecimal vlFinal) {
        this.vlFinal = vlFinal;
    }
}
