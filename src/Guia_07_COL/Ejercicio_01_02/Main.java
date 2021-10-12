package Guia_07_COL.Ejercicio_01_02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Service serv = new Service();
        Dogs d = new Dogs();
        serv.createDogs(d);
        serv.deleteRace(d);
    }

}
