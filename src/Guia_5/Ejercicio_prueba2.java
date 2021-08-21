package Guia_5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_prueba2 {
//
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int aux=0;
//        int m=10*n;
//        for (int i=1;i<n;i++){
//            System.out.println(aux+i*m);
//            m=m/10;
//        }
//        System.out.println("");
//    }
        Random r = new Random();

        String alphabet = "abcdefghijklmnñopqrstuvwxyz";
        for (int i = 0; i < 50; i++) {
            char c = (char)(r.nextInt(26) + 'a');
//            System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
            System.out.println(c);
        }
        
    }
}

