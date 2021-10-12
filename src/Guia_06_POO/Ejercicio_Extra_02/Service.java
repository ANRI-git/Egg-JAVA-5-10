package Guia_06_POO.Ejercicio_Extra_02;

import java.util.Scanner;


public class Service {
    Scanner sc = new Scanner(System.in);
    
    public void crearPuntos(Puntos p){
        System.out.println("Ingrese el primer punto (x1,y1): ");
        p.setX1(sc.nextInt());
        sc.nextLine();
        p.setY1(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el segundo punto (x2,y2):");
        p.setX2(sc.nextInt());
        sc.nextLine();
        p.setY2(sc.nextInt());
        sc.nextLine();
        System.out.println("X1: " + p.getX1() + "\nY1: " + p.getY1() + "\nX2: " + p.getX2() + "\nY2: " + p.getY2());
    }
    
    public void calculateDistance(Puntos p){
        System.out.println("Calculating points:");
        double d = Math.sqrt(Math.pow(p.getX2()-p.getX1(), 2)+Math.pow(p.getY2()-p.getY1(), 2));
        System.out.print("The distance between the two points is: ");
        System.out.printf("%1.2f%n", d);
    }
}
