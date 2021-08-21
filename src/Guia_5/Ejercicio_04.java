package Guia_5;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String frase;
        frase = sc.nextLine();
        System.out.println("Frase en mayusculas: "+frase.toUpperCase()+"\nFrase en minúsculas: "+frase.toLowerCase());
        
    }
}
