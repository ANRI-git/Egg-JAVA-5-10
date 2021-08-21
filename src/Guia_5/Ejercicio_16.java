package Guia_5;

import java.util.Scanner;

public class Ejercicio_16 {

    @SuppressWarnings("SillyAssignment")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 20;i++) {
            System.out.println("Ingrese un nuúmero a sumar: ");
            int numA = sc.nextInt();
            if (numA>0 & numA!=0){
                suma = suma + numA;
                System.out.println("suma: "+suma);
            }
            else if (numA==0){
                System.out.println("Se capturó el número 0!");
                break;
            }
            else{
                System.out.println("El numero debe ser positivo");
            }
        }
        System.out.println("El resultado de la suma es: "+ suma);
    }
}
