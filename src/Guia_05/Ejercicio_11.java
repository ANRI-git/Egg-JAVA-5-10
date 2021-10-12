package Guia_5;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra que debe comenzar con A: ");
        String palabra;
        palabra = sc.nextLine();
        if (palabra.substring(0, 1).equals("A")){
            System.out.println("La palabra es correcta");
        }
        else{
            System.out.println("La palabra es incorrecta");
        }
    }
}
