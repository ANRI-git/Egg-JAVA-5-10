package Guia_7_COL_Ejercicio_03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        Service serv = new Service();
        
        serv.createStudent(students);
        serv.calculateFinal(students);
    }

}
