package Guia_5;

public class Ejercicio_22 {
    public static void main(String[] args) {
        int [] tablaN = new int [100];
        for (int i=0;i<100;i++){
            tablaN[i]=i+1;
        }
        int n = 99;
        for (int i=0;i<100;i++){
            System.out.println(tablaN[n-i]);
        }
    }
}
