package Guia_05;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma;
        suma = num1 + num2;
        System.out.println("La suma de los números es: "+ suma);
        
    }
}
