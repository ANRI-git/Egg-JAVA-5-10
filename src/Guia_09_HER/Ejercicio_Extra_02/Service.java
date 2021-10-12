package Guia_09_HER.Ejercicio_Extra_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Building> build = new ArrayList();
    Integer indoorSC = 0;
    Integer outdoorSC = 0;

    public void createBuilding() {
        System.out.println("Creating building: ");
        Integer op;
        do {
            System.out.println("1. Create Sport center.\n2. Create Office building.\n0. Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Not a number, try again!");
                sc.next();
            }
            op = sc.nextInt();
            switch (op) {
                case 1:
                    SportCenter sC = new SportCenter();
                    createSportCenter(sC);
                    break;
                case 2:
                    Office of = new Office();
                    createOffice(of);
                    break;
                case 0:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Not a valid option!");
                    break;
            }
        } while (!op.equals(0));
    }

//    public void createBuilding() {
//        SportCenter b1 = new SportCenter();
//        System.out.println(b1.getClass().getName());
//        System.out.println(b1.getClass().getName());
//        SportCenter b2 = new SportCenter();
//        Office b3 = new Office();
//        Office b4 = new Office();
//        createSportCenter(b1);
//        createSportCenter(b2);
//        createOffice(b3);
//        createOffice(b4);
//    }
    public void createOffice(Office office) {
        System.out.println("Creating office:");
        createDimentions(office);
        System.out.println("How many people can fit in each office?");
        office.setNumPeople(sc.nextInt());
        System.out.println("How many offices are in the buiding?");
        office.setNumOffices(sc.nextInt());
        System.out.println("How many floors have the office building?");
        office.setNumFloors(sc.nextInt());
        System.out.println(("There can work " + office.getNumOffices() * office.getNumPeople()) + " people in this office building.");
        if ((office.getNumOffices() / office.getNumFloors()) > 1) {
            System.out.println((office.getNumOffices() / office.getNumFloors()) * office.getNumPeople() + " people can work per floor!");
        } else {
            System.out.println("Only " + 1 * office.getNumPeople() + " people can work per floor!");
        }
        build.add(office);
    }

    public void createSportCenter(SportCenter sC) {
        System.out.println("Creating Sport center:");
        createDimentions(sC);
        System.out.println("Enter the name of the Sport Center:");
        sC.setName(sc.next());
        System.out.println("Is the Sport Center roofed? (y/n)");
        do {
            sC.setInstalationType(sc.next().equals("y"));
        } while (!sc.match().group().equals("y") && !sc.match().group().equals("n"));
        if (sC.getInstalationType()) {
            indoorSC++;
            if (indoorSC > 1) {
                System.out.println("There are " + indoorSC + " indoors Sport centers.");
            } else {
                System.out.println("There is " + indoorSC + " indoor Sport center.");
            }
        } else {
            outdoorSC++;
            if (indoorSC > 1 || indoorSC < 1) {
                System.out.println("There are " + outdoorSC + " outdoors Sport centers.");
            } else {
                System.out.println("There is " + outdoorSC + " outdoor Sport center.");
            }
        }
        build.add(sC);
    }

    public void calculations(Building b) {
        if (b instanceof Office) {
            System.out.println("Surface of " + b.toString() + ": " + ((Office) b).calculateSurface());
            System.out.println("Volume of " + b.toString() + ": " + ((Office) b).calculateVolume());
        } else {
            System.out.println("Surface of " + b.toString() + ": " + ((SportCenter) b).calculateSurface());
            System.out.println("Volume of " + b.toString() + ": " + ((SportCenter) b).calculateVolume());
        }
    }

    public void createDimentions(Building building) {
        System.out.println("Enter the heigth(meters):");
        building.setHeight(sc.nextDouble());
        System.out.println("Width(meters):");
        building.setWidth(sc.nextDouble());
        System.out.println("Length(meters):");
        building.setLength(sc.nextDouble());
        calculations(building);
    }
}
