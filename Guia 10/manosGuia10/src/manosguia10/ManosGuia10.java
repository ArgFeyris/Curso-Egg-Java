/**
 *
 */
package manosguia10;

import Entidad.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ManosGuia10 {

    public static void main(String[] args) {

        //Listas.
        ArrayList<Integer> listaNumerica = new ArrayList();
        //Datos de tipo primitivo int. Para añadir usamos .add
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;
        int numero5 = 50;
        //Añadimos 5 elementos.
        listaNumerica.add(numero1);
        listaNumerica.add(numero2);
        listaNumerica.add(numero3);
        listaNumerica.add(numero4);
        listaNumerica.add(numero5);
        //Recorremos y mostramos el ArrayList utilizando el bucle for each.
        for (Integer integer : listaNumerica) {
            System.out.println(integer);//nueva variable creada dentro del bucle
        }

        //Eliminamos un elemento. Se puede usar .remove(indice) ó .remove(elemento).
        listaNumerica.remove(0);//utilizo el indice.
        //Integer remove = listaNumerica.remove(numero2); //esta linea da error.

        //mostramos nuevamente
        System.out.println("Muestro despues de eliminar.");
        for (Integer arraylist : listaNumerica) {
            System.out.println(arraylist);//nueva variable creada dentro del bucle
        }

        System.out.println("-------------------------------------------------");
        //Conjuntos.
        HashSet<Integer> conjuntoNumerico = new HashSet();
        //Datos de tipo Integer. Para añadir usamos .add
        Integer num1 = 10;
        Integer num2 = 20;
        Integer num3 = 30;
        Integer num4 = 40;
        Integer num5 = 50;
        //Añado los elementos.
        conjuntoNumerico.add(num1);
        conjuntoNumerico.add(num2);
        conjuntoNumerico.add(num3);
        conjuntoNumerico.add(num4);
        conjuntoNumerico.add(num5);
        //Recorremos y mostramos el conjunto igual que con el ArrayList.
        for (Integer conjunto : conjuntoNumerico) {
            System.out.println(conjunto);
        }

        /*Elimino un elemento. Ya que los conjuntos no constan de índices,
      solo se puede borrar por elemento. Puedo usar el valor de la variable.
         */
        conjuntoNumerico.remove(10);//Este método remueve la primera aparición
        //de un elemento a borrar en un  conjunto.
        System.out.println("Muestro despues de eliminar.");
        //volvemos a mostrar.
        for (Integer conjunto : conjuntoNumerico) {
            System.out.println(conjunto);
        }

        System.out.println("-------------------------------------------------");
        //Mapas.
        HashMap<Integer, String> mapaPersonas = new HashMap();
        //Se necesitan dos valores. Datos primitivos. Para añadir usamos .put
        int dni1 = 12345678;
        String nombre1 = "pepe";
        mapaPersonas.put(dni1, nombre1);
        int dni2 = 12345698;
        String nombre2 = "pepa";
        mapaPersonas.put(dni2, nombre2);
        int dni3 = 12345612;
        String nombre3 = "pipa";
        mapaPersonas.put(dni3, nombre3);
        int dni4 = 12345634;
        String nombre4 = "fluflu";
        mapaPersonas.put(dni4, nombre4);
        int dni5 = 12345123;
        String nombre5 = "papo";
        mapaPersonas.put(dni5, nombre5);

        /*
    Para recorrer mapas vamos a tener que usar el objeto Map.Entry en el for
    each. A través del entry  vamos a traer los valores y las llaves, si no,
    podemos tener un for each para cada parte de nuestro  mapa sin utilizar 
    el objeto Map.Entry.
         */
        //con Map.Entry
        for (Map.Entry<Integer, String> entry : mapaPersonas.entrySet()) {
            System.out.println("Documento: " + entry.getKey() + ", nombre: "
                    + entry.getValue());
        }
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        //sin Map.Entry
        //se muestran las variables locales.
        //mostrar dni.
        for (Integer integer : mapaPersonas.keySet()) {
            System.out.println("El dni: " + integer);
        }
        //mostrar sombre.
        for (String nombre : mapaPersonas.values()) {
            System.out.println("Nombre: " + nombre);
        }
        //Eliminamos un elemento. Para eliminar, usamos el valor de la llave.
        mapaPersonas.remove(12345678);//Este método remueve la primera aparición
        //de la llave de un elemento a borrar en  un mapa.
        System.out.println("Muestro despues de eliminar.");

        //con Map.Entry
        for (Map.Entry<Integer, String> entry : mapaPersonas.entrySet()) {
            System.out.println("Documento: " + entry.getKey() + ", nombre: "
                    + entry.getValue());
        }
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        //mostrar dni.
        for (Integer integer : mapaPersonas.keySet()) {
            System.out.println("El dni: " + integer);
        }
        //mostrar sombre.
        for (String nombre : mapaPersonas.values()) {
            System.out.println("Nombre: " + nombre);
        }
        
        System.out.println("____________________________________________________");
        System.out.println("creo una clase Libro y trabajo con ella.");
        
        ArrayList<Libro> libros = new ArrayList();
        Libro libro = new Libro("El Principito");
        Libro libro2 = new Libro ("El Alquimista");
        Libro libro3 = new Libro ("El Hobbit");
        
        libros.add(libro);
        libros.add(libro2);
        libros.add(libro3);
        
        for (Libro ejemplar : libros) {
          System.out.println(ejemplar); 
        }
       
        //fin.
        
    }

}
