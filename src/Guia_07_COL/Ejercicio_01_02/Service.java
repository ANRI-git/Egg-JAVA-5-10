package Guia_7_COL_Ejercicio_01_02;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void createDogs(Dogs d) {
        System.out.println("Creating object dogs!");
        String op;
        do {
            System.out.println("Enter the next race or write 'no' to stop:");
            op = sc.nextLine();
            if (!op.equals("no")) {
                d.getRace().add(op);
            }
        } while (!op.equals("no"));
    }

    public void showList(Dogs d) {
        Collections.sort(d.getRace());
        d.getRace().forEach((race) -> {
            System.out.println(race);
        });
    }

    public void deleteRace(Dogs d) {
        System.out.println("Enter a race and if it exists in the list it will be deleted:");
        String op = sc.nextLine();
        int aux = d.getRace().size();
//        int cont = 0;
        Iterator<String> it = d.getRace().iterator();
        while (it.hasNext()) {
            if (it.next().equals(op)) {
                it.remove();
//                cont ++;
            }
        }
//        if (cont == 0) {
        if (aux == d.getRace().size()) {
            System.out.println("The entered race doesn´t exist!");
        }
        showList(d);
    }

}
