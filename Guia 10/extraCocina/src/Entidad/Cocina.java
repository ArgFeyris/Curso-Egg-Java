/**
 *Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden preparar
 * con los ingredientes disponibles en la cocina.
 * 
 */

package Entidad;

import Servicio.ServicioCocina;
import java.util.ArrayList;


public class Cocina {
    
    ServicioCocina servicio = new ServicioCocina();
    
    private String nombreReceta;
    
    private ArrayList <String> ingredientes;

    public Cocina() {
    }

    public Cocina(String nombreReceta) {
        this.nombreReceta = nombreReceta;
        this.ingredientes = servicio.agregarIngredientes();
    }

    public Cocina(String nombreReceta, ArrayList<String> ingredientes) {
        this.nombreReceta = nombreReceta;
        this.ingredientes = ingredientes;
    }
    
    

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Cocina{" + "nombreReceta=" + nombreReceta + ", ingredientes=" + ingredientes + '}';
    }
    
    
}
