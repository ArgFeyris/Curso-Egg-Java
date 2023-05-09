/**
 *
 * 
 */

package Servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class ServicioPais {
    
    Scanner leer = new Scanner(System.in);
    
    public void agregarPaises(HashSet<String> paises){
        
        boolean bandera = true;
        
        do {
            System.out.println("Agregue un pais.");
        String nombre = leer.next();
        paises.add(nombre);
            System.out.println("¿Quiere agregar otro pais? s/n");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("n")) {
                bandera = false;
            }
        } while (bandera);
        
        
        
    }
    
    public void mostrarPaises(HashSet<String> paises){
        System.out.println("Los paises de la lista.");
        for (Object pais : paises) {
            System.out.println(pais);
        }
        
    }
    
    public void ordenarAlfabeticamente(HashSet<String> paises){
        System.out.println("Paises ordenados");
        ArrayList<String> orden = new ArrayList(paises);
        orden.sort(Comparator.naturalOrder());
        for (String string : orden) {
            System.out.println(string);
        }
    }
    
    public void eliminarPais (HashSet<String> paises){
        Iterator<String> it = paises.iterator();
        System.out.println("¿Que pais desea eliminar?");
        String eliminar = leer.next();
        boolean bandera = false;
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(eliminar)) {
                it.remove();
                bandera = true;
            }
        }
        if (bandera) {
            System.out.println("Pais eliminado.");
        }else {
            System.out.println("Pais no encontrado.");
        }
        
    }

}
