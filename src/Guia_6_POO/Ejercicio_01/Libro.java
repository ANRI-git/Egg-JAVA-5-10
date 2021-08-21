package Guia_6_POO.Ejercicio_01;

import java.util.Scanner;

public class Libro {
    private Integer isbn;
    private String titulo;
    private String autor;
    private Integer numPag;
    Scanner sc = new Scanner(System.in);
    
    public Libro() {
    }

    public Libro(Integer isbn, String titulo, String autor, Integer numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
//    public void datosLibros(){
//        System.out.println("Ingrese el número ISBN: ");
//        isbn = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Ingrese el título: ");
//        titulo = sc.nextLine();
//        System.out.println("Ingrese el nombre del autor: ");
//        autor = sc.nextLine();
//        System.out.println("Ingrese el número de páginas: ");
//        numPag = sc.nextInt();
//        sc.nextLine();
//    }
//    
//    public void getDatos(){
//        System.out.println("ISBN: "+isbn+"\nTítulo: "+titulo+"\nAutor: "+autor+"\nNúmero de páginas: "+numPag);
//    }
}
