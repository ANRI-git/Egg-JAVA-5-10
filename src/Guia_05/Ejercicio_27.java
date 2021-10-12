package Guia_05;

import java.util.Scanner;

public class Ejercicio_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] cuadrado = new int [3][3];
        System.out.println("Crea un cuadrado mágico!\n"
                + "Introduzca su cuadrado número por número:");
        int sumaC=0;
        int sumaD=0;
        for (int i=0;i<3;i++){
            int j=0;
            do{
                System.out.println("Posición "+i+j);
                cuadrado[i][j]=sc.nextInt();
                if (cuadrado[i][j]<10&&cuadrado[i][j]>0){
                    j++;
                }
                else{
                    System.out.println("El numero ingresado debe ser entre 1 y 9,"
                            + " intente nuevamente!");
                }
            }while (j<3);
        }
    }
}
