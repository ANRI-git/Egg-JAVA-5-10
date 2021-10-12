package Guia_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_Extra_22 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String [] palabras = new String [5];
        char [][] sopa = new char [20][20];
        Random r = new Random();
        for (char[] sopa1 : sopa) {
            for (int j = 0; j < sopa.length; j++) {
                sopa1[j] = (char)(r.nextInt(26) + 'a');
                ;
            }
        }
//        for (char[] sopa1 : sopa) {
//            for (int j = 0; j < sopa.length; j++) {
//                System.out.print(" " + sopa1[j]);
//            }
//            System.out.println("");
//        }
        leer(palabras);
        SopaFunc(sopa,palabras);
    }
    
    public static void leer(String [] palabras){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingrese la "+(i+1)+"° palabra:");
            palabras[i] = sc.next();
            if (palabras[i].length()<3 | palabras[i].length()>5){
                System.out.println("Palabra incorrecta, ingrese una palabra nuemente!");
                i--;
            }
        }
//        for (String palabra : palabras) {
//            System.out.println(palabra);
//        }
    }
    
    public static void SopaFunc(char [][] sopa, String [] palabras){
        int n = 20;
        for (int i = 0; i < 5; i++) {
            int m = (int) (Math.random()*19);
//            System.out.println("m"+m);
            int aux1 = n;
            int aux2 = m;
            do{
                if (palabras[i].length()==3){
                    n =(int) (Math.random()*16);
//                    System.out.println("n"+n);
                }
                else{
                    n =(int) (Math.random()*14);
//                    System.out.println("n"+n);
                }
            }while (m==aux2&&(n==aux1|n==aux1+1|n==aux1+2|n==aux1+3|n==aux1+4|n==aux1+5));
            for (int j = 0; j < palabras[i].length(); j++) {
                sopa[m][n]= palabras[i].charAt(j);
//                System.out.println("Letra en "+m+n+": "+sopa[m][n]);
                n++;
            }
        }
        for (char[] sopa1 : sopa) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print(" " + sopa1[j]);
            }
            System.out.println("");
        }
    }
}
