/**
 *Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden preparar
 * con los ingredientes disponibles en la cocina.
 */

package extracocina;

import Entidad.Cocina;
import Servicio.ServicioCocina;
import java.util.ArrayList;


public class ExtraCocina {

    public static void main(String[] args) {
        
        Cocina cocina = new Cocina();
        ArrayList<String[]> receta = new ArrayList();
        ServicioCocina servicio = new ServicioCocina();
        
        servicio.crearReceta(receta);
        servicio.agregarReceta(receta);
        servicio.mostrarReceta(receta);
        
        
    }

}
