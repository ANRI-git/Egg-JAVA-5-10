package Guia_06_POO.Ejercicio_10;

import java.util.Arrays;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Service serv = new Service();
        double[] arrayA = serv.crearNumeros();
        serv.mostrarArray(arrayA);
        double[] arrayB = serv.crearArrayA(arrayA);
        serv.mostrarArray(arrayB);
    }

}
