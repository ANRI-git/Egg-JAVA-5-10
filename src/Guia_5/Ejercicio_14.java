package Guia_5;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número límite: ");
        int limite = sc.nextInt();
        int numA = 0;
        while (numA <= limite){
            System.out.println("Ingrese un número para sumar: ");
            numA = numA + sc.nextInt();
        }
        System.out.println("La suma superó el límite: " + numA);
    }
}
