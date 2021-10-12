
package Guia_06_POO.Ejercicio_02;

import java.util.Scanner;

public class Circunferencia {
    private Double radio;
    
    public Circunferencia(){
    }

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        radio = sc.nextDouble();
    }
    
    public void area(){
        Double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area de la circunferencia es: " + area);
    }
    
    public void perimetro(){
        Double perim = 2 * Math.PI * radio;
        System.out.println("El perimetro de la circunferencia es: " + perim);
    }
}
