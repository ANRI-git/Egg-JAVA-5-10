package Guia_9_HER_Ejercicio_04;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void createForms() {
        Square s = new Square();
        Circle c = new Circle();
        System.out.println("Creating square:\nAdd the base:");
        s.setBase(sc.nextDouble());
        System.out.println("Add the height:");
        s.setHeight(sc.nextDouble());
        System.out.println("Creating Circle:\nAdd the radius:");
        c.setRadius(sc.nextDouble());
        
        System.out.println("Square Area: ");
        s.calculateArea();
        System.out.println("Square Perimeter: ");
        s.calculatePerimeter();
        System.out.println("Circle Area:");
        c.calculateArea();
        System.out.println("Circle Perimeter:");
        c.calculatePerimeter();
    }
}
