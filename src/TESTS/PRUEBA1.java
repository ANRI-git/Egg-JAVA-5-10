package TESTS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PRUEBA1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
//        int x1= 2;
//        int x2= 3;
//        int y1= 4;
//        int y2= 5;
//
//        Double distancia= Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)) ;
//        System.out.println(distancia);
        String chars = "ABCDEF";
        for (int i = 0; i < 10; i++) {
            //Hace que se quede en pausa por segundo
            TimeUnit.SECONDS.sleep(1);
            System.out.println(String.valueOf((int) (Math.random() * 8) + 1) + chars.charAt((int) (Math.random() * 6)));
        }
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int a = 12;
        String A = String.valueOf(a);
        System.out.println(A);
        a = Integer.valueOf(A);
        System.out.println(a);
    }

}
