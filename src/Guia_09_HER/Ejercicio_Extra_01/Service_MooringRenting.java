package Guia_9_HER_Ejercicio_Extra_01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Service_MooringRenting {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void mooringRental() throws InterruptedException {
        ArrayList<Rent> rentedDocks = new ArrayList();
        System.out.println("Renting a space in the dock!");
        String op;
        do {
            System.out.println("Select the type of boat you want to park:");
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
                    if (rentedDocks.isEmpty()) {
                        System.out.println("No boats in the dock yet!");
                        break;
                    }
                    showRentedBoats(rentedDocks);
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
            rentedDocks.add(newRent);
        } while (!op.equals("0"));
    }

    public void fillRental(Rent newRent) {
        System.out.println("Enter your name:");
        newRent.setName(sc.next());
        do {
            System.out.println("Enter your DNI:");
            newRent.setDNI(sc.nextLong());
        } while (sc.match().group().length() < 7 || sc.match().group().length() > 8);
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
        System.out.println("Enter the length of the boat: ");
        newBoat.setLength(sc.nextDouble());
        System.out.println("Enter the license plate:");
        newBoat.setLicensePlate(sc.nextDouble());
        System.out.println("Enter the year of the boat:");
        newBoat.setYear(sc.nextInt());
        if (newBoat instanceof Motorboat) {
            if (newBoat instanceof Yacht) {
                System.out.println("Enter the HP:");
                ((Motorboat) newBoat).setHP(sc.nextDouble());
                System.out.println("Enter the rooms:");
                ((Yacht) newBoat).setRooms(sc.nextInt());
            } else {
                System.out.println("Enter the HP:");
                ((Motorboat) newBoat).setHP(sc.nextDouble());
            }
        }
        if (newBoat instanceof Sailboat) {
            System.out.println("Enter the number of masts:");
            ((Sailboat) newBoat).setNum_mast(sc.nextInt());
        }
    }

    private void setPrice(Rent newRent) {
        double days;
        if (Duration.between(newRent.getRentDate(), newRent.getDevolutionDate()).toDays() == 0) {
            days = 1;
        } else {
            days = Duration.between(newRent.getRentDate(), newRent.getDevolutionDate()).toDays();
        }
        Double module = (double) (days * (newRent.getShip().length * 10));
//        if (newRent.getDevolutionDate().getMonthValue() == newRent.getRentDate().getMonthValue()) {
//            module = ((double) (Duration.between(newRent.getRentDate(), newRent.getDevolutionDate()).toDays()) * (newRent.getShip().length * 10));
//        } else if (newRent.getDevolutionDate().getMonthValue() > newRent.getRentDate().getMonthValue()) {
//            module = ((double) ((newRent.getDevolutionDate().getDayOfMonth() + newRent.getRentDate().getMonth().maxLength()) - newRent.getDevolutionDate().getDayOfMonth()) * (newRent.getShip().length * 10));
//        } else {
//            module = ((double) ((newRent.getRentDate().getMonth().maxLength() + newRent.getDevolutionDate().getDayOfMonth()) - newRent.getDevolutionDate().getDayOfMonth()) * (newRent.getShip().length * 10));
//        }
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
                System.out.println("Rent day: " + rental.getRentDate()
                        + "\nDevolution day: " + rental.getDevolutionDate()
                        + "\nBoat type: " + rental.getShip() + "\nLicence plate: "
                        + rental.getShip().licensePlate + "\nYear: "
                        + rental.getShip().year + "\nPrice: ");
                System.out.printf("%1.2f%n", rental.getPrice());
                TimeUnit.SECONDS.sleep(5);
                break;
            }
        }
    }
}
