/**
 *
 * 
 */

package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAlumno(ArrayList<Alumno> alumnos){
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese las tres notas.");
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            
            System.out.println("¿Desea crear mas alumnos?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s"));
        
        
    }
    
    public void mostrarAlumno(ArrayList<Alumno> alumnos){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        
        
    }
    
    public void notaFinal(ArrayList<Alumno> alumnos){
        System.out.println("¿De que alumno desea obtener la nota?");
        String nombre = leer.next();
        int aux=0;
        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                for (int nota : alumno.getNotas()) {
                    
                    aux += nota;
                }
                
                System.out.println("El promedio es: "+aux/3);
            }
            
        }
        if (!encontrado) {
            System.out.println("El alumno no se encontró.");
        }
    }

}
