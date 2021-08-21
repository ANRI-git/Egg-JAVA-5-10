package Guia_9_HER_Ejercicio_Extra_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Service_BoatRenting {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void boatRental() throws InterruptedException {
        ArrayList<Rent> rentedBoats = new ArrayList();
        System.out.println("Renting boat!");
        String op;
        do {
            System.out.println("Select the type of boat you want to rent today:");
            Rent newRent = new Rent();
            System.out.println("1. Normal boat.\n2. Motorboat.\n3. Sailboat.\n4. Yacht.\n5. Show Information.\n0. Exit");
            op = sc.next();
            if (!op.equals("5") && !op.equals("0")) {
                fillRental(newRent);
            }
            switch (op) {
                case "1":
                    Boat boat = new Boat();
                    createBoat(boat);
                    newRent.setShip(boat);
                    break;
                case "2":
                    Motorboat motorBoat = new Motorboat();
                    createBoat(motorBoat);
                    newRent.setShip(motorBoat);
                    break;
                case "3":
                    Sailboat sailBoat = new Sailboat();
                    createBoat(sailBoat);
                    newRent.setShip(sailBoat);
                    break;
                case "4":
                    Yacht yacht = new Yacht();
                    createBoat(yacht);
                    newRent.setShip(yacht);
                    break;
                case "5":
                    showRentedBoats(rentedBoats);
                    break;
                case "0":
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
            if (!op.equals("5") && !op.equals("0")) {
                setPrice(newRent);
            }
            rentedBoats.add(newRent);
        } while (!op.equals("0"));
    }

    public void fillRental(Rent newRent) {
        System.out.println("Enter your name:");
        newRent.setName(sc.next());
        do{            
        System.out.println("Enter your DNI:");
            newRent.setDNI(sc.nextLong());
        }while(sc.match().group().length() < 7 || sc.match().group().length() > 8);
        DateTimeFormatter orden = DateTimeFormatter.ofPattern("dd MM yyyy");
        System.out.println("Enter the rental date(dd MM): ");
        newRent.setRentDate(LocalDate.parse(sc.next() + " 2021", orden).atStartOfDay());
        do {
            System.out.println("Enter the devolution date:");
            newRent.setDevolutionDate(LocalDate.parse(sc.next() + " 2021", orden).atStartOfDay());
            if (newRent.getRentDate().isAfter(newRent.getDevolutionDate())) {
                System.out.println("The devolution date is wrong! Try again.");
            }
        } while (newRent.getRentDate().isAfter(newRent.getDevolutionDate()));
    }

    public void createBoat(Boat newBoat) {
        newBoat.setLength(7d);
        newBoat.setLicensePlate((Math.random() * 8889) + 1111);
        newBoat.setYear((int) (Math.random() * 1998) * 2021);
        String op;
        if (newBoat instanceof Motorboat) {
            if (newBoat instanceof Yacht) {
                System.out.println("Select the model:\n1. BENETEAU Monte Carlo 6"
                        + " - HP: 1200 Rooms: 3\n2. Leopard 23 - HP: 2400 Rooms:"
                        + " 3\n3. VERSILCRAFT 105 - HP: 4000 Rooms: 4");
                outer:
                do {
                    op = sc.next();
                    switch (op) {
                        case "1":
                            newBoat.setLength(15.97);
                            ((Motorboat) newBoat).setHP(1200d);
                            ((Yacht) newBoat).setRooms(3);
                            break outer;
                        case "2":
                            newBoat.setLength(23d);
                            ((Motorboat) newBoat).setHP(2400d);
                            ((Yacht) newBoat).setRooms(3);
                            break outer;
                        case "3":
                            newBoat.setLength(31d);
                            ((Motorboat) newBoat).setHP(4000d);
                            ((Yacht) newBoat).setRooms(4);
                            break outer;
                        default:
                            System.out.println("Wrong option!");
                            break;
                    }
                } while (!op.equals("0"));
            } else {
                outer:
                do {
                    System.out.println("Select the model:\n1. AF - HP: 50\n2. 4.8 - HP: 70\n3. 5.85 - HP: 135");
                    op = sc.next();
                    switch (op) {
                        case "1":
                            newBoat.setLength(4.5);
                            ((Motorboat) newBoat).setHP(50d);
                            break outer;
                        case "2":
                            newBoat.setLength(4.6);
                            ((Motorboat) newBoat).setHP(70d);
                            break outer;
                        case "3":
                            newBoat.setLength(5.8);
                            ((Motorboat) newBoat).setHP(135d);
                            break outer;
                        default:
                            System.out.println("Wrong option!");
                            break;
                    }
                } while (!op.equals("0"));
            }
        }
        if (newBoat instanceof Sailboat) {
            outer:
            do {
                System.out.println("Select the model:\n1. BENETEAU OCEANIS - hp: 30\n2. Diamand Bay - HP: 54\n3. LE DON DU VENT - HP: 30");
                op = sc.next();
                switch (op) {
                    case "1":
                        newBoat.setLength(11.5);
                        ((Sailboat) newBoat).setNum_mast(1);
                        break outer;
                    case "2":
                        newBoat.setLength(13.94);
                        ((Sailboat) newBoat).setNum_mast(2);
                        break outer;
                    case "3":
                        newBoat.setLength(30d);
                        ((Sailboat) newBoat).setNum_mast(3);
                        break outer;
                    default:
                        System.out.println("Wrong option!");
                        break;
                }
            } while (!op.equals("0"));
        }
    }

    private void setPrice(Rent newRent) {
        Double module;
        if (newRent.getDevolutionDate().getMonthValue() == newRent.getRentDate().getMonthValue()) {
            module = ((double) (newRent.getDevolutionDate().getDayOfMonth() - newRent.getRentDate().getDayOfMonth()) * (newRent.getShip().length * 10));
        } else if (newRent.getDevolutionDate().getMonthValue() > newRent.getRentDate().getMonthValue()) {
            module = ((double) ((newRent.getDevolutionDate().getDayOfMonth() + newRent.getRentDate().getMonth().maxLength()) - newRent.getDevolutionDate().getDayOfMonth()) * (newRent.getShip().length * 10));
        } else {
            module = ((double) ((newRent.getRentDate().getMonth().maxLength() + newRent.getDevolutionDate().getDayOfMonth()) - newRent.getDevolutionDate().getDayOfMonth()) * (newRent.getShip().length * 10));
        }
        if (newRent.getShip() instanceof Sailboat) {
            module += ((Sailboat) newRent.getShip()).getNum_mast();
        } else if (newRent.getShip() instanceof Motorboat) {
            module += ((Motorboat) newRent.getShip()).getHP();
            if (newRent.getShip() instanceof Yacht) {
                module += ((Yacht) newRent.getShip()).getRooms();
            }
        }
        newRent.setPrice(module);
        System.out.print("The price of the rent is: USD ");
        System.out.printf("%1.2f%n", newRent.getPrice());
    }

    private void showRentedBoats(ArrayList<Rent> rentedBoats) throws InterruptedException {
        System.out.println("Name of client or DNI:");
        String op = sc.next();
        for (Rent rental : rentedBoats) {
            if (rental.getName().equals(op) || rental.getDNI().equals(Long.valueOf(op))) {
                System.out.println("Rent day: " + rental.getRentDate() + 
                        "\nDevolution day: " + rental.getDevolutionDate() + 
                        "\nBoat type: " + rental.getShip() + "\nLicence plate: " +
                        rental.getShip().licensePlate + "\nYear: " + 
                        rental.getShip().year + "\nPrice: ");
                System.out.printf("%1.2f%n", rental.getPrice());
                TimeUnit.SECONDS.sleep(5);
                break;
            }
        }
    }
}
