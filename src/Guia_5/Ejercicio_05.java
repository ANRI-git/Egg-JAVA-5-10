/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_5;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los grados a convertir: ");
        double grados = sc.nextDouble();
        double F = 32 + (9*grados/5);
        System.out.println(grados + " °C es igual a " + F + " °F.");  
    }
    
}
