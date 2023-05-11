/**
 *Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden preparar
 * con los ingredientes disponibles en la cocina.
 *
 */

package Servicio;

import Entidad.Cocina;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCocina {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cocina recetaPredeterminada(Cocina receta){
        
        String nombre = "Huevos Fritos";
        ArrayList<String> aux = new ArrayList();
        aux.add("huevos");
        aux.add("sal");
        aux.add("aceite");
        receta.setIngredientes(aux);
        
        return new Cocina(nombre, aux);
    }

    public void buscarReceta(Cocina receta, ArrayList<Cocina> recetario) {
        System.out.println("Que ingrediente tiene?");
        String ing = leer.next();
        ArrayList<Cocina> aux1 = recetario;
        ArrayList<String> aux = receta.getIngredientes();
        boolean bandera = false;
        for (Cocina recetas : aux1) {
            for (String aux2 : aux) {
            if (aux2.equalsIgnoreCase(ing)) {
                bandera = true;
                System.out.println(recetas);
            }
        }
        }
        
        if (!bandera) {
           System.out.println("No se encontraron recetas en la base de datos.");
        }
    }
    
    public void mostrarReceta(Cocina receta, ArrayList<Cocina> recetario ){
        
        for (Cocina recetas : recetario) {
            System.out.println(recetas);
        }
    
    }

    public ArrayList<String> agregarIngredientes() {
        ArrayList<String> ingredientes = new ArrayList();
        String resp;
        String ingrediente;
        
        do {
           System.out.println("Agregue un ingrediente");
           ingrediente = leer.next();
           ingredientes.add(ingrediente);
            
            System.out.println("Desea agregar otro ingrediente? s/n");
            resp = leer.next();
            
        } while (resp.equalsIgnoreCase("s"));
        
        return ingredientes;
    }
    
    public Cocina crearReceta() {
        System.out.println("Qué receta desea crear?");
        String nombre = leer.next();
        return new Cocina(nombre);
    }

}
