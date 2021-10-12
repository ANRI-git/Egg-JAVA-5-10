package Guia_08_REL.Ejercicio_02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menuGame() {
        TreeSet<Player> players = new TreeSet();
        String op;
        do {
            System.out.println("1. Start game.\n2. Set players.\n0. Exit game!");
            op = sc.next();
            switch (op) {
                case "1":
                    if (players.isEmpty()) {
                        System.out.println("Set players first!");
                        setPlayers(players);
                    }
                    playGame(players);
                    break;
                case "2":
                    setPlayers(players);
                    break;
                case "0":
                    System.out.println("Exiting. Thanks for playing!");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        } while (!op.equals("0"));
    }

    private void setPlayers(TreeSet<Player> players) {
        players.clear();
        System.out.println("Select the numbers of players (1 to 6):");
        Integer op = sc.nextInt();
        if (op > 0) {
            if (op > 6) {
                op = 6;
            }
            for (int i = 1; i <= op; i++) {
                Player p = new Player();
                p.setID(i);
                System.out.println("Name of player:");
                String name = sc.next();
                p.setName(name + "-" + p.getID());
                p.setStatus(false);
                players.add(p);
            }
        }
    }

    private void playGame(TreeSet<Player> players) {
        System.out.println("Stating game");
        Revolver rev = new Revolver();
        loadRevolver(rev);
        System.out.println("Revolver loaded!");
        System.out.println("Chosing a random player to start!\n");
        int aux = (int) ((Math.random() * players.size()) + 1);
        TreeSet<Player> activePlayers = new TreeSet(players);
        String winner = "";
        System.out.println("Stating round!");
        do {
            Iterator<Player> iterator = activePlayers.iterator();
            while (iterator.hasNext()) {
                Player player = iterator.next();
                if (player.getID() == aux) {
                    System.out.println("Player " + player.getName() + "\nWhat do you want to do?\n1. Shoot!\n2. spin the cylinder and shoot.\n3. Surrender.");
                    Integer op = sc.nextInt();
                    do {
                        switch (op) {
                            case 1:
                                shootRevolver(player, rev);
                                break;
                            case 2:
                                rev.setActPos((int) (Math.random() * 6) + 1);
                                shootRevolver(player, rev);
                                break;
                            case 3:
                                System.out.println("The player surrendered!");
                                activePlayers.remove(player);
                                break;
                            default:
                                System.out.println("Wrong option!");
                                System.out.println("Player " + player.getName() + " what do you want to do?\n1. Shoot!\n2. spin the cylinder and shoot.\n3. Surrender.");
                                op = sc.nextInt();
                                break;
                        }
                    } while (op != 1 && op != 2 && op != 3);
                }
                if (player.getStatus()) {
                    player.setStatus(false);
                    iterator.remove();
                }
            }
            if (activePlayers.size() == 1) {
                winner = activePlayers.first().getName();
                break;
            }
            if (aux < activePlayers.last().getID()) {
                aux++;
            } else {
                aux = 1;
            }
        } while (!activePlayers.isEmpty());
        System.out.println("The winner is: " + winner + "\nCongratulations!!\n");
    }

    private void shootRevolver(Player player, Revolver rev) {
        if (rev.getActPos().equals(rev.getWaterPos())) {
            player.setStatus(true);
            System.out.println("You are wet! Good luck next time!\n");
            rev.setWaterPos((int) (Math.random() * 6) + 1);
        } else {
            System.out.println("You survived!\n");
            if (rev.getActPos() < 6) {
                rev.setActPos(rev.getActPos() + 1);
            } else {
                rev.setActPos(1);
            }
        }
    }

    private void loadRevolver(Revolver rev) {
        rev.setActPos((int) (Math.random() * 6) + 1);
        rev.setWaterPos((int) (Math.random() * 6) + 1);
    }

    private void showList(TreeSet<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
}
