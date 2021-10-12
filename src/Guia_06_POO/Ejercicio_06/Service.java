package Guia_6_POO.Ejercicio_06;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public void elegirCafetera(Cafetera caf) {
        System.out.println("Indique cual es su cafetera:");
        System.out.println("1. Nespresso Essenza.(600ml)\n2. Nespresso Inissia ("
                + "700ml)");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                caf.setCapMaxima(600);
                break;
            case 2:
                caf.setCapMaxima(700);
                break;
        }
    }

    public void llenarCafetera(Cafetera caf) {
        System.out.println("Llenando la cafetera!");
        caf.setCapActual(caf.getCapMaxima());
        System.out.println("Cafetera llena");
    }

    public void servirTaza(Cafetera caf) {
        System.out.println("¿Cual es la capacidad de su taza?:");
        int taza = sc.nextInt();
        if (taza > caf.getCapActual()) {
            System.out.println("No hay suficiente café, la taza solo se llenó "
                    + caf.getCapActual() + "ml");
            caf.setCapActual(0);
        } else {
            caf.setCapActual(caf.getCapActual() - taza);
            System.out.println("Taza llena, queda en la cafetera " + caf.
                    getCapActual() + "ml");
        }
    }

    public void vaciarCafetera(Cafetera caf) {
        System.out.println("Vaciando cafetera");
        caf.setCapActual(0);
        System.out.println("Cafetera vacía");
    }

    public void agregarCafe(Cafetera caf) {
        System.out.println("Ingrese una cantidad de café a la cafetera:");
        int cafe = sc.nextInt();
        if ((caf.getCapActual() + cafe) > caf.getCapMaxima()) {
            System.out.println("Es demasiado para la cafetera, solo se usará un "
                    + "poco");
            caf.setCapActual(caf.getCapMaxima());
        } else {
            caf.setCapActual(caf.getCapActual() + cafe);
            System.out.println("La cafetera ahora tiene " + caf.getCapActual());
        }
    }
}
