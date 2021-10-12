package Guia_05;

import java.util.Scanner;

public class Ejercicio_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n = sc.nextInt();
        int [] vector = new int [n];
        int contA, contB,contC,contD,contE;
        contA=contB=contC=contD=contE=0;
        for (int i=0;i<n;i++){
            vector[i]=(int) (Math.random()*100000);
            int num = String.valueOf(vector[i]).length();
            switch (num){
                case 1:
                    contA++;
                    break;
                case 2:
                    contB++;
                    break;
                case 3:
                    contC++;
                    break;
                case 4:
                    contD++;
                    break;
                case 5:
                    contE++;
                    break;
            }
        }
        System.out.println("La cantidad de digitos fueron:\n Con 1 dígito: "+contA+
                "\n Con 2 dígitos: "+contB+"\n Con 3 dígitos: "+contC+"\n Con 4 dígitos: "+contD+"\n Con 5 dígitos: "+contE);    
    }
}
