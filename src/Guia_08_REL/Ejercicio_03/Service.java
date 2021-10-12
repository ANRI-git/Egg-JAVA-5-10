package Guia_8_REL_Ejercicio_03;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menuCinema() {
        System.out.println("Creating cinema");
//        LinkedHashSet<Cinema> rooms = new LinkedHashSet();
        String[][] seats = new String[8][6];
        LinkedHashSet<String> ocupiedSeat = new LinkedHashSet();
        String chars = "ABCDEF";
        Cinema newShow = new Cinema();
        createRoom(seats, newShow, chars, ocupiedSeat);
        String op;
        do {
            System.out.println("1. Add movie.\n2. Set spectators.\n3. Show seats.\n0. Exit.");
            op = sc.next();
            switch (op) {
                case "1":
//                    Cinema newShow = new Cinema();
                    addMovie(newShow);
//                    rooms.add(newShow);
                    break;
                case "2":
                    if (newShow.getMovie() == null) {
                        System.out.println("First add movie!");
                        addMovie(newShow);
                    }
                    setSpectators(newShow, chars, ocupiedSeat);
                    break;
                case "3":
                    showCinema(newShow, seats);
                    break;
                case "4":
                    //pruebaMATRIZ();
                    break;
                case "5":
                    ;
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

    private void createRoom(String[][] seats, Cinema newShow, String chars, LinkedHashSet<String> ocupiedSeat) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                seats[i][j] = String.valueOf(8 - i) + chars.charAt(j) + " ";
            }
        }
        for (int i = 0; i <= 48; i++) {
            int aux = (int) (Math.random() * 2);
            if (aux == 1) {
                String aux1 = String.valueOf((int) (Math.random() * 8 - 1) + 1) + chars.charAt((int) (Math.random() * 6)) + " ";
                if (!ocupiedSeat.contains(aux1)) {
                    ocupiedSeat.add(aux1);
                    Spectator spec = new Spectator();
                    spec.setSeat(aux1);
                    newShow.getRoom().add(spec);
                }
            }
        }
    }

    private void addMovie(Cinema newShow) {
        Movie newMovie = new Movie();
        System.out.println("Adding movie:");
        System.out.println("Name:");
        newMovie.setTitle(sc.next());
        System.out.println("Director:");
        newMovie.setDirector(sc.next());
        System.out.println("Length:");
        newMovie.setLength(sc.nextDouble());
        System.out.println("Minimum age:");
        newMovie.setMinAge(sc.nextInt());
        newShow.setMovie(newMovie);
        System.out.println("Set price of movie:");
        newShow.setPrice(sc.nextDouble());
    }

    private void setSpectators(Cinema newShow, String chars, LinkedHashSet<String> ocupiedSeat) {
        System.out.println("Setting spectators:");
        int cont = 1;
        String op;
        do {
            Spectator spec = new Spectator();
            System.out.println("Name of client:");
            spec.setName(sc.next());
            System.out.println("Age:");
            spec.setAge(sc.nextInt());
            if (spec.getAge() < newShow.getMovie().getMinAge()) {
                System.out.println("The client it´s too young for the movie!");
            } else {
                System.out.println("Money avaible:");
                spec.setMoneyAv(sc.nextDouble());
                if (spec.getMoneyAv() < newShow.getPrice()) {
                    System.out.println("The client doesn´t have enough money!");
                } else {
                    String aux;
                    do {
                        aux = String.valueOf((int) (Math.random() * 8 - 1) + 1) + chars.charAt((int) (Math.random() * 6)) + " ";
                        System.out.println("");
                        if (!ocupiedSeat.contains(aux)) {
                            ocupiedSeat.add(aux);
                            spec.setSeat(aux);
                            System.out.println("Seat asignated: " + spec.getSeat());
                            break;
                        }
                    } while (true);
                    newShow.getRoom().add(spec);
                    cont++;
                }
            }
            System.out.println("Add another client? y/n");
            op = sc.next();
            if (op.equals("n") || cont == 48) {
                System.out.println("No more clients or seats!\nExiting.");
                break;
            }
        } while (cont
                <= 48);
    }

    private void showCinema(Cinema newShow, String[][] seats) {
        for (String[] seat : seats) {
            for (int i = 0; i < seats.length - 2; i++) {
                for (Spectator spectator : newShow.getRoom()) {
                    if (spectator.getSeat().equals(seat[i])) {
                        seat[i] = (seat[i].replace(" ", "X"));
                        break;
                    }
                }
                System.out.print(seat[i]);
                if (i < 5) {
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
    }

    public void pruebaMATRIZ() {
        LinkedHashSet<String> seat = new LinkedHashSet();
        String chars = "ABCDEF";
        String aux;
        int cont = 1;
        do {
            do {
                aux = String.valueOf((int) (Math.random() * 8) + 1) + chars.charAt((int) (Math.random() * 6));
                if (!seat.contains(aux)) {
                    seat.add(aux);
                    System.out.print(cont + " - ");
                    System.out.println(seat);
                    break;
                }
            } while (true);
            cont++;
        } while (cont <= 48);
    }
}
