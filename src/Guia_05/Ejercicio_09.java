package Guia_05;

import java.util.Scanner;

public class Ejercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = sc.nextLine();
        if (palabra.equals("eureka")){
        System.out.println("La palabra es correcta!");    
        }
        else{
            System.out.println("La palabra es incorrecta!");
        }
    }
}
