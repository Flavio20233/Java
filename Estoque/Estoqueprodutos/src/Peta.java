import java.text.SimpleDateFormat;

public class Peta extends Produto {
    private String sabor;

    public String getsabor(){
        return sabor;

    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
     @Override
    @SuppressWarnings("deprecation")
    public String validade (Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/mm/yyyy");

        fabricaco fs.format (fabricacao);

}
public double venda (int pacote){
    return pacote * 6.70;
}
public double venda (double quilo, int id){
    return quilo * 15.45;
}