package Guia_05;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números y calcularemos el más grande: ");
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        System.out.println("El número más grande es: " + ((numA>numB)?numA:numB));
    }
}
