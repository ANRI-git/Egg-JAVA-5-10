package Guia_5;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "si";
        int n1;
        int cont=0;
        System.out.println("Ingrese el tamaño de la lista: ");
        int n = sc.nextInt();
        int [] vector = new int [n];
        for (int i=0;i<n;i++){
            vector[i]=(int) (Math.random()*101);
        }
        do{
            System.out.println("¿Qué número desea buscar?");
            n1 = sc.nextInt();
            for (int i=0;i<n;i++){
                if (vector[i]==n1){
                    System.out.println("El número "+n1+" se encontró en la posición: "+i);
                    cont++;
                }
            }
            if (cont==0){
                System.out.println("No se encontró el número en la lista.");
            }
            else{
                System.out.println("Se encontró "+cont+" veces.");
            }
            System.out.println("¿Desea buscar otro un número? (si/no)");
            op = sc.next();
        }while (!op.equals("no"));
    }
}
