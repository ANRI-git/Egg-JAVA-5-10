package Guia_6_POO.Ejercicio_10;

import java.util.Arrays;
import java.util.Random;

public class Service {

    public double[] crearNumeros() {
        Random r = new Random();
        double[] array = r.doubles(50, 1, 100).toArray();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Math.random() * 100.0;
//        }
        Arrays.sort(array);
        return array;
    }

    public double[] crearArrayA(double[] arrayA) {
        Arrays.sort(arrayA);
        double[] arrayB = new double[20];
        Arrays.fill(arrayB, 0.5);
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        return arrayB;
    }

    public void mostrarArray(double[] array) {
        System.out.println("Mostrando array:");
        for (double array1 : array) {
            for (int i = 0; i < 10; i++) {
                array1 = Math.round(array1*100.0)/100.0;
                System.out.print(array1 + " - ");
//                System.out.printf("%1.2f%n",array1);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
