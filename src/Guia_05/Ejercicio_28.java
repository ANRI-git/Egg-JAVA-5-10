package Guia_05;

public class Ejercicio_28 {

    public static void main(String[] args) {
        int [][] matrizG = new int [10][10];
        int [][] matrizC = new int [3][3];
        int n,m,aux1,aux2;
        aux1=aux2=0;
        n=m=0;
        for (int[] matrizG1 : matrizG) {
            for (int j = 0; j < matrizG.length; j++) {
                matrizG1[j] = (int) (Math.random()*2);
            }
        }
        mostrar(matrizG);
        for (int[] matrizC1 : matrizC) {
            for (int j = 0; j < matrizC.length; j++) {
                matrizC1[j] = (int) (Math.random()*2);
            }
        }
        mostrar(matrizC);
        for (int[] matrizG1 : matrizG) {
            for (int j = 0; j < matrizG.length-2; j++) {
                System.out.println(matrizG1[j]);
                System.out.println(matrizC[n][m]);
                aux1++;
                if (matrizG1[j] == matrizC[n][m]) {
                    int aux = j;
                    m++;
                    if (m==matrizC.length){
                        n++;
                        m=0;
                    }
                    if (m==matrizC.length-1 && n==matrizC.length-1){
                        System.out.println("Se encontró la matriz pequeña en la grande");
                        break;
                    }
                } else {
                    m=0;
                    n=0;
                }
            }
        }
    }
    static void mostrar(int [][]matriz){
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}