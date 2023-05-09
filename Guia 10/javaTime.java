package DateClases;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class javaTime {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Fecha del dia de hoy
        System.out.println("Fecha del dia de hoy ---------->" + LocalDate.now());
        //La hora
        System.out.println("Hora actual ---------> " + LocalTime.now());
        //Fecha y hora
        System.out.println("Fecha y hora actual -----> " + LocalDateTime.now());
        //El momento actual
        System.out.println("El momento actual -------> " + Instant.now());
        //==================================== Uso de of =============================================
        System.out.println("Fecha de mi cumpleanios ------> " + LocalDate.of(2020, Month.DECEMBER, 31));
        //Con numeros en el mes
        System.out.println("Fecha de mi cumpleanios ------> " + LocalDate.of(2020,6, 30));
        //Hora exacta
        System.out.println("Hora exacta ------> " + LocalDateTime.of(1990, 5, 21, 12, 2, 34));
        

        //Extraer parte de la fecha
        System.out.println("anio actual -----> " + LocalDate.now().getYear());
        System.out.println("mes actual -----> " + LocalDate.now().getMonth());
        System.out.println("dia de la semana -----> " + LocalDate.now().getDayOfWeek());
        System.out.println("dia en numero -----> " + LocalDate.now().getDayOfMonth());
        //Concatenado mes, dia y anio
        System.out.println("Hoy es --> " + LocalDate.now().getDayOfWeek() + " " + LocalDate.now().getDayOfMonth() + " de " + LocalDate.now().getMonth() + " del anio " + LocalDate.now().getYear());
        
        //Comparar 
        if (LocalDate.now().getMonthValue() == 4) {
            System.out.println("Es el mes de Abril");
        }
        
        //Diferencia entre 2 fechas
        LocalDate fecha1 = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(2023, 2, 25);
        Period diferencia = fecha1.until(fecha2);
        System.out.println("La diferencia entre fecha1 " + fecha1 + " y la fecha2 " + fecha2 + " es igual = " + Math.abs(diferencia.getMonths()));
        
        //La clase LocalDate tiene los siguientes métodos:
        //plusDays(); //minusDays(); --->SUMA o RESTA dias a una fecha
        //plusWeeks() /// minusWeeks() ----> SUMA o RESTA semanas a un periodo
        //plusMonths() /// minusMonths() ----> SUMA o RESTA meses a un periodo
        //plusYears(); // minusYears() ----> SUMA o RESTA anios
        
        System.out.println("La fecha dentro de 15 dias... " + LocalDate.now().plusDays(15));
        System.out.println("La fecha y hora de hace 48 horas... " + LocalDateTime.now().minusHours(48));
        
        //TemporalAdjuster
        System.out.println("El primer dia del proximo mes es --> " + LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());
        
        //Tiempo transcurrido entre fechas y horas
        //java.time.temporal.TemporalUnit
        LocalDate fechaNacimiento = LocalDate.of(1975, 5, 18);
        System.out.println("La edad que tienes en anios es ---> " + ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now()));
        
        //Cuanto falta para fin de anio
        LocalDate hoy = LocalDate.now();//Creamos la fecha de hoy
        LocalDate finAnio = hoy.with(TemporalAdjusters.lastDayOfYear());//Creamos fin de anio
        Period hastaFinDeAnio = hoy.until(finAnio);
        int meses = hastaFinDeAnio.getMonths();
        int dias = hastaFinDeAnio.getDays();
        System.out.println("Faltan " + meses + " meses y " + dias + " dias hasta final de anio");
        
        System.out.println("hoy " + hoy);//hoy
        System.out.println("fin de anio  " + finAnio);//Fin de este anio

        //Parseado de fechas
        LocalDate fechaDeHoy = LocalDate.parse("2020-07-06");
        LocalDate sieteOctubre = LocalDate.parse("07/10/2020", DateTimeFormatter.ofPattern("d/M/yyyy"));
        
        System.out.println("La fecha de hoy ---> " + fechaDeHoy);
        System.out.println("Otra fecha ---> " + sieteOctubre);
        
        
        
        
    }
}
