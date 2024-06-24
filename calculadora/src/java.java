

import javax.text.ParseException;
import java.text.Format;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class java {
    public static void main(String[]orgs) {
    String padrao = "##,###-###";
    String cep = "12345678";

    System.out.println(FormataCep(String cep, String padrao) {
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padrao);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cep);
        } catch (ParseException e ) {
            throw new RuntimeException(e);

        }
    }
    public Format
       

}
