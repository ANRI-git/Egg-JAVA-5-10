package Guia_7_COL_Ejercicio_Extra_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Word w = new Word();
        Service serv = new Service();
        serv.createList(w);
        serv.showList(w);
//        ArrayList<String> list = new ArrayList<>();
//        createWord(list);
    }

    public static void createWord(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Creating object word:");
        String op;
        do {
            System.out.println("Introduce the next word of the list or write 'no' to stop:");
            op = sc.nextLine();
            if (!op.equals("no")) {
                list.add(op);
            }
        } while (!op.equals("no"));

        list.forEach((word) -> {
            System.out.println(word + " - ");
        });
    }
}
