import java.text.SimpleDateFormat;

public class Pao extends Produto{
    private String tipoPao;
}
    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }
    @Override
    @SuppressWarnings("deprecation")
    public String validade (Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/mm/yyyy");

        fabricacao fs.format (fabricacao);

    }

}

