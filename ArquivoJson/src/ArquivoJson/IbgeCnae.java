package ArquivoJson;

import javax.json.Json;
import javax.json.JsonObject;


public class IbgeCnae {
    public static void main(String[] args) {
    JsonObject arquivoJson = Json.createObjectBuilder().add("Nome","Flavio")
        .add("Telefone",Json.createArrayBuilder().add(Json.createArrayBuilder()
        .add("Tipo","residencial")))
        .add("Ultimo nome","Barbosa")
        .add("Cidade","Ceilandia")
        .add("Estado","Brasilia").build();


        System.err.println(arquivoJson);


        }

}
