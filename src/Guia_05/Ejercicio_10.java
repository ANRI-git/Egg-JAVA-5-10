package Guia_05;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra que no exceda los 8 caracteres: ");
        String palabra;
        palabra = sc.nextLine();
        if (palabra.length()==8){
            System.out.println("La palabra es correcta");
        }
        else{
            System.out.println("La palabra es incorrecta, supera o es menor a los 8 caracteres");
        }
    }
}