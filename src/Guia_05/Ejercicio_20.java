package Guia_05;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, numA;
        System.out.println("Ingrese 4 números comprendidos entre el 1 y el 20: ");
        for (i=0;i<4;i++) {
            do {
                numA = sc.nextInt();
                if (numA < 1 ^ numA > 20) {
                    System.out.println("El número ingresado es menor a 1 o mayor a 20, vuelva a ingresarlo: ");
                }
            }while (numA < 1 ^ numA > 20);
            System.out.print(numA+" ");
            for (j=0;j<numA;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}