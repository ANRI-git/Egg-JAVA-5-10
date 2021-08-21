package Guia_5;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
        float numA = sc.nextInt();
        float numB = sc.nextInt();
        int op;
        String con = " ";
        while (!(con.equals("s"))){
            System.out.print("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción: ");
            op = sc.nextInt();
            double resultado;
            switch (op){
                case 1:
                    resultado = numA + numB;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    resultado = numA - numB;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    resultado = numA * numB;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    float resultado1 = numA / numB;
                    System.out.println("El resultado es: " + resultado1);
                    break;
                case 5:
                    System.out.println("¿Desea salir?");
                    sc.skip("\n");
                    con = sc.nextLine();
                    break;
                default:
                    break;
            }
        }
    }
}
