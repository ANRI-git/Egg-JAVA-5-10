package Guia_7_COL_Ejercicio_03;

import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList();

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNotes() {
        return grades;
    }

    public void setNotes(ArrayList<Integer> notes) {
        this.grades = notes;
    }
    
}
