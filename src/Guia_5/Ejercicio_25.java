package Guia_5;

public class Ejercicio_25 {

    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]=(int) (Math.random()*1000);
            }
        }
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
