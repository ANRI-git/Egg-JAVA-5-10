package Guia_06_POO.Ejercicio_07;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service serv = new Service();
        Persona [] personas = new Persona [4];
        personas [0] = serv.crearPersona();
        personas [1] = serv.crearPersona();
        personas [2] = serv.crearPersona();
        personas [3] = serv.crearPersona();
        int cont1, cont2, cont3, cont4;
        cont1 = cont2 = cont3 = cont4 = 0;
        for (int i = 0; i < 4; i++) {
            switch ((int) serv.calcularIMC(personas[i])) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                default:
                    cont3++;
                    break;
            }
            if (serv.esMayorDeEdad(personas[i])){
                cont4 ++;
            }
        }
        System.out.println("Personas por debajo de su peso ideal: " + cont1 + "\nper"
                + "sonas en su peso ideal: " + cont2 + "\nPersonas con sobrepeso: " + cont3
                + "\nPorcetaje de personas mayores de edad: " + (cont4/0.04) + "%");
    }

}
