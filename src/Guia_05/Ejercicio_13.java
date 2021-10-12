package Guia_5;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una nota:");
        int nota = sc.nextInt();
        while (nota>10 ^ nota<0){
            System.out.println("La nota es incorrecta, intente nuevamente:");
            nota = sc.nextInt();
        }
        System.out.println("La nota es correcta.");
    }
}
