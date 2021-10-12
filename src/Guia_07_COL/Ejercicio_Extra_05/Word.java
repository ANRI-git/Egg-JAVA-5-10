package Guia_07_COL.Ejercicio_Extra_05;

import java.util.ArrayList;

public class Word {

    private ArrayList<String> list = new ArrayList<>();

    public Word() {
    }

    public Word(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

}
