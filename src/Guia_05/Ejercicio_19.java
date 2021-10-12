package Guia_05;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i=0;i<n;i++){
            System.out.print("*");
            if (i==0^i==n-1){
                for (j=1;j<n-1;j++){
                System.out.print(" *");
                }
            }
            else{
                for (j=1;j<n-1;j++){
                System.out.print("  ");
                }
            }
            System.out.println(" *");
        }
    }
}
