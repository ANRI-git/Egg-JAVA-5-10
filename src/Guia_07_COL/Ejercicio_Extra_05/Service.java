package Guia_07_COL.Ejercicio_Extra_05;

import java.util.Collections;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void createList(Word w) {
        System.out.println("Creating object word:");
        String op;
        do {
            System.out.println("Introduce the next word of the list or write '0' to stop:");
            op = sc.nextLine();
            if (!op.equals("0")) {
                w.getList().add(op);
            }
        } while (!op.equals("0"));
        Collections.sort(w.getList());
        System.out.println("Showing the list alphabetically ordered:");
        w.getList().forEach((word) -> {
            System.out.print(word + " - ");
        });
        System.out.println("");
    }

    public void showList(Word w){
        System.out.println("Enter the length of the words to search:");
        int op = sc.nextInt();
        w.getList().stream().filter((word) -> (word.length() == op)).forEach(System.out::println);
//        for (String word : w.list) {
//            if (op == word.length()){
//                System.out.println(word);
//            }
//        }
    }
}
