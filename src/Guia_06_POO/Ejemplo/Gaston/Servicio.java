package Guia_06_POO.Ejemplo.Gaston;

import java.util.Scanner;

public class Servicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        Perro p = new Perro();
        System.out.println("Ingrese el nombre del perro");
        p.setNombre(sc.next());
        System.out.println("Ingrese la raza");
        p.setRaza(sc.next());
        System.out.println("Ingrese la edad");
        p.setEdad(sc.nextInt());
        return p;
    }
    
    public void setearValores(Perro p){
        System.out.println("Ingrese el nombre del perro");
        p.setNombre(sc.next());
        System.out.println("Ingrese la raza");
        p.setRaza(sc.next());
        System.out.println("Ingrese la edad");
        p.setEdad(sc.nextInt());
    }
   
    public void pasear(Perro p){
        System.out.println("El perro se paseo");
        System.out.println("El perro perdio energia");
        p.setEnergia(p.getEnergia() - 25);
        System.out.println("Energia actual: " + p.getEnergia());
    }
    
    public void alimentar(Perro p){
        System.out.println("El perro comio, subio la energia");
        p.setEnergia(p.getEnergia()+20);
        System.out.println("Energia actual: " + p.getEnergia());
        
    }
}
