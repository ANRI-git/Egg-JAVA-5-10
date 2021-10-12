package Guia_05;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un el tipo de número: ");
        int tipoMotor = sc.nextInt();
        switch (tipoMotor){
            case 1: 
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2: 
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para el tipo de bomba.");
                break;
        }
    }
    
}
