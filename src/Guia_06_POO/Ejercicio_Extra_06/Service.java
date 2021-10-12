package Guia_06_POO.Ejercicio_Extra_06;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public void createGame(Ahorcado a) {
        System.out.println("Ingrese la palabra a adivinar:");
        String w = sc.nextLine();
        fillArray(a, w);
    }

    public void fillArray(Ahorcado a, String w) {
        a.setWord(new char[w.length()]);
        for (int i = 0; i < w.length(); i++) {
            a.getWord()[i] = w.charAt(i);
        }
    }

    public void showArray(Ahorcado a) {
        for (int i = 0; i < a.getWord().length; i++) {
            System.out.print(a.getWord()[i] + "-");
        }
    }
}
