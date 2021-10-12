package Guia_6_POO.Ejercicio_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        Libro libro1 = new Libro(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        Libro libro1 = new Libro();
        Servicios serv = new Servicios();
        serv.datosLibros(libro1);
        serv.getDatos(libro1);
    }
}
