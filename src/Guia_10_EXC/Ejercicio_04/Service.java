package Guia_10_EXC.Ejercicio_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);
    int aux;
    int guessN;
    int cont;

    public void gameMenu() {
        Integer op;
        do {
            System.out.println("1. Start game.\n2. Show number of wrong atempts.\n3. Show the number to guess.\n0. Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Not a number!\n try again.");
                sc.next();
            }
            op = sc.nextInt();
            switch (op) {
                case 1:
                    aux = (int) (Math.random() * 500) + 1;
                    System.out.println(aux);
                    startGame();
                    break;
                case 2:
                    System.out.println("Wrong attemps: " + (cont));
                    break;
                case 3:
                    System.out.println("Number to guess: " + aux);
                    break;
                case 0:
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        } while (!op.equals(0));
    }

    private void startGame() {
        int op = 0;
        try {
            compare(op);
        } catch (InputMismatchException e) {
            System.out.println("That's not a number!\nTry again:");
            sc.next();
            startGame();
        }
    }

    private void compare(int op) throws InputMismatchException {
        do {
            System.out.println("Try to guess the number:");
            op = sc.nextInt();
            cont++;
        } while (op != aux);
        System.out.println("You got it!");
        System.out.println("Total attempts: " + cont--);
    }
}
