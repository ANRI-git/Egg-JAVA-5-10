package Guia_6_POO.Ejercicio_03;

import java.util.Scanner;

public class Operacion {
    private Integer numero1;
    private Integer numero2;

    public Operacion() {
    }

    public Operacion(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numero2 = sc.nextInt();
    }
    
    public Integer suma(){
        System.out.println("La suma es: ");
        return numero1 + numero2;
    }
    
    public Integer resta(){
        System.out.println("La resta es: ");
        return numero1 - numero2;
    }
        
    public Integer multi(){
        if (numero1 == 0){
            System.out.println("No se puede multiplicar, porque un número"
                    + " es un 0");
            return numero1;
        }
        else if (numero2 == 0){
            System.out.println("No se puede multiplicar, porque un número"
                    + " es un 0");
            return numero2;
        }
        else{
            System.out.println("La multriplicación es:");
            return numero1*numero2;
        }
    }
        
    public Float div(){
        if (numero2 == 0){
            System.out.println("No se puede dividir, porque el segundo número es"
                    + " un 0");
            return (float) (numero2);
        }
        else{
            System.out.println("La división es: ");
            return (float) (numero1/numero2);
        }
    }
}
