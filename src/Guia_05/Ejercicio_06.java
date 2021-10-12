package Guia_05;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_06 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número a calcular: ");
        int numA = sc.nextInt();
        System.out.println("Doble del número: " + numA*2);
        System.out.println("Triple del número: " + numA*3);
        System.out.println("Raíz del número: " + Math.sqrt(numA));
    }
}
