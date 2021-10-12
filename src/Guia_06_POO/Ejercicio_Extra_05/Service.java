package Guia_6_POO.Ejercicio_Extra_05;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public void startSecretMonth(MonthGame m) {
        System.out.println("Creating secret month!");
        m.setSecreteMonth(m.getMonth()[(int) (Math.random() * 12)]);
//        System.out.println(m.getSecreteMonth());
        System.out.println("Done\nLet´s Start the game!\nWrite a month and try to guess");
        int c = 0;
        do {
            if (sc.nextLine().equals(m.getSecreteMonth())) {
                System.out.println("You get it! Congratulations!");
                break;
            } else {
                System.out.println("Wrong :c");
                c++;
                if (c < 5) {
                    System.out.println("You got " + (5 - c) + " attempts. \nTry again!");
                } else {
                    System.out.println("Game over!\nThe secret month was " + m.getSecreteMonth());
                }
            }
        } while (c < 5);
    }
}
