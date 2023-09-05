package dispositivos;

import dispositivos.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class Tester {
    public static void main(String[] args) throws Exception {
        //Se instancian las clases
        Clase_Padre P = new Clase_Padre();
        Limpieza L = new Limpieza();
        Suministros S = new Suministros();
        Triggers T = new Triggers();
        

        String amanecer = "{\"nombre\":\"Amanecer\", \"hora\":6}";
        String anochecer = "{\"nombre\":\"Anochecer\", \"hora\":18}";

        Gson gson  = new Gson();

        JsonObject jsonObject = gson.fromJson(amanecer, JsonObject.class);

        String nombre = jsonObject.get("nombre").getAsString();
        int hora = jsonObject.get("hora").getAsInt(); // "Hora" debe coincidir con la clave en el JSON

        System.out.println(hora);
    }
}

