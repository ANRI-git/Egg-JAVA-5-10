
package Guia_6_POO.Ejercicio_04;

import java.util.Scanner;

public class Rectangulo {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }
    
    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        altura = sc.nextDouble();
    }
    
    public void superficie(){
        System.out.println("Calculando la superficie");
        System.out.println("Superficie: "+base*altura);
    }
    
    public void perimetro(){
    System.out.println("Calculando el perímetro");
    System.out.println("Perímetro: "+(base+altura)*2);
    }
    
    public void divRectangulo(){
        int i, j;
        for (i = 0; i < altura; i++) {
            System.out.print("*");
            if (i == 0 | i == altura - 1) {
                for (j = 1; j < base - 1; j++) {
                    System.out.print(" *");
                }
            } else {
                for (j = 1; j < base - 1; j++) {
                    System.out.print("  ");
                }
            }
            System.out.println(" *");
        }
    }
}
