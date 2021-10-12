package Guia_06_POO.Ejercicio_Extra_01;

import java.util.Scanner;

public class Ejercicio_Extra_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song song1 = new Song();
        System.out.println("Ingrese el nombre de la canción:");
        song1.setTitle(sc.nextLine());
        System.out.println("Ingrese el nombre del autor:");
        song1.setAutor(sc.nextLine());
        System.out.println("Mostrando info:");
        System.out.println("Title: " + song1.getTitle() + "\nAutor: " + song1.getAutor());
    }

}
