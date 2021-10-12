package Guia_05;

import java.util.Scanner;

public class Ejercicio_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de una matriz con dos valores (filar,columnas):");
        int n = sc.nextInt();
        int cont=0;
        int [][] matriz = new int [n][n];
        System.out.println("Ingrese los números de la matriz:");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if (matriz[i][j]!=-(matriz[j][i])||matriz[i][i]!=0){
                   cont=1;
                }
            }
        }
        if (cont==0){
                System.out.println("Es una matriz antisimétrica");
        }
        else{
            System.out.println("No es una matriz antisimétrica!");
        }
    }
}
