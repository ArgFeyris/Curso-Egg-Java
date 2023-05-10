/**
 *Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden preparar
 * con los ingredientes disponibles en la cocina.
 *
 */

package Servicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ServicioCocina {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String[]> crearReceta(ArrayList<String[]> recetario) {
        String[] receta1 = new String[4];
        receta1[0]="Receta para preparar Fideos hervidos";
        receta1[1]="fideos";
        receta1[2]="sal";
        receta1[3]="manteca";
        
        String[] receta2 = new String[4];
        receta2[0]="Receta para preparar huevos fritos";
        receta2[1]="huevos";
        receta2[2]="sal";
        receta2[3]="aceite";
        
        recetario.add(receta1);
        recetario.add(receta2);
        return recetario;
    }

    public String[] agregarReceta(ArrayList<String[]> recetario) {

        System.out.println("¿Que receta desea agregar?");
        String nombre = leer.next();

        System.out.println("¿Cuántos ingredientes necesita para prepararlo?");
        int cantidad = leer.nextInt()+1;
        String[] receta = new String[cantidad];
        System.out.println("Agregue los ingredientes que se necesitan para"
                + " preparar " + nombre);
        receta[0]=("Receta para preparar "+nombre);
        for (int i = 1; i < (cantidad); i++) {
            receta[i]=leer.next();
        }
        recetario.add(receta);
        
        return receta;
    }

    public void buscarReceta() {

    }
    
    public void mostrarReceta(ArrayList<String[]> receta){
        
        for (String[] strings : receta) {
            System.out.println(Arrays.toString(strings));
        }
    
    }

}
