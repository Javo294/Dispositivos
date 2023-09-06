package dispositivos;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Tu JSON como una cadena
        String amanecer = "{\"nombre\":\"Amanecer\", \"hora\":6, \"dias\":[\"lunes\",\"martes\",\"miercoles\",\"jueves\",\"sabado\",\"domingo\"]}";
        String anochecer = "{\"nombre\":\"Anochecer\", \"hora\":18, \"dias\":[\"lunes\",\"martes\",\"miercoles\",\"jueves\",\"sabado\",\"domingo\"]}";
        
        // Crear un objeto Gson
        Gson gson = new Gson();

        // Parsear el JSON en un objeto JsonObject (ObjetoAmanecer)
        JsonObject ObjetoAmanecer = gson.fromJson(amanecer, JsonObject.class);
        JsonObject ObjetoAnochecer = gson.fromJson(anochecer, JsonObject.class);

        // Acceder a los atributos
        String nombre = ObjetoAmanecer.get("nombre").getAsString();
        int hora = ObjetoAmanecer.get("hora").getAsInt();
        JsonArray diasArray = ObjetoAmanecer.get("dias").getAsJsonArray();

        // Ahora tienes los valores en las variables nombre, hora y dias
        System.out.println("Nombre: " + nombre);
        System.out.println("hora: " + hora);
        System.out.println("dias: " + diasArray);
    }
}
