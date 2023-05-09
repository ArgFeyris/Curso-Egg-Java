/**

 */

package ejer6negocio;

import Servicio.ServicioNegocio;
import java.util.HashMap;
import java.util.Scanner;


public class Ejer6Negocio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Double> producto = new HashMap();
        ServicioNegocio servicio = new ServicioNegocio();
        int opciones = 0;
        
        producto.put("Arroz", 300.0);
        producto.put("Fideo", 250.0);
        
        
        do {
            System.out.println("MENU");
            
            
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            opciones = leer.nextInt();
            
            
            switch (opciones) {
                case 1:
                    servicio.agregarProducto(producto);
                    break;
                case 2:
                    servicio.modificarPrecio(producto);
                    break;
                case 3:
                    servicio.eliminarProducto(producto);
                    break;
                case 4:
                    servicio.mostrarProductos(producto);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
            
        } while (opciones != 5);
        
        
        
    }

}
