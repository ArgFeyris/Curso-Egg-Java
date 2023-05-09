/**
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto,  tendremos una clase Pelicula con el título, director y duración
 * de la película (en horas).
 * Implemente las clases y métodos necesarios para esta situación,
 * teniendo en cuenta lo  que se pide a continuación: 
 

 */

package ejer4cine;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;


public class Ejer4Cine {

    public static void main(String[] args) {
        
        ArrayList<Pelicula> pelicula = new ArrayList<>();
        
        PeliculaServicio servicio = new PeliculaServicio();
        pelicula.add(new Pelicula("titanic", "pepe", 3));
        pelicula.add(new Pelicula("titanic2", "pepe", 4));
        pelicula.add(new Pelicula("titanic3", "pepe", 1));
        //servicio.crearPelicula(pelicula);
        
        servicio.mostrarPelicula(pelicula);
        servicio.mostrar2(pelicula);
        servicio.ordenarPeliculaDescendente(pelicula);
        servicio.ordenarPeliculaAscendente(pelicula);
        servicio.ordenarPorTitulo(pelicula);
        servicio.ordenarPorDirector(pelicula);
        
    }

}
