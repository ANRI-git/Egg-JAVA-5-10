package Guia_05;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numA = sc.nextInt();
        if (numA%2 == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
}
