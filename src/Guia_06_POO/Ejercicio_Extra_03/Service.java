package Guia_06_POO.Ejercicio_Extra_03;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public void createRoots(Roots r) {
        System.out.println("Enter num A:");
        r.setA(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter num B:");
        r.setB(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter num C:");
        r.setC(sc.nextInt());
        sc.nextLine();
    }

    public double getDiscriminate(Roots r) {
//        System.out.println("Calculating discriminate!");
        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }

    public boolean hasRoots(Roots r) {
        return getDiscriminate(r) > 0;
    }

    public boolean hasUniqueRoot(Roots r) {
        return getDiscriminate(r) == 0;
    }

    public void obtainRoots(Roots r) {
        System.out.println("Does it have roots?");
        if (hasRoots(r)) {
            System.out.println(true);
            System.out.println("Possible solutions:");
            System.out.println((- r.getB() + Math.sqrt(getDiscriminate(r))) / (2 * r.getA()));
            System.out.println((- r.getB() - Math.sqrt(getDiscriminate(r))) / (2 * r.getA()));
        }
    }

    public void obtainUniqueRoot(Roots r) {
        System.out.println("Does it have an unique root?");
        if (hasUniqueRoot(r)) {
            System.out.println(true);
            System.out.println("Unique solution:");
            System.out.println((- r.getB() + Math.sqrt(getDiscriminate(r))) / (2 * r.getA()));
        }
    }

    public void calculate(Roots r) {
        if (hasRoots(r)) {
            obtainRoots(r);
        } else if (hasUniqueRoot(r)) {
            obtainUniqueRoot(r);
        } else {
            System.out.println("There are no possible real solutions!");
        }
    }
}