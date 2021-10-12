package Guia_8_REL_Ejercicio_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Card> deck = new ArrayList();
    ArrayList<Card> lostDeck = new ArrayList();

    public void menuCardsGame() {
        String op;
        do {
            System.out.println("1. New deck.\n2. Shuffle deck.\n3. Give next card.\n4. Give hand.\n5. Show deck/available cards.\n6. Show unavailable cards.\n0. Exit.");
            op = sc.next();
            switch (op) {
                case "1":
                    createDeck();
                    break;
                case "2":
                    shuffleDeck();
                    break;
                case "3":
                    giveNext();
                    break;
                case "4":
                    giveCards();
                    break;
                case "5":
                    showDeck(deck);
                    break;
                case "6":
                    showDeck(lostDeck);
                    break;
                case "0":
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        } while (!op.equals("0"));
    }

    public void createDeck() {
        deck.clear();
        lostDeck.clear();
        String[] suits = {"swords", "cups", "coins", "clubs"};
        int aux = 1;
        int aux1 = 0;
        for (int i = 0; i < 40; i++) {
            Card card = new Card();
            card.setNumber(aux);
            card.setSuit(suits[aux1]);
            deck.add(card);
            if (aux < 12) {
                aux++;
                if (aux == 8) {
                    aux = 10;
                }
            } else {
                aux = 1;
                aux1++;
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    private void giveCards() {
        if (deck.isEmpty()) {
            System.out.println("Creating deck!");
            createDeck();
        }
        System.out.println("How many cards do you want?");
        int op = sc.nextInt();
        System.out.println("\nGiven cards:");
        for (int i = 0; i < op; i++) {
            System.out.println(deck.get(0));
            lostDeck.add(deck.get(0));
            deck.remove(0);
        }
        System.out.println("");
    }

    private void giveNext() {
        if (deck.isEmpty()) {
            System.out.println("Creating deck!");
            createDeck();
        }
        System.out.println("\nGiven card:");
        System.out.println(deck.get(0) + "\n");
        lostDeck.add(deck.get(0));
        deck.remove(0);
    }

    public void showDeck(ArrayList<Card> deck) {
        int aux = 0;
        for (Card card : deck) {
            System.out.print(card);
            aux++;
            if (aux < 10) {
                System.out.print(" - ");
            }
            if (aux == 10) {
                System.out.println("");
                aux = 0;
            }
        }
        System.out.println("");
    }
}
