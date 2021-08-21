package Guia_7_COL_Ejercicio_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Student newStudent() {
        Student s = new Student();
        System.out.println("Creating new student!\nName:");
        s.setName(sc.next());
        System.out.println("Enter the three grades: ");
        s.getNotes().add(sc.nextInt());
        s.getNotes().add(sc.nextInt());
        s.getNotes().add(sc.nextInt());
        sc.nextLine();
        return s;
    }

    public void createStudent(ArrayList<Student> s) {
        String op;
        do {
            System.out.println("Do you want to create a new student? (y/n)");
            op = sc.nextLine();
            switch (op) {
                case "y":
                    s.add(newStudent());
                    break;
                case "n":
                    System.out.println("All the students were entered.");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        } while (!op.equals("n"));
    }

    public void calculateFinal(ArrayList<Student> s) {
        System.out.println("Enter a student to calculate the average final grade:");
        String S = sc.nextLine();
        double finalAve = 0;
        boolean aux = false;
        for (Student student : s) {
            if (S.equals(student.getName())) {
                double sum = 0;
                for (Integer num : student.getNotes()) {
                    sum += num;
                }
                finalAve = sum / student.getNotes().size();
                aux = true;
                break;
            }
        }
        if (aux == true) {
            System.out.print("Average final grade: ");
            System.out.printf("%1.2f%n",  finalAve);
        } else {
            System.out.println("Couldn't find the student!");
        }
    }
}
