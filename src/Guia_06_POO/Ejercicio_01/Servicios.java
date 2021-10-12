package Guia_6_POO.Ejercicio_01;

import java.util.Scanner;

public class Servicios {
    
    public void datosLibros(Libro libro){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número ISBN: ");
        libro.setIsbn(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el título: ");
        libro.setTitulo(sc.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        libro.setAutor(sc.nextLine());
        System.out.println("Ingrese el número de páginas: ");
        libro.setNumPag(sc.nextInt());
        sc.nextLine();
    }
    
    public void getDatos(Libro libro){
        System.out.println("ISBN: "+libro.getIsbn());;
        System.out.println("Título: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Número de páginas: "+libro.getNumPag());
    }
}
