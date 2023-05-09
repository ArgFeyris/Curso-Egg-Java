/**
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El  programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y  después se le preguntará al usuario si quiere
 * guardar otro perro o si quiere salir. Si decide  salir, se mostrará todos
 * los perros guardados en el ArrayList.  *
 * 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá  un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista.  Si el perro  está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista  ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
package ejer1y2collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer1y2Collections {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList();
        
        String resp;
        do {

            System.out.println("Agregue una raza de perro.");
            String raza = leer.next();
            perros.add(raza);

            System.out.println("¿Desea agregar otra raza de perro?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("s"));

        System.out.println("Acontinuacion se muestra su lista de razas");
        for (String perro : perros) {
            System.out.println(perro);
        }

        System.out.println("_______________________________________________");

        System.out.println("¿Desea eliminar una raza?");
        String resp2 = leer.next();
        String resp3;
        boolean bandera = false;

        do {

            if (resp2.equalsIgnoreCase("s")) {
                /**
                 * iterator creado dentro del bucle para que funcione
                 * leer eliminar tambien dentro del bucle para que funcione
                 */
                System.out.println("¿Que raza desea eliminar?");
                String eliminar = leer.next();
                Iterator<String> it = perros.iterator();
                while (it.hasNext()) {
                    String aux = it.next();
                    if (aux.equalsIgnoreCase(eliminar)) {
                        it.remove();
                        bandera = true;
                    }

                }

            }
            if (bandera) {
                System.out.println("Raza eliminada.");
                System.out.println("________________________________");
                System.out.println("Su lista actualizada y ordenada.");
                perros.sort(Comparator.naturalOrder());
                for (String perro : perros) {
                    System.out.println(perro);
                }
            } else {

                System.out.println("No se encontró la raza.");
                System.out.println("________________________________");
                System.out.println("Su lista actualizada y ordenada.");
                perros.sort(Comparator.naturalOrder());
                for (String perro : perros) {
                    System.out.println(perro);
                }

            }
            System.out.println("**************************");
            System.out.println("¿Desea eliminar otra raza?");
            resp3 = leer.next();

        } while (resp3.equalsIgnoreCase("s"));

        System.out.println("_________________________________________________");
        System.out.println("Su lista ordenada.");
        perros.sort(Comparator.naturalOrder());
        for (String perro : perros) {
            System.out.println(perro);

        }
    }

}
