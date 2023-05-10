/**
 *Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden preparar
 * con los ingredientes disponibles en la cocina.
 * 
 */

package Entidad;

import java.util.ArrayList;


public class Cocina {
    
    private ArrayList <String> receta;

    public Cocina(ArrayList<String> receta) {
        this.receta = receta;
    }

    public Cocina() {
    }

    public ArrayList<String> getReceta() {
        return receta;
    }

    public void setReceta(ArrayList<String> receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "Receta{" + "receta=" + receta + '}';
    }

}
