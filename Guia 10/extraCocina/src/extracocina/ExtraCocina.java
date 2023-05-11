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
import java.util.Scanner;

public class ExtraCocina {

    public static void main(String[] args) {

        /**
         * correr y verificar
         * tiene errores al buscar
         */
        Scanner leer = new Scanner(System.in);
        Cocina cocina = new Cocina();
        ArrayList<Cocina> recetario = new ArrayList();
        ServicioCocina servicio = new ServicioCocina();
        int opc = 0;
        recetario.add(servicio.recetaPredeterminada(cocina));

        do {
            System.out.println("MENU");
            System.out.println("1. Agregar Receta.");
            System.out.println("2. Mostrar Todas las Recetas.");
            System.out.println("3. Buscar Receta.");
            System.out.println("4. Salir.");
            opc = leer.nextInt();

            
            switch (opc) {
                case 1:
                    recetario.add(servicio.crearReceta());
                    break;
                case 2:
                    servicio.mostrarReceta(cocina, recetario);
                    break;
                case 3:
                    servicio.buscarReceta(cocina, recetario);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion erronea.");
                    break;
            }
        } while (opc != 4);

    }
}
