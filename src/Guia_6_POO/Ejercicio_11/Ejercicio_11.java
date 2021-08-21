package Guia_6_POO.Ejercicio_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese fecha:");
//        dia = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Ingrese mes:");
//        mes = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Ingrese año:");
//        anio = sc.nextInt();
//        sc.nextLine();


        DateTimeFormatter orden = DateTimeFormatter.ofPattern("dd MM yyyy");
        
//        SimpleDateFormat orden = new SimpleDateFormat("dd MM yyyy hh mm ss");
//        Date date = new Date();
//        Date fecha = orden.parse(sc.nextLine() + " " + date.getHours() + " " + date.getMinutes() + " " + date.getSeconds());
//        System.out.println(fecha);
        LocalDate fecha = LocalDate.parse(sc.nextLine(), orden);
//        fecha = Calendar.getInstance().getTime();
        System.out.println(fecha);
        
//        Date fecha;
//        fecha = new Date(anio-1900,mes,dia);
//        System.out.println(fecha);
    }

}
