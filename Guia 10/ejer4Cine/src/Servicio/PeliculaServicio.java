/**
 *En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole
 * al usuario  todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
 * usuario si quiere  crear otra Pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 *
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla.  *
 * .
 *
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in);

    public void crearPelicula(ArrayList<Pelicula> peliculas) {

        boolean repetir = true;

        while (repetir) {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula.");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director.");
            pelicula.setDirector(leer.next());
            System.out.println("¿Cuanto dura la pelicula?");
            pelicula.setDuracion(leer.nextInt());

            peliculas.add(pelicula);

            System.out.println("¿Desea agregar otra pelicula? s/n");
            repetir = leer.next().equalsIgnoreCase("s");
        }

    }

    public void mostrarPelicula(ArrayList<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }

    public void mostrar2(ArrayList<Pelicula> peliculas) {
        peliculas.stream().filter((pelicula) -> (pelicula.getDuracion() > 1)).forEachOrdered((pelicula) -> {
            System.out.println("Pelicula mayor a 1 hora: " + pelicula);
        });

    }

    /*
    
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
pantalla. 
     */
    public void ordenarPeliculaDescendente(ArrayList<Pelicula> peliculas) {
        System.out.println("Orden descendente segun duracion.");
        peliculas.sort(Comparator.comparing(Pelicula::getDuracion).reversed());
        mostrarPelicula(peliculas);
    }

    public void ordenarPeliculaAscendente(ArrayList<Pelicula> peliculas) {
        System.out.println("Orden ascendente segun duracion");
        peliculas.sort(Comparator.comparing(Pelicula::getDuracion));
        mostrarPelicula(peliculas);

    }

    /*
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarPorTitulo(ArrayList<Pelicula> peliculas) {
        System.out.println("Orden segun Titulo.");
        peliculas.sort(Comparator.comparing(Pelicula::getTitulo));
        mostrarPelicula(peliculas);
    }

    /*
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
     */
    public void ordenarPorDirector(ArrayList<Pelicula> peliculas) {
        System.out.println("Orden segun Director.");
        peliculas.sort(Comparator.comparing(Pelicula::getDirector));
        mostrarPelicula(peliculas);
    }

}
