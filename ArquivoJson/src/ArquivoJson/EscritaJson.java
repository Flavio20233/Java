package ArquivoJson; 

import org.json.*;
import org.json.simple.parser.*;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

@SuppressWarnings("deprecation")
public class EscritaJson {


    @SuppressWarnings("unchercked")

    public static void main(String[] args){

        JSONObject jsonObject = new JSONObject();

        JSONParser parser = new JSONParser();

        String nome;
        String ultimonome;
        String cidade;
        String estado;
        
        FileWriter escreve = null;

        jsonObject.put("Nome","Flavio");
        jsonObject.put("ultimo nome","Oliveira");
        jsonObject.put("Cidade","Ceilandia");
        jsonObject.put("Estado","Brasilia");

        try{
            jsonObject = (JSONObject) parser.parse(new FileReader("saida.json"));
            nome = (String) jsonObject.get("Nome");
            ultimonome = (String) jsonObject.get("Ultimo Nome");
            cidade = (String) jsonObject.get("Cidade");
            estado = (String) jsonObject.get("Estado");

            System.out.println("O nome copletodele e "+nome  + 
            ultimonome + ", nascido em " + cidade + "do estado de " +
            estado + ".");



            // escreve = new FileWriter("saida.json");
            // escreve.write(jsonObject.toString());
            // escreve.close();
     
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        System.out.println(jsonObject);

            }
    }


    



