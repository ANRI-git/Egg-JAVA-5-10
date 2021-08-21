package Guia_5;

import java.util.Scanner;

public class Ejercicio_21 {
    static void convertidor(double euro, String op) {
        op = op.toLowerCase();
        switch(op){
            case "dolar":
                System.out.println(euro+" euros son: "+(euro*1.28611)+" dolares.");
                break;
            case "yen":
                System.out.println(euro+" euros son: "+(euro*129.852)+" yenes.");
                break;
            case "libra":
                System.out.println(euro+" euros son: "+(euro*0.86)+" libras.");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        double euro = sc.nextDouble();
        System.out.println("¿A que moneda quiere hacer la conversión?");
        System.out.println("Dolar.\nYen.\nLibra.");
        String op = sc.next();
        convertidor(euro,op);
    }
}
