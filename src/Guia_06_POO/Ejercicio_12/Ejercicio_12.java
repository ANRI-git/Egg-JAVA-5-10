package Guia_06_POO.Ejercicio_12;

import java.text.ParseException;
import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Service serv = new Service();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        serv.crearPersona(p1);
        serv.calcularEdad(p1);
        System.out.println("Ingrese otra persona:");
        serv.crearPersona(p2);
        serv.calcularEdad(p2);
        serv.menorQue(p1, p2);
        serv.mostrarPersona(p1);
    }

}
