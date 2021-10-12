package Guia_07_COL.Ejercicio_05;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menuCountry() {
        LinkedHashSet<Country> c = new LinkedHashSet();
        int op;
        System.out.println("Welcome!");
        System.out.println("First create list of countries:");
        createList(c);
        do {
            System.out.println("Select an option:");
            System.out.println("1. Add another country.\n2. Delete country.\n3. Show list.\n4. Sort list alphabetically. \n0. Exit.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    createList(c);
                    break;
                case 2:
                    deleteCountry(c);
                    break;
                case 3:
                    showList(c);
                    break;
                case 4:
                    TreeSet<Country> c1 = new TreeSet(c);
                    c = new LinkedHashSet(c1);
                    showList(c);
                    break;
                case 0:
                    System.out.println("Exiting.\nSee you later!");
                    break;
                default:
                    System.out.println("Wrong option, try again!");
                    break;
            }
        } while (op != 0);
    }

    public void createList(LinkedHashSet<Country> c) {
        String op;
        do {
            Country nC = new Country();
            System.out.println("Enter the name of the country");
            nC.setName(sc.next());
            c.add(nC);
            System.out.println("Do you want to enter another country? (y/n)");
            op = sc.next();
        } while (!op.equals("n"));
    }

    public void deleteCountry(LinkedHashSet<Country> c) {
        System.out.println("Name of the country to delete:");
        String op = sc.next();
        int aux = c.size();
        Iterator<Country> it = c.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(op)) {
                it.remove();
            }
        }
        if (c.size() == aux) {
            System.out.println("Couldn't find the country!");
        } else {
            System.out.println("New list of countries:");
            showList(c);
        }
    }

    public void showList(LinkedHashSet<Country> c) {
        System.out.println("Countries: ");
        c.forEach((country) -> {
            System.out.println(country.getName());
        });
    }
}
