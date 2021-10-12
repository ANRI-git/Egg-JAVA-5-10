package Guia_07_COL.Ejercicio_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void createMovie(ArrayList<Movie> mL) {

    }

    public void menuMovie(ArrayList<Movie> mL) {
        System.out.println("Creating object movie:");
        String op;
        do {
            System.out.println("Do you want to enter a new movie? (y/n):");
            op = sc.nextLine();
            switch (op) {
                case "y":
                    Movie m = new Movie();
                    System.out.println("Enter the title of the movie:");
                    m.setTitle(sc.nextLine());
                    System.out.println("Enter the name of the director:");
                    m.setDirector(sc.nextLine());
                    System.out.println("Enter the length of the movie in hours:");
                    m.setLength(sc.nextDouble());
                    sc.nextLine();
                    mL.add(m);
                    break;
                case "n":
                    System.out.println("Listed movies!");
                    break;
                default:
                    System.out.println("Wrong answer!");
                    break;
            }
        } while (!op.equals("n"));
    }

    public void showMovies(ArrayList<Movie> mL) {
        double aux = 0.0;
        System.out.println("Movies:");
        mL.forEach((movie) -> {
            System.out.println(movie.getTitle());
        });
        System.out.println("Movies longer than one hour:");
        mL.stream().filter((movie) -> (movie.getLength() > 1)).forEachOrdered((movie) -> {
            System.out.println(movie.getTitle() + "(" + movie.getLength() + "hs)");
        });
        System.out.println("Movies sorted from longer to shorter:");
        Collections.sort(mL, Comparators.sortMaxLength);
        mL.forEach((movie) -> {
            System.out.println(movie.getTitle() + "(" + movie.getLength() + "hs)");
        });
        System.out.println("Movies sorted from shorter to longer:");
        Collections.sort(mL, Comparators.sortMinLength);
        mL.forEach((movie) -> {
            System.out.println(movie.getTitle() + "(" + movie.getLength() + "hs)");
        });
        System.out.println("Movies sorted alphabetically by title:");
        Collections.sort(mL, Comparators.sortTitle);
        mL.forEach((movie) -> {
            System.out.println(movie.getTitle());
        });
        System.out.println("Movies sorted alphabetically by director:");
        Collections.sort(mL, Comparators.sortDirector);
        mL.forEach((movie) -> {
            System.out.println(movie.getTitle() + "(" + movie.getDirector() + ")");
        });

    }
}
